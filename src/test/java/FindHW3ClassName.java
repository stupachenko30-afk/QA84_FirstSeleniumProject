import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindHW3ClassName {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterMethod
    public void tearDown(){driver.quit();}

    @Test
    public void FindElementsByClassName() {

        WebElement element = driver.findElement(By.className("tags"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.className("view-all"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.className("rightside-3"));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.className("listbox"));
        System.out.println(element3.getText());

        WebElement element4 = driver.findElement(By.className("footer"));
        System.out.println(element4.getText());

        WebElement element5 = driver.findElement(By.className("master-wrapper-page"));
        System.out.println(element5.getText());

        WebElement element6 = driver.findElement(By.className("master-wrapper-content"));
        System.out.println(element6.getText());

        WebElement element7 = driver.findElement(By.className("header"));
        System.out.println(element7.getText());

        WebElement element8 = driver.findElement(By.className("search-box"));
        System.out.println(element8.getText());

        WebElement element9 = driver.findElement(By.className("header-menu"));
        System.out.println(element9.getText());

        System.out.println("********************");
    }

        @Test
                public void FindElementByCssSelector(){
        //CssSelector
        WebElement element = driver.findElement(By.cssSelector(".header"));
        System.out.println(element.getText());
        driver.findElement(By.cssSelector(".tags"));
        driver.findElement(By.cssSelector(".footer"));

        WebElement element1 = driver.findElement(By.cssSelector("#dialog-notifications-success"));
        System.out.println(element1.getText());
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#topcartlink"));

        WebElement element2 = driver.findElement(By.cssSelector("[name='description'"));
        System.out.println(element2.getText());
        driver.findElement(By.cssSelector("[name='keywords'"));
        driver.findElement(By.cssSelector("[name='viewport'"));


        }

}
