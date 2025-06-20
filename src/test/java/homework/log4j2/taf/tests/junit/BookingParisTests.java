package homework.log4j2.taf.tests.junit;

import homework.log4j2.taf.base.postcondition.JUnitConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import homework.log4j2.taf.pages.booking.BookingResultsPage;
import homework.log4j2.taf.pages.booking.BookingSearchPage;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisTests extends JUnitConditions {
    private static final Logger LOGGER = LogManager.getLogger(BookingParisTests.class);
    @Test
    public void testParis() {
        BookingSearchPage searchPage = new BookingSearchPage();
        BookingResultsPage resultsPage = new BookingResultsPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("Париж");
        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        searchPage.selectDates(checkInDate, checkOutDate);
        searchPage.enterAdultsNumber(4);
        searchPage.enterRoomNumber(2);
        searchPage.clickSubmit();
        resultsPage.sortByRatingAsc();
        resultsPage.filterByRatingFive();
        String actualRate = resultsPage.getFirstHotelRating();
        String expectedRate = "5 из 5";
        assertEquals (expectedRate, actualRate);
        LOGGER.debug("Test passed");
    }
}
