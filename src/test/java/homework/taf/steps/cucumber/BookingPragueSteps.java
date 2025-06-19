package homework.taf.steps.cucumber;

import homework.taf.pages.booking.BookingHotelPage;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class BookingPragueSteps {
    private BookingSearchPage searchPage = new BookingSearchPage();
    private BookingResultsPage resultsPage = new BookingResultsPage();
    private BookingHotelPage hotelPage = new BookingHotelPage();


    @Given("I open a site Prague")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
    }

    @When("I fill the search form Prague")
    public void fillSearch() {
        searchPage.enterCity("Прага");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
        resultsPage.filterByNinePlus();
        resultsPage.openFirstHotel();
    }

    @Then("I verify that first hotel has rate 9+")
    public void verifyResult() {
        double actualRate = hotelPage.getHotelRating();
        double expectedRate = 9;
        assertTrue(actualRate >= expectedRate);
    }
}

