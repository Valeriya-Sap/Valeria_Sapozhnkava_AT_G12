package homework.taf.steps.cucumber;

import homework.taf.pages.demoqa.DemoQAPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQASteps {
    DemoQAPage mainPage = new DemoQAPage();

    @Given("I open a site DemoQA")
    public void openSite() {
        mainPage.openDemoQA();
    }

    @When("I select all")
    public void fillSelectors() {
        mainPage.selectOption();
        mainPage.selectTitle();
        mainPage.selectMenu();
        mainPage.selectMultiselect();
    }

    @Then("I verify all")
    public void verifyAll() {
        mainPage.selectStandardMultiselect();
    }


}
