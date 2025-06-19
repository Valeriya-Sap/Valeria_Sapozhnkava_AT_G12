package homework.taf.tests.junit;

import homework.taf.base.postcondition.JUnitPostcondition;
import homework.taf.base.precondition.JUnitPrecondition;
import org.junit.Test;
import homework.taf.pages.booking.BookingHotelPage;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;


import static org.junit.Assert.assertTrue;

public class BookingPragueTests extends JUnitPostcondition {
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
