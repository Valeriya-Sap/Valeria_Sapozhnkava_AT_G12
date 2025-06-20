package homework.log4j2.taf.tests.testng;

import homework.log4j2.taf.base.postcondition.TestNGConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import homework.log4j2.taf.pages.booking.BookingSearchPage;

import static org.testng.AssertJUnit.assertEquals;

public class BookingHoverTestngTests extends TestNGConditions{
    private static final Logger LOGGER = LogManager.getLogger(BookingHoverTestngTests.class);
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
        LOGGER.debug("Test passed");
    }
}
