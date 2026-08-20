
package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;
public class DefaultValuesTest extends BaseTest {
    @Test
    public void testDefaultValues() {
        SliderPage page = new SliderPage(driver);
        Assert.assertEquals(page.getTemperatureText(), "50°C");
        Assert.assertEquals(page.getVolumeText(), "75%");
    }
}