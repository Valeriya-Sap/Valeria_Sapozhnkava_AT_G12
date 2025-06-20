package homework.selenide.tafwithlog.pages.demoqa;

import com.codeborne.selenide.Condition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class DemoQAPage {
    private static final Logger LOGGER = LogManager.getLogger(DemoQAPage.class);

    private static String SELECT_OPTION_XPATH = "//div[text()='Select Option']";
    private static String GROUP1_OPTION1_XPATH = "//div[text()='Group 1, option 1']";
    private static String SELECT_TITLE_XPATH = "//div[text()='Select Title']";
    private static String OPTION_DR_XPATH = "//div[text()='Dr.']";
    private static String SELECT_MENU_XPATH = "//div[@id='selectMenuContainer']/div[6]";
    private static String OPTION_BLACK_XPATH = "//*[text()='Black']";
    private static String SELECT_MULTISELECT_XPATH = "//div[text()='Select...']";
    private static String OPTION_GREEN_XPATH = "//div[text()='Green']";
    private static String OPTION_VOLVO_XPATH = "//*[text()='Volvo']";

    public DemoQAPage() {}

    public void openDemoQA() {
        open("https://demoqa.com/select-menu");
        LOGGER.trace("DemoQA is opened.");
    }

    public void selectOption() {
        $x(SELECT_OPTION_XPATH).click();
        $x(GROUP1_OPTION1_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        LOGGER.trace("Element selected in selector xpath{}",GROUP1_OPTION1_XPATH);
    }

    public void selectTitle() {
        $x(SELECT_TITLE_XPATH).click();
        $x(OPTION_DR_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_DR_XPATH);
    }

    public void selectMenu() {
        $x(SELECT_MENU_XPATH).click();
        $x(OPTION_BLACK_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_BLACK_XPATH);
    }

    public void selectMultiselect() {
        $x(SELECT_MULTISELECT_XPATH).click();
        LOGGER.trace("Element selected in selector xpath{}",SELECT_MULTISELECT_XPATH);
        $x(OPTION_GREEN_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_GREEN_XPATH);
    }

    public void selectStandardMultiselect() {
        $x(OPTION_VOLVO_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_VOLVO_XPATH);
    }
}
