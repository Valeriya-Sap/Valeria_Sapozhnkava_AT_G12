package day17_03_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MyDemoqa {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Перейти на сайт https://demoqa.com/select-menu
        driver.get("https://demoqa.com/select-menu");


        // 2. Выбрать любое значение в каждом из выпадающих списков
        // 2.1 Select value
        driver.findElement(By.xpath("//div[text()='Select Option']")).click();
        driver.findElement(By.xpath("//div[text()='Group 1, option 1']")).click();

        // 2.2 Select One
        driver.findElement(By.xpath("//div[text()='Select Title']")).click();
        driver.findElement(By.xpath("//div[text()='Dr.']")).click();

        // 2.3 Old Style Select Menu
        driver.findElement(By.xpath("//div[@id='selectMenuContainer']/div[6]")).click();
        driver.findElement(By.xpath("//*[text()='Black']")).click();

        // 2.4 Multiselect drop down
        driver.findElement(By.xpath("//div[text()='Select...']")).click();
        driver.findElement(By.xpath("//div[text()='Green']")).click();

        // 2.5 Standard multi select
        driver.findElement(By.xpath("//*[text()='Volvo']")).click();


    }
}
