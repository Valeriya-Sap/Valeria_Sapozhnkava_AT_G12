package homework.taf.tests.junit;

import homework.taf.base.postcondition.JUnitPostcondition;
import homework.taf.base.precondition.JUnitPrecondition;
import org.junit.Test;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisTests extends JUnitPostcondition {
    @Test
    public void testParis() {
        BookingSearchPage searchPage = new BookingSearchPage();
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

        BookingResultsPage resultsPage = new BookingResultsPage();
       // resultsPage.refuseLogIn();
        resultsPage.sortByRatingAsc();
        resultsPage.filterByRatingFive();
        String actualRate = resultsPage.getFirstHotelRating();
        String expectedRate = "5 из 5";
        assertEquals (expectedRate, actualRate);
    }
}
