package utils;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class TokenManager {
    public static String getToken() {
        return given()
                .contentType(ContentType.JSON)
                .body("{\"email\": \"admin@test.com\", \"password\": \"Admin1234\"}")
                .post("https://api.anarabbas.com/auth/login")
                .then()
                .statusCode(200)
                .extract().path("token");
    }
}