import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
                      //before -> setUp
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com"); //Основной метод without history
       // driver.navigate().to("https://www.google.com");
       // driver.navigate().back(); //one page back
       // driver.navigate().forward();
      //  driver.navigate().refresh();// refresh=reload
    }
                       //test "Register new user"
          @Test
    public void firstTest(){
              System.out.println("Google opened");

          }
                        //after ->tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit(); // close all tabs and browser
       // driver.close(); // close only current tab in browser
    }
}
