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
        System.setProperty("webdriver.chrome.driver", "D:/Documents/karrtopelka/learning/SET/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void contactUsTest() throws InterruptedException {
        WebElement searchButton = driver.findElement(By.xpath("//span[text() = 'My Account']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement clickRegister = driver.findElement(By.cssSelector("a[href$=\"register\"]"));
        clickRegister.click();
        WebElement yourName = driver.findElement(By.xpath("//input[contains(@id,'input-firstname')]"));
        yourName.sendKeys("Max");
        Thread.sleep(2000);
        WebElement yourLastName = driver.findElement(By.xpath("//input[contains(@id,'input-lastname')]"));
        yourLastName.sendKeys("Karrtopelka");
        Thread.sleep(2000);
        WebElement yourEmail = driver.findElement(By.xpath("//input[contains(@id,'input-email')]"));
        yourEmail.sendKeys("Karrrrtopelka@gmail.com");
        Thread.sleep(2000);
        WebElement yourPhone = driver.findElement(By.xpath("//input[contains(@id,'input-telephone')]"));
        yourPhone.sendKeys("+380677772558");
        Thread.sleep(2000);
        WebElement yourPassword = driver.findElement(By.xpath("//input[contains(@id,'input-password')]"));
        yourPassword.sendKeys("12345678990");
        Thread.sleep(2000);
        WebElement yourPasswordSecond = driver.findElement(By.xpath("//input[contains(@id,'input-confirm')]"));
        yourPasswordSecond.sendKeys("12345678990");
        Thread.sleep(2000);
        WebElement newsletter = driver.findElement(By.xpath("//input[contains(@name,'newsletter')]"));
        newsletter.click();
        Thread.sleep(2000);
        WebElement policy = driver.findElement(By.xpath("//input[contains(@name,'agree')]"));
        policy.click();
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.xpath("//div[contains(@class, 'pull-right')]/input[contains(@value, 'Continue')]"));
        submitButton.click();
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.xpath("//div[contains(@class, 'pull-right')]/a[text()='Continue']"));
        continueButton.click();
        Thread.sleep(2000);
        WebElement goHome = driver.findElement(By.cssSelector("a[href$=\"home\"]"));
        goHome.click();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}