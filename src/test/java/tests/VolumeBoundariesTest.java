package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class VolumeBoundariesTest extends BaseTest {
    @Test
    public void testVolBoundaries() {
        SliderPage page = new SliderPage(driver);
        // Min
        page.setVolume("0");
        Assert.assertEquals(page.getVolumeText(), "0%");
        // Max
        page.setVolume("100");
        Assert.assertEquals(page.getVolumeText(), "100%");
    }
}