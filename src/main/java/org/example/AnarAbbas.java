package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AnarAbbas {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("http://anarabbas.com/labs/auto-lab");

            // --- 1. TEXT BOX ---
            WebElement textBoxMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(.,'Text Box')]")));
            // Elementə fokuslanaraq scroll (ən etibarlı yol)
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", textBoxMenu);
            Thread.sleep(1000);
            textBoxMenu.click();

            WebElement fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
            fullName.clear();
            fullName.sendKeys("Zərifə Babayeva");

            WebElement email = driver.findElement(By.id("userEmail"));
            email.clear();
            email.sendKeys("zarifa@test.az");

            WebElement submitBtn = driver.findElement(By.id("submit"));
            // Müəllimin istədiyi: Elementi mərkəzə gətir
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", submitBtn);
            Thread.sleep(1000);
            submitBtn.click();
            System.out.println("Text Box tamamlandı.");

            // --- 2. BUTTONS ---
            WebElement buttonsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(.,'Buttons')]")));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", buttonsMenu);
            Thread.sleep(1000);
            buttonsMenu.click();

            WebElement primaryBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("clickBtn")));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", primaryBtn);
            Thread.sleep(1000);
            primaryBtn.click();
            System.out.println("Primary Click tamamlandı.");

            // --- 3. MÜƏLLİMİN İSTƏDİYİ KONTEYNER SCROLL-U (DÜZƏLİŞ) ---
            System.out.println("Konteyner daxili scroll icra olunur...");

            try {
                // Müəllimin dediyi üsul: Birbaşa container div-ni tapıb onun içini scroll edirik
                js.executeScript("var container = document.querySelector('.container') || document.querySelector('.pg'); " +
                        "if(container) { container.scrollTop = container.scrollHeight; }");
                Thread.sleep(1500);

                // Yenidən yuxarı qalxmaq üçün
                js.executeScript("var container = document.querySelector('.container') || document.querySelector('.pg'); " +
                        "if(container) { container.scrollTop = 0; }");
                System.out.println("Konteyner scroll-u uğurlu.");
            } catch (Exception e) {
                // Əgər konteyner tapılmasa, aqressiv element scroll-u et:
                WebElement footer = driver.findElement(By.xpath("//footer | //div[contains(@class,'footer')]"));
                js.executeScript("arguments[0].scrollIntoView(true);", footer);
            }

        } catch (Exception e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        } finally {
            // driver.quit(); // Müəllim görənə qədər açıq qalsın
        }
    }
}