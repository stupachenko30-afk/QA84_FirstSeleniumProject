import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumHW1Test {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //driver.get("https://uakino.best/filmy");
       // driver.navigate().forward();
       // driver.navigate().back();
        driver.get("https://uakino.best/colections/simejnij-ekshn");
        driver.navigate().to("https://uakino.best/filmy/");
        driver.navigate().back();
    }
    @Test
    public void firstTest(){

        System.out.println("UA kino opened");
    }
@AfterMethod (enabled = false)
    public void tearDown(){
        driver.quit();

}
}
