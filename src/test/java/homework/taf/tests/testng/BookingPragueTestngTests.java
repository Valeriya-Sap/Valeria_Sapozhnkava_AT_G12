package homework.taf.tests.testng;

import homework.taf.base.postcondition.TestNGPostcondition;

import homework.taf.pages.booking.BookingHotelPage;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BookingPragueTestngTests extends TestNGPostcondition {
    @Test
    public void testPrague() {
        BookingSearchPage searchPage = new BookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("Прага");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();

        BookingResultsPage resultsPage = new BookingResultsPage();

        resultsPage.filterByNinePlus();
        resultsPage.openFirstHotel();
        BookingHotelPage hotelPage = new BookingHotelPage();
        double actualRate = hotelPage.getHotelRating();
        double expectedRate = 9;
        assertTrue(actualRate >= expectedRate);
    }
}
