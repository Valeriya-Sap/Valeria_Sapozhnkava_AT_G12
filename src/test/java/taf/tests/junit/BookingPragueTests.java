package taf.tests.junit;

import org.junit.Test;
import taf.pages.booking.VoidPOBookingHotelPage;
import taf.pages.booking.VoidPOBookingResultsPage;
import taf.pages.booking.VoidPOBookingSearchPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingPragueTests {
    @Test
    public void testPrague() {
        VoidPOBookingSearchPage searchPage = new VoidPOBookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("Прага");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();

        VoidPOBookingResultsPage resultsPage = new VoidPOBookingResultsPage();

        resultsPage.filterByNinePlus();
        resultsPage.openFirstHotel();
        VoidPOBookingHotelPage hotelPage = new VoidPOBookingHotelPage();
        double actualRate = hotelPage.getHotelRating();
        double expectedRate = 9;
        assertTrue(actualRate >= expectedRate);
    }
}
