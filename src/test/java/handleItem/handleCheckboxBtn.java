package handleItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class handleCheckboxBtn {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;

    @Test
    public void handleCheckbox() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize(); //mở ful màn hình
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox"); //mở link

        By locatorIframe = By.id("iframeResult"); //màn hình có nhiều iframe -> phải chỉ định ifram nào

        driver.switchTo().frame(driver.findElement(locatorIframe)); //switch vào iframe chỉ định
        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@type='checkbox']")); //lấy list checkbox
        for (WebElement e : checkboxList) { //for trong list checkbox
            WebElement label = e.findElement(By.xpath("./following::label")); //lấy ra web element label dựa vào checkbox mong muốn
            System.out.println(e.getAttribute("name"));
            System.out.println(label.getText());
//            if("vehicle2".equals(e.getAttribute("name"))){
//                e.click();
//            }
            if ("I have a car".equals(label.getText())) {
                e.click();
                break;
            }
        }

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitBtn.submit(); //function submit chỉ dùng với element có type="submit"
        Thread.sleep(3000);


        By locator = By.xpath("//div[@class='w3-container w3-large w3-border']"); //tìm đến button
        Thread.sleep(5000);
        WebElement textboxResult = driver.findElement(locator);
        Assert.assertTrue(textboxResult.getText().contains("vehicle2=Car"));
    }


    @Test
    public void handleRadio() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

        Thread.sleep(5000);
        By locatorIframe = By.id("iframeResult"); //màn hình có nhiều iframe -> phải chỉ định ifram nào
        driver.switchTo().frame(driver.findElement(locatorIframe)); //switch vào iframe chỉ định

        List<WebElement> radioLanguageList = driver.findElements(By.xpath("//form//following::input[@type='radio' and @name='fav_language']"));
        for (WebElement e : radioLanguageList) {
            String valueElement = e.getAttribute("value");
            if ("CSS".equals(valueElement)) {
                e.click();
            }

        }

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitBtn.submit();
        Thread.sleep(5000);

        By locator = By.xpath("//div[@class='w3-container w3-large w3-border']");
        WebElement textboxResult = driver.findElement(locator);
        Assert.assertTrue(textboxResult.getText().contains("CSS"));
    }
}