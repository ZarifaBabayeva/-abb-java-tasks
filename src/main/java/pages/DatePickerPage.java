package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DatePickerPage extends BasePage {

    private final By dateInput = By.id("datePicker");
    private final By dateTimeInput = By.id("dateTimePicker");
    private final By dateNote = By.id("dateNote");
    private final By dateTimeNote = By.id("dateTimeNote");

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    public void bolmeyeGec() {
        menyuAc("Date Picker");
    }

    public void tarixTeyinEt(String tarix) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(dateInput));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));", el, tarix);
    }

    public void tarixVeSaatTeyinEt(String tarixSaat) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(dateTimeInput));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));", el, tarixSaat);
    }

    public String getTarixNeticesi() {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(dateNote, "yoxdur")));
        return metniOxu(dateNote);
    }

    public String getTarixSaatNeticesi() {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(dateTimeNote, "yoxdur")));
        return metniOxu(dateTimeNote);
    }
}