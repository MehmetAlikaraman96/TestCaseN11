package Base;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
   public static WebDriver driver;

    @Before
    public void Setup(){
           System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
           driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.n11.com");
    }
    @After
    public void TearDown(){
        driver.quit();
    }
}
