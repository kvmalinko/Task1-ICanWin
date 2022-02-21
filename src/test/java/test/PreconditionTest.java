package test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import page.NewPastePage;

import java.util.concurrent.TimeUnit;

public class PreconditionTest {
    private WebDriver driver;
    protected NewPastePage newPastePage;

    @BeforeMethod
    public void setBrowser(){
      //  System.setProperty("webdriver.chrome.driver", "/Users/Katsiaryna_Malinko/chromedriver");
        driver = new ChromeDriver();
        driver.manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
        newPastePage = new NewPastePage(driver);
    }

    @AfterMethod (alwaysRun = true)
    public void closeDriver(){
       driver.quit();
       driver=null;
    }

}
