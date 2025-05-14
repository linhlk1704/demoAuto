package handleItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HandleApi {
    @Test
    public static void handleTextArea() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("131");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.partialLinkText("Selenium")).click();
//        driver.findElement(By.cssSelector("input#password")).sendKeys("aaaaa");
//        driver.findElement(By.cssSelector("i.fa fa-2x fa-sign-in")).click();
//        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("5655555555555");
//        driver.findElement(By.cssSelector("button.radius[type=submit]")).click();
//        driver.findElement(By.cssSelector("input[type*=ext]")).sendKeys("DinhPX");
//        driver.findElement(By.cssSelector("button.radius > i")).click();
        List<WebElement> inputList = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
        List<String> listNameAttr = Arrays.asList("username", "password");
        for (WebElement webElement : inputList) {
            String name = webElement.getAttribute("name");
            System.out.printf(name);
            boolean isMapping = listNameAttr.contains(name);
            Assert.assertTrue(listNameAttr.contains(webElement.getAttribute("name")));
        }
    }
}