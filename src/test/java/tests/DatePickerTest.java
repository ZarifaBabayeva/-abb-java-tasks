package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest {

    @Test
    public void tarixSecimiTesti() {
        DatePickerPage datePage = new DatePickerPage(driver);
        datePage.bolmeyeGec();

        String testTarixi = "2026-10-20";
        datePage.tarixTeyinEt(testTarixi);

        String netice = datePage.getTarixNeticesi();
        System.out.println("Gələn nəticə: " + netice);
        Assert.assertTrue(netice.contains(testTarixi), "Tarix tapılmadı!");
    }

    @Test
    public void tarixVeSaatSecimiTesti() {
        DatePickerPage datePage = new DatePickerPage(driver);
        datePage.bolmeyeGec();

        String testTarixSaat = "2026-12-31T23:59";
        datePage.tarixVeSaatTeyinEt(testTarixSaat);

        String netice = datePage.getTarixSaatNeticesi();
        System.out.println("Gələn nəticə: " + netice);
        Assert.assertTrue(netice.contains("2026-12-31"), "Tarix hissəsi səhvdir!");
    }
}