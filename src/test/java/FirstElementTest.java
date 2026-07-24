import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstElementTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

      /*  ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("E:\\Tools\\chromedriver.exe"))
                .build();
        */

        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");

        // maximize browser window
        driver.manage().window().maximize();

        //wait to upload all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByTagName(){
      //one element
        WebElement h1 = driver.findElement(By.tagName("h1")); //alt+enter
        System.out.println(h1.getText());

        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a.getAttribute("class"));

        // more element
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


    }
    @Test
    public void findElementById(){
        WebElement city = driver.findElement(By.id("city"));
        System.out.println(city.getAttribute("id"));
    }

    @Test
    public void findElementByClassName(){

        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        WebElement description = driver.findElement(By.className("description"));
        System.out.println(description.getText());


    }
    @Test
    public void findElementByLinkElement(){
        WebElement let_car_work = driver.findElement(By.linkText("Let car work"));
        System.out.println(let_car_work.getText());
    }
    @Test
    public void findElementByPartialLinkText(){
        WebElement work = driver.findElement(By.partialLinkText("work"));
        System.out.println(work.getText());
    }
    @Test
    public void findElementByCssSelector(){
       // driver.findElement(By.tagName("h1"));
        //tagName -> "h1"
        //css ->"h1"
        WebElement h1 = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1.getText());

        //driver.findElement(By.id("city"));
        //id->"city"
          //css-> "#city"
        WebElement element = driver.findElement(By.cssSelector("#city"));
        System.out.println(element.getText());

        //driver.findElement(By.className("telephone"));
        WebElement element1 = driver.findElement(By.cssSelector(".telephone"));
        System.out.println(element1.getText());

        //[attr='par']
        WebElement element2 = driver.findElement(By.cssSelector("[href='/search']"));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.cssSelector("[for='city']"));
        System.out.println(element3.getText());

        //contains -> *
        driver.findElement(By.cssSelector("[href*='car']"));
        //start -> ^

//start -> ^
        driver.findElement(By.cssSelector("[href^='/terms']"));
// end -> $
        driver.findElement(By.cssSelector("[href$='work']"));

driver.findElement(By.cssSelector("a.navigation-link[href='/search']"));

          // one step down
         driver.findElement(By.cssSelector(".logo>img"));

         //space -> one or more steps down
        driver.findElement(By.cssSelector(".feedback-card .feedback-date"));

        //<tag> or <id> or <class>:nth-child(n)
        WebElement feedback = driver.findElement(By.cssSelector(".feedback-card:nth-child(5)"));
        System.out.println(feedback.getText());
    }

}
