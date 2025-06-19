package homework.taf.tests.testng;

import org.testng.annotations.Test;
import homework.taf.pages.booking.VoidPOBookingSearchPage;

import static org.testng.AssertJUnit.assertEquals;

public class BookingHoverTestngTests {
    @Test
    public void testHover() {
        VoidPOBookingSearchPage searchPage = new VoidPOBookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        String actualCurrencyTooltip = searchPage.getCurrencyTooltipValue();
        String expectedCurrencyTooltip = "Выберите валюту";
        assertEquals(expectedCurrencyTooltip,actualCurrencyTooltip);
        String actualLanguageTooltip = searchPage.getLanguageTooltipValue();
        String expectedLanguageTooltip = "Выберите язык";
        assertEquals(expectedLanguageTooltip,actualLanguageTooltip);
    }
}
