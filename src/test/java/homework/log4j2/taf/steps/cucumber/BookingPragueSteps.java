package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.pages.booking.BookingHotelPage;
import homework.log4j2.taf.pages.booking.BookingResultsPage;
import homework.log4j2.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertTrue;

public class BookingPragueSteps {
    private BookingSearchPage searchPage = new BookingSearchPage();
    private BookingResultsPage resultsPage = new BookingResultsPage();
    private BookingHotelPage hotelPage = new BookingHotelPage();
    private static final Logger LOGGER = LogManager.getLogger(BookingPragueSteps.class);


    @Given("I open a site Prague")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        LOGGER.debug("Step Given is finished");
    }

    @When("I fill the search form Prague")
    public void fillSearch() {
        searchPage.enterCity("Прага");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
        resultsPage.filterByNinePlus();
        resultsPage.openFirstHotel();
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify that first hotel has rate 9+")
    public void verifyResult() {
        double actualRate = hotelPage.getHotelRating();
        double expectedRate = 9;
        assertTrue(actualRate >= expectedRate);
        LOGGER.debug("Step Then is finished");
    }
}

