package taf.tests.junit;

import org.junit.Test;
import taf.pages.booking.VoidPOBookingSearchPage;

import static org.junit.Assert.assertEquals;

public class BookingHoverTests {
    @Test
    public void testHover() {
        VoidPOBookingSearchPage searchPage = new VoidPOBookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        String actualCurrencyTooltip = searchPage.getCurrencyTooltipValue();
        String expectedCurrencyTooltip = "Выберите валюту";
        assertEquals(expectedCurrencyTooltip, actualCurrencyTooltip);
        String actualLanguageTooltip = searchPage.getLanguageTooltipValue();
        String expectedLanguageTooltip = "Выберите язык";
        assertEquals(expectedLanguageTooltip, actualLanguageTooltip);
    }
}
