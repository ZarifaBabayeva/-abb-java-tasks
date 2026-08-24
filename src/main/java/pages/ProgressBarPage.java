package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgressBarPage extends BasePage {

    private final By startBtn = By.id("pgStart");
    private final By stopBtn = By.id("pgStop");
    private final By resetBtn = By.id("pgReset");
    private final By pgValueText = By.id("pgVal"); // "0%", "50%" və s.
    private final By pgBarElement = By.id("pgBar"); // aria-valuenow atributu olan element

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    public void bolmeyeGec() {
        menyuAc("Progress Bar");
    }

    public void startBas() { klik(startBtn); }
    public void stopBas() { klik(stopBtn); }
    public void resetBas() { klik(resetBtn); }

    public int getProqresFaizi() {
        String val = wait.until(ExpectedConditions.presenceOfElementLocated(pgBarElement))
                .getAttribute("aria-valuenow");
        return Integer.parseInt(val);
    }

    public String getFaizMetni() {
        return metniOxu(pgValueText);
    }

    public void artimiGozle() {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(pgBarElement, "aria-valuenow", "0")));
    }
}
