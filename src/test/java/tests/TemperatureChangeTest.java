package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class TemperatureChangeTest extends BaseTest {

    @Test
    public void testTempChange() {
        SliderPage page = new SliderPage(driver);

        page.setTemperature("25");

        Assert.assertEquals(page.getTemperatureText(), "25°C", "Temperature 25°C deyil!");
    }
}