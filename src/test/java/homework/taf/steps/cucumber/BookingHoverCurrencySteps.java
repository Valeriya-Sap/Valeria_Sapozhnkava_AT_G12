package homework.taf.steps.cucumber;

import homework.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BookingHoverCurrencySteps {
    BookingSearchPage searchPage = new BookingSearchPage();

    @Given("I open a site Booking")
    public void openSite() {
        searchPage.openBooking();
    }

    @When("I hover icon Currency")
    public void fillSearch() {
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
    }

    @Then("I verify the tooltip Currency")
    public void verifyResult() {
        String actualCurrencyTooltip = searchPage.getCurrencyTooltipValue();
        String expectedCurrencyTooltip = "Выберите валюту";
        assertEquals(expectedCurrencyTooltip, actualCurrencyTooltip);
    }
}
