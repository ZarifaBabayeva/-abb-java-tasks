/*package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class TemperatureBoundariesTest extends BaseTest {
    @Test
    public void testTempBoundaries() {
        SliderPage page = new SliderPage(driver);
        // Min
        page.setTemperature("0");
        Assert.assertEquals(page.getTemperatureText(), "0°C");
        // Max
        page.setTemperature("100");
        Assert.assertEquals(page.getTemperatureText(), "100°C");
    }
}
*/