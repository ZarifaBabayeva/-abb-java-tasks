package tests;

import base.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProgressBarPage;
import java.time.Duration;

public class ProgressBarTest extends BaseTest {

    @Test(priority = 3, description = "Test 3 — Başlanğıc Vəziyyət")
    public void baslangicVeziyyetTesti() {
        ProgressBarPage pgPage = new ProgressBarPage(driver);
        pgPage.bolmeyeGec();

        Assert.assertEquals(pgPage.getFaizMetni(), "0%", "Başlanğıc 0% olmalıdır!");
    }

    @Test(priority = 4, description = "Test 4 — Proqresin Artması")
    public void artmaTesti() {
        ProgressBarPage pgPage = new ProgressBarPage(driver);
        pgPage.bolmeyeGec();

        pgPage.startBas();
        pgPage.artimiGozle(); // 0% olana qədər gözləyirik

        int cariFaiz = pgPage.getProqresFaizi();
        Assert.assertTrue(cariFaiz > 0, "Proqres artmadı!");
    }

    @Test(priority = 5, description = "Test 5 — Dayandırma")
    public void dayandirmaTesti() {
        ProgressBarPage pgPage = new ProgressBarPage(driver);
        pgPage.bolmeyeGec();

        pgPage.startBas();
        pgPage.artimiGozle();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> pgPage.getProqresFaizi() > 20);

        pgPage.stopBas();
        int dayandigiAndakiFaiz = pgPage.getProqresFaizi();

        try {
            new WebDriverWait(driver, Duration.ofSeconds(2))
                    .until(d -> pgPage.getProqresFaizi() > dayandigiAndakiFaiz);
            Assert.fail("Stop basılsa da proqres davam etdi!");
        } catch (Exception e) {
            // Gözlənilən budur: Timeout olmalıdır, yəni faiz artmamalıdır
            Assert.assertEquals(pgPage.getProqresFaizi(), dayandigiAndakiFaiz, "Dayandıqdan sonra dəyər dəyişdi!");
        }
    }

    @Test(priority = 6, description = "Test 6 — Sıfırlama")
    public void sifirlamaTesti() {
        ProgressBarPage pgPage = new ProgressBarPage(driver);
        pgPage.bolmeyeGec();

        pgPage.startBas();
        pgPage.artimiGozle();
        pgPage.stopBas();

        pgPage.resetBas();

        Assert.assertEquals(pgPage.getFaizMetni(), "0%", "Sıfırlamadan sonra 0% olmadı!");
    }
}
