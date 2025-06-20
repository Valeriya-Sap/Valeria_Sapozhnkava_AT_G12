package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class BookingHoverLanguageSteps {
    BookingSearchPage searchPage = new BookingSearchPage();
    private static final Logger LOGGER = LogManager.getLogger(BookingHoverLanguageSteps.class);

    @Given("I open a site Booking2")
    public void openSite() {
        searchPage.openBooking();
        LOGGER.debug("Step Given is finished");
    }

    @When("I hover icon Language")
    public void fillSearch() {
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify the tooltip Language")
    public void verifyResult() {
        String actualLanguageTooltip = searchPage.getLanguageTooltipValue();
        String expectedLanguageTooltip = "Выберите язык";
        assertEquals(expectedLanguageTooltip, actualLanguageTooltip);
        LOGGER.debug("Step Then is finished");
    }
}
