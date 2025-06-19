package homework.taf.tests.testng;

import org.junit.Test;
import homework.taf.pages.booking.VoidPOBookingHotelPage;
import homework.taf.pages.booking.VoidPOBookingResultsPage;
import homework.taf.pages.booking.VoidPOBookingSearchPage;

import static org.testng.Assert.assertTrue;

public class BookingPragueTestngTests {
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
