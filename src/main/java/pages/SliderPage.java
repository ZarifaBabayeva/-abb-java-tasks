package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SliderPage extends BasePage {

    private final By tempSlider = By.id("tempSlider");
    private final By volSlider  = By.id("volSlider");
    private final By tempValLabel = By.id("tempVal");
    private final By volValLabel  = By.id("volVal");

    public SliderPage(WebDriver driver) {
        super(driver);
        menyuAc("Sliders");
    }

    public SliderPage setTemperature(String value) {
        sliderDeyis(tempSlider, value);
        return this;
    }

    public SliderPage setVolume(String value) {
        sliderDeyis(volSlider, value);
        return this;
    }

    public String getTemperatureText() {
        return driver.findElement(tempValLabel).getText();
    }

    public String getVolumeText() {
        return driver.findElement(volValLabel).getText();
    }
}