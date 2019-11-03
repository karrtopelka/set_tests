package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass
    public void openURL() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:/Downloads/cd/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void contactUsTest() throws InterruptedException {
        WebElement searchButton = driver.findElement(By.cssSelector("div > ul > li > a[href$=\"contact\"]"));
        searchButton.click();
        WebElement yourName = driver.findElement(By.xpath("//input[contains(@id,'input-name')]"));
        yourName.sendKeys("Max");
        Thread.sleep(2000);
        WebElement yourEmail = driver.findElement(By.xpath("//input[contains(@id,'input-email')]"));
        yourEmail.sendKeys("Karrtopelka@gmail.com");
        Thread.sleep(2000);
        WebElement yourEnquiry = driver.findElement(By.xpath("//textarea[contains(@id,'input-enquiry')]"));
        yourEnquiry.sendKeys("Hi I love my dog and cat and love loving with love");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.xpath("//div[contains(@class, 'pull-right')]/input"));
        submitButton.click();
        Thread.sleep(2000);
        WebElement contButton = driver.findElement(By.cssSelector("a[href$=\"home\"]"));
        contButton.click();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}