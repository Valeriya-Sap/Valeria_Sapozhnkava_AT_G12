package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class BookingHoverCurrencySteps {
    private static final Logger LOGGER = LogManager.getLogger(BookingHoverCurrencySteps.class);
    BookingSearchPage searchPage = new BookingSearchPage();

    @Given("I open a site Booking")
    public void openSite() {
        searchPage.openBooking();
        LOGGER.debug("Step Given is finished");
    }

    @When("I hover icon Currency")
    public void fillSearch() {
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify the tooltip Currency")
    public void verifyResult() {
        String actualCurrencyTooltip = searchPage.getCurrencyTooltipValue();
        String expectedCurrencyTooltip = "Выберите валюту";
        assertEquals(expectedCurrencyTooltip, actualCurrencyTooltip);
        LOGGER.debug("Step Then is finished");
    }
}
