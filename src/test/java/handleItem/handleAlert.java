package handleItem;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class handleAlert {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;
    WebElement simpleAlertBtn;
    By simpleAlertLocator;

    @Test
    public void handleSimpleAlert() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        simpleAlertLocator = By.id("alertButton");
        wait.until(ExpectedConditions.elementToBeClickable(simpleAlertLocator));
        simpleAlertBtn = driver.findElement(simpleAlertLocator); // Dùng biến instance
        simpleAlertBtn.click();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }

    @Test
    public void handleConfirmationAlert() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By locator = By.id("confirmButton");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement simpleAlertBtn = driver.findElement(locator);
        simpleAlertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        List<WebElement> confirm = driver.findElements(By.xpath("//span[@id='confirmResult']"));
        System.out.println(confirm.get(0).getText());

    }

    @Test
    public void handleAuthenticationAlert() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String username = "admin";
        String password = "admin";
        String domain = "the-internet.herokuapp.com/basic_auth";
        String url = "https://" + username + ":" + password + "@" + domain;
        driver.get(url);
        Thread.sleep(3000);
        List<WebElement> messSuccess = driver.findElements(By.xpath("//p"));
        Assert.assertEquals(messSuccess.size(), 1);
        Assert.assertTrue(messSuccess.get(0).getText().contains("Congratulations! You must have the proper credentials"));

    }
}