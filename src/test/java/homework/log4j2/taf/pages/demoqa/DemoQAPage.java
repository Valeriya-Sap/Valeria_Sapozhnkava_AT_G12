package homework.log4j2.taf.pages.demoqa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import homework.log4j2.taf.driver.Driver;

public class DemoQAPage {
    private static final Logger LOGGER = LogManager.getLogger(DemoQAPage.class);
    WebDriver driver = Driver.getDriver();

    private static String SELECT_OPTION_XPATH = "//div[text()='Select Option']";
    private static String GROUP1_OPTION1_XPATH = "//div[text()='Group 1, option 1']";
    private static String SELECT_TITLE_XPATH = "//div[text()='Select Title']";
    private static String OPTION_DR_XPATH = "//div[text()='Dr.']";
    private static String SELECT_MENU_XPATH = "//div[@id='selectMenuContainer']/div[6]";
    private static String OPTION_BLACK_XPATH = "//*[text()='Black']";
    private static String SELECT_MULTISELECT_XPATH = "//div[text()='Select...']";
    private static String OPTION_GREEN_XPATH = "//div[text()='Green']";
    private static String OPTION_VOLVO_XPATH = "//*[text()='Volvo']";

    public DemoQAPage() {

    }

    public void openDemoQA() {
        driver.get("https://demoqa.com/select-menu");
        LOGGER.trace("DemoQA is opened.");
    }

    public void selectOption() {
        driver.findElement(By.xpath(SELECT_OPTION_XPATH)).click();
        driver.findElement(By.xpath(GROUP1_OPTION1_XPATH)).click();
        LOGGER.trace("Element selected in selector xpath{}",GROUP1_OPTION1_XPATH);
    }

    public void selectTitle() {
        driver.findElement(By.xpath(SELECT_TITLE_XPATH)).click();
        driver.findElement(By.xpath(OPTION_DR_XPATH)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_DR_XPATH);
    }

    public void selectMenu() {
        driver.findElement(By.xpath(SELECT_MENU_XPATH)).click();
        driver.findElement(By.xpath(OPTION_BLACK_XPATH)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_BLACK_XPATH);
    }

    public void selectMultiselect() {
        driver.findElement(By.xpath(SELECT_MULTISELECT_XPATH)).click();
        driver.findElement(By.xpath(OPTION_GREEN_XPATH)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_GREEN_XPATH);
    }

    public void selectStandardMultiselect() {
        driver.findElement(By.xpath(OPTION_VOLVO_XPATH)).click();
        LOGGER.trace("Element selected in selector xpath{}",OPTION_VOLVO_XPATH);
    }
}
