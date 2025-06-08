package day17_03_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MyBooking {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']")).click();
        driver.findElement(By.xpath("//span[@data-date='2025-06-06']")).click();
        driver.findElement(By.xpath("//span[@data-date='2025-06-13']")).click();
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement adults = driver.findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]"));
        adults.click();
        adults.click();

    }
}
