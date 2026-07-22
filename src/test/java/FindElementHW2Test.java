import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementHW2Test {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));}

@AfterMethod
        public void tearDown(){
        driver.quit();}

        @Test
    public void findElementByTagName(){
             WebElement h3 = driver.findElement(By.tagName("h3"));
            System.out.println(h3.getText());

            List<WebElement> links = driver.findElements(By.tagName("h3"));
            System.out.println(links.size());

            WebElement a = driver.findElement(By.tagName("a"));
            System.out.println(a.getText());

            WebElement span = driver.findElement(By.tagName("span"));
            System.out.println(span.getText());

            List<WebElement> a1 = driver.findElements(By.tagName("a"));
            System.out.println(a1.size());

            //driver.findElement(B)
        }
        @Test
    public void findElementById(){
            WebElement element = driver.findElement(By.id("mob-menu-button"));
            System.out.println(element.getAttribute("id"));

            WebElement element1 = driver.findElement(By.id("dialog-notifications-success"));
            System.out.println(element1.getAttribute("id"));

            WebElement element2 = driver.findElement(By.id("dialog-notifications-error"));
            System.out.println(element2.getAttribute("id"));

            WebElement element3 = driver.findElement(By.id("bar-notification"));
            System.out.println(element3.getAttribute("id"));

            WebElement element4 = driver.findElement(By.id("flyout-cart"));
            System.out.println(element4.getAttribute("id"));
        }
    }

