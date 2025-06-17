package taf.tests.testng;

import org.testng.annotations.Test;
import taf.pages.booking.VoidPOBookingResultsPage;
import taf.pages.booking.VoidPOBookingSearchPage;

import java.time.LocalDate;

import static org.testng.AssertJUnit.assertEquals;


public class BookingParisTestngTests {
    @Test
    public void testParis() {
        VoidPOBookingSearchPage searchPage = new VoidPOBookingSearchPage();
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

        VoidPOBookingResultsPage resultsPage = new VoidPOBookingResultsPage();
       // resultsPage.refuseLogIn();
        resultsPage.sortByRatingAsc();
        resultsPage.filterByRatingFive();
        String actualRate = resultsPage.getFirstHotelRating();
        String expectedRate = "5 из 5";
        assertEquals (expectedRate, actualRate);
    }
}
