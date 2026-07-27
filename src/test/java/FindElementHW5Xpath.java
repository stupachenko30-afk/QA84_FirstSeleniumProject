import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementHW5Xpath {
    WebDriver driver;

            @BeforeMethod
    public void setUp() {
                driver = new ChromeDriver();
                driver.get("https://demowebshop.tricentis.com/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            }
            @AfterMethod
    public void tearDown(){
        if(driver !=null);
        driver.quit();
            }

            @Test
    public void findElementByXpath(){

                WebElement element = driver.findElement(By.xpath("//*[@class='header']"));
                System.out.println(element.getText());
                driver.findElement(By.xpath("//*[@class='tags']"));
                driver.findElement(By.xpath("//*[@class='footer']"));
                System.out.println("*******************************");

                WebElement element1 = driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
                System.out.println(element1.getAttribute("textContent"));
                driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
                driver.findElement(By.xpath("//*[@id='topcartlink']"));

                WebElement element2 = driver.findElement(By.xpath("//*[@name='description']"));
                System.out.println(element2.getAttribute("textContent"));
                driver.findElement(By.xpath("//*[@name='keywords']"));
                driver.findElement(By.xpath("//*[@name='viewport']"));


               // WebElement element3 = driver.findElement(By.xpath("//div[@class='feedback-card']//p[@class='feedback-text']"));
                //System.out.println(element3.getText());

                WebElement element4 = driver.findElement(By.xpath("//div[@class='header-menu']//ul[@class='top-menu']//a"));
                System.out.println(element4.getText());
                WebElement element5 = driver.findElement(By.xpath("//div[@class='block block-popular-tags']//div[@class='title']"));
                System.out.println(element5.getText());
            }

            }

