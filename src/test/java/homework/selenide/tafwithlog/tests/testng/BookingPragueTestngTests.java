package homework.selenide.tafwithlog.tests.testng;

import homework.selenide.tafwithlog.base.postcondition.TestNGConditions;

import homework.selenide.tafwithlog.pages.booking.BookingHotelPage;
import homework.selenide.tafwithlog.pages.booking.BookingResultsPage;
import homework.selenide.tafwithlog.pages.booking.BookingSearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BookingPragueTestngTests extends TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(BookingPragueTestngTests.class);

    @Test
    public void testPrague() {
        BookingSearchPage searchPage = new BookingSearchPage();
        BookingResultsPage resultsPage = new BookingResultsPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("Прага");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
        resultsPage.filterByNinePlus();
        resultsPage.openFirstHotel();
        BookingHotelPage hotelPage = new BookingHotelPage();
        double actualRate = hotelPage.getHotelRating();
        double expectedRate = 9;
        assertTrue(actualRate >= expectedRate);
        LOGGER.debug("Test passed");
    }
}
