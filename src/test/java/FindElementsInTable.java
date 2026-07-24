import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsInTable {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    @Test
    public void findCssSelectorInTable(){
//get numbers of row
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());

        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());

        }

       // for (WebElement element)
        System.out.println("***************");

        WebElement element = driver.findElement(By.cssSelector("#customers tr:nth-child(6)"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.cssSelector("#customers tr:nth-child(6) td:nth-child(2)"));
        System.out.println(element1.getText());

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement DE = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customers tr:nth-child(6)"))
        );
        System.out.println(DE.getText());*/



    }
    @AfterMethod
    public void tearDown(){
        if (driver !=null){
            driver.quit();
        }
    }
}
