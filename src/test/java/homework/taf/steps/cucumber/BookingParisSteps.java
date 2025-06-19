package homework.taf.steps.cucumber;

import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisSteps {
    private BookingSearchPage searchPage = new BookingSearchPage();
    private BookingResultsPage resultsPage = new BookingResultsPage();

    @Given("I open a site")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
    }

    @When("I fill the search form")
    public void fillSearch() {
        searchPage.enterCity("Париж");
        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        searchPage.selectDates(checkInDate, checkOutDate);
        searchPage.enterAdultsNumber(4);
        searchPage.enterRoomNumber(2);
        searchPage.clickSubmit();
        resultsPage.sortByRatingAsc();
        resultsPage.filterByRatingFive();
    }

    @Then("I verify that first hotel has rate 5")
    public void verifyResult() {
        String actualRate = resultsPage.getFirstHotelRating();
        String expectedRate = "5 из 5";
        assertEquals(expectedRate, actualRate);
    }
}
