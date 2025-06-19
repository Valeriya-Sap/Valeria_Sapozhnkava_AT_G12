package homework.taf.tests.junit;

import homework.taf.base.postcondition.JUnitPostcondition;
import homework.taf.base.precondition.JUnitPrecondition;
import homework.taf.driver.Driver;
import org.junit.Test;
import homework.taf.pages.booking.BookingSearchPage;

import static org.junit.Assert.assertEquals;

public class BookingHoverTests extends JUnitPostcondition {
    @Test
    public void testHover() {
        BookingSearchPage searchPage = new BookingSearchPage();
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
