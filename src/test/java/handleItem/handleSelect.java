package handleItem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class handleSelect {
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;

    @Test
    public void handleSingleSelect() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Thread.sleep(1000);
        Select select = new Select(dropdownList);
//        select.selectByContainsVisibleText("2");
//        select.selectByIndex(2);
        select.selectByValue("2");
        WebElement defaultValue = select.getFirstSelectedOption();
        List<WebElement> listSelect = select.getAllSelectedOptions();
        System.out.println(defaultValue);

    }
    @Test
    public void handleMultiSelect() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement dropdownList = driver.findElement(By.id("cars"));
        Select select = new Select(dropdownList);
        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Saab");
        select.deselectAll();

    }

    @Test
    public void handleCustomDropdown() throws InterruptedException {
        chromeOptions.setBrowserVersion("131");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_dropdown_button");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement dropdownBtn = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Actions action = new Actions(driver);
        action.moveToElement(dropdownBtn).perform();
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
        System.out.println(elementList.size());
        for(WebElement e : elementList){
            System.out.println(e.getText());
            if(e.getText().equals("Link 2")){
                e.click();
            }
        }

    }
}
