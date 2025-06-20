package homework.log4j2.taf.tests.junit;

import homework.log4j2.taf.base.postcondition.JUnitConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import homework.log4j2.taf.pages.booking.BookingSearchPage;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookingHoverTests extends JUnitConditions{
    private static final Logger LOGGER = LogManager.getLogger(BookingHoverTests.class);
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
        LOGGER.debug("Test passed");
    }
}
