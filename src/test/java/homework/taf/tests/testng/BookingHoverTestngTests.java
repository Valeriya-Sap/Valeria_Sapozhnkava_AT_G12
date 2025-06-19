package homework.taf.tests.testng;

import homework.taf.base.postcondition.TestNGPostcondition;
import org.testng.annotations.Test;
import homework.taf.pages.booking.BookingSearchPage;

import static org.testng.AssertJUnit.assertEquals;

public class BookingHoverTestngTests extends TestNGPostcondition {
    @Test
    public void testHover() {
        BookingSearchPage searchPage = new BookingSearchPage();
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
