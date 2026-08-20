package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class VolumeChangeTest extends BaseTest {
    @Test
    public void testVolumeChange() {
        SliderPage page = new SliderPage(driver);
        page.setVolume("40");
        Assert.assertEquals(page.getVolumeText(), "40%");
    }
}