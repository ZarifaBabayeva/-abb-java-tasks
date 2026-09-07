package test;

import base.BaseTest;
import io.restassured.http.ContentType;
import model.UserRequest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.TokenManager;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTest extends BaseTest {
    String token;
    String createdUserId;

    @BeforeClass
    public void getAuthToken() {
        token = TokenManager.getToken();
    }

    // 01. Siyahının strukturu
    @Test
    public void test01_GetAllUsersStructure() {
        get("/users")
                .then()
                .statusCode(200)
                .body("$", instanceOf(java.util.List.class)) // Array formatı
                .body("[0]", hasKey("id"))
                .body("[0]", hasKey("name"))
                .body("[0]", hasKey("email"));
    }

    // 02. Tək istifadəçi — mövcud və mövcud olmayan
    @Test
    public void test02_GetSingleUser() {
        // Mövcud (ID: 1 adətən həmişə olur)
        get("/users/1")
                .then()
                .statusCode(200)
                .body("id", notNullValue());

        // Mövcud olmayan
        get("/users/999999")
                .then()
                .statusCode(404);
    }

    // 03. Yeni istifadəçi yaratmaq (Pozitiv və Neqativ)
    @Test
    public void test03_CreateUser() {
        UserRequest newUser = new UserRequest("QA Tester", "qa" + System.currentTimeMillis() + "@test.com", "user");

        // Pozitiv
        createdUserId = given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(newUser)
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo(newUser.name))
                .extract().path("id").toString();

        // Neqativ (email buraxılaraq)
        UserRequest invalidUser = new UserRequest("No Email", null, "user");
        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(invalidUser)
                .post("/users")
                .then()
                .statusCode(400);
    }

    // 04. Mövcud istifadəçini yeniləmək
    @Test(dependsOnMethods = "test03_CreateUser")
    public void test04_UpdateUser() {
        UserRequest updateData = new UserRequest("Updated Name", null, null);

        // Pozitiv yeniləmə
        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(updateData)
                .put("/users/" + createdUserId)
                .then()
                .statusCode(200)
                .body("name", equalTo("Updated Name"));

        // GET ilə yoxlama
        get("/users/" + createdUserId).then().body("name", equalTo("Updated Name"));

        // Mövcud olmayan ID-ni yeniləmək
        given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(updateData)
                .put("/users/invalid_id_123")
                .then()
                .statusCode(404);
    }

    // 05. İstifadəçini silmək
    @Test(dependsOnMethods = "test04_UpdateUser")
    public void test05_DeleteUser() {
        // Silmə
        given()
                .header("Authorization", "Bearer " + token)
                .delete("/users/" + createdUserId)
                .then()
                .statusCode(200);

        // Silindiyini yoxla
        get("/users/" + createdUserId)
                .then()
                .statusCode(404);
    }

    // 06. Bonus — Tam axın (End-to-End)
    @Test
    public void test06_EndToEndFlow() {
        UserRequest e2eUser = new UserRequest("E2E User", "e2e" + System.currentTimeMillis() + "@test.az", "user");

        // 1. Yarat
        String id = given().header("Authorization", "Bearer " + token).contentType(ContentType.JSON).body(e2eUser)
                .post("/users").then().statusCode(201).extract().path("id").toString();

        // 2. GET ilə yoxla
        get("/users/" + id).then().statusCode(200).body("email", equalTo(e2eUser.email));

        // 3. Yenilə
        given().header("Authorization", "Bearer " + token).contentType(ContentType.JSON).body("{\"name\":\"E2E New Name\"}")
                .put("/users/" + id).then().statusCode(200);

        // 4. Yenidən yoxla
        get("/users/" + id).then().statusCode(200).body("name", equalTo("E2E New Name"));

        // 5. Sil
        given().header("Authorization", "Bearer " + token).delete("/users/" + id).then().statusCode(200);

        // 6. Silindiyini təsdiqlə
        get("/users/" + id).then().statusCode(404);
    }
}