package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.pages.demoqa.DemoQAPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoQASteps {
    DemoQAPage mainPage = new DemoQAPage();
    private static final Logger LOGGER = LogManager.getLogger(DemoQASteps.class);

    @Given("I open a site DemoQA")
    public void openSite() {
        mainPage.openDemoQA();
        LOGGER.debug("Step Given is finished");
    }

    @When("I select all")
    public void fillSelectors() {
        mainPage.selectOption();
        mainPage.selectTitle();
        mainPage.selectMenu();
        mainPage.selectMultiselect();
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify all")
    public void verifyAll() {
        mainPage.selectStandardMultiselect();
        LOGGER.debug("Step Then is finished");
    }
}
