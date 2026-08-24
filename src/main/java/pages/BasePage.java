package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void menyuAc(String bolmeAdi) {
        By menyu = By.xpath("//*[contains(text(),'" + bolmeAdi + "')]");
        wait.until(ExpectedConditions.elementToBeClickable(menyu)).click();
    }

    protected void klik(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void yaz(By locator, String metn) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(metn);
    }

    protected String metniOxu(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected void sliderDeyis(By locator, String deyer) {
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; " +
                "arguments[0].dispatchEvent(new Event('input'));", slider, deyer);
    }
}