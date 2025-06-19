package homework.taf.steps.cucumber;

import homework.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BookingHoverLanguageSteps {
    BookingSearchPage searchPage = new BookingSearchPage();

    @Given("I open a site Booking2")
    public void openSite() {
        searchPage.openBooking();
    }

    @When("I hover icon Language")
    public void fillSearch() {
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
    }

    @Then("I verify the tooltip Language")
    public void verifyResult() {
        String actualLanguageTooltip = searchPage.getLanguageTooltipValue();
        String expectedLanguageTooltip = "Выберите язык";
        assertEquals(expectedLanguageTooltip, actualLanguageTooltip);
    }
}
