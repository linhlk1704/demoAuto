package handleItem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleInputField {
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;
    WebElement inputUserName;
    WebElement inputPassword;
    WebElement submitButton;

    @Test
    public void handleTextbox() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        inputUserName = driver.findElement(By.id("username"));
        inputUserName.sendKeys("tomsmith");
        Thread.sleep(3000);
        inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("SuperSecretPassword!");
        Thread.sleep(3000);
        submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
//        List<WebElement> flashSuccess = driver.findElements(By.id("flash")); //Option1: check xem man hinh co chua dung element sau khi login thanh cong khong
//        Assert.assertEquals(flashSuccess.size(), 1);
        WebElement flashSuccess = driver.findElement(By.id("flash")); //Option 2: check xem man hinh tiep theo co chua text cua man hinh login thanh cong khong
        Assert.assertTrue(flashSuccess.getText().contains("You logged into a secure area!"));
    }
    @Test
    public void handleTextArea() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_textarea");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement textArea = driver.findElement(By.id("w3review"));
        String originValue = textArea.getText();
        System.out.println("originValue has length is " + originValue.length());
        textArea.sendKeys(Keys.RETURN);;
        String value = "End";
        textArea.sendKeys("End");
        String newValue = textArea.getAttribute("value"); //textarea luon co attribute la value nen khi dung getAttribute se truyen attribute la value
        if (newValue != null) {
            System.out.println(" newValue has length is " + newValue.length());
            Assert.assertEquals(originValue.length() + value.length() + 1, newValue.length());
        }
    }
}
