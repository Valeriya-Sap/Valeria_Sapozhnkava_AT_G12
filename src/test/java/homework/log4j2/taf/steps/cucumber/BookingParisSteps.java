package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.pages.booking.BookingResultsPage;
import homework.log4j2.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BookingParisSteps {
    private BookingSearchPage searchPage = new BookingSearchPage();
    private BookingResultsPage resultsPage = new BookingResultsPage();
    private static final Logger LOGGER = LogManager.getLogger(BookingParisSteps.class);

    @Given("I open a site")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        LOGGER.debug("Step Given is finished");
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
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify that first hotel has rate 5")
    public void verifyResult() {
        String actualRate = resultsPage.getFirstHotelRating();
        String expectedRate = "5 из 5";
        assertEquals(expectedRate, actualRate);
        LOGGER.debug("Step Then is finished");
    }
}
