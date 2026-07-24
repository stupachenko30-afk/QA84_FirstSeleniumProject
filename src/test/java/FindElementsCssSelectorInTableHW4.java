import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsCssSelectorInTableHW4 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table_style.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @AfterMethod
    public void tearDown(){
        if (driver !=null){
            driver.quit();
        }


    }
    @Test
    public void findCssSelectorInTable(){

       // List<WebElement> tr = driver.findElements(By.cssSelector("tbody"));
     //  System.out.println(tr.size());

        List<WebElement> tr = driver.findElements(By.cssSelector("tr"));
        System.out.println(tr.size());

        for (int i=0; i<tr.size(); i++){
            System.out.println(tr.get(i).getText());
        }
        System.out.println("***************************");

        WebElement element = driver.findElement(By.cssSelector(".padding tr:nth-child(3)"));
        System.out.println(element.getText());

        System.out.println("***************************");

        WebElement element1 = driver.findElement(By.cssSelector(".padding tr:nth-child(2) td:nth-child(2)"));
        System.out.println(element1.getText());

        System.out.println("****************************");
    }


}
