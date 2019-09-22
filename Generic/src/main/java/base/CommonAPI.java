package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
   public WebDriver driver = null;
   @BeforeMethod
    public void SetUp(){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omar Al-Faruque\\IdeaProjects\\FrameWorkSelenium092119\\Generic\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.facebook.com");
   }
   @AfterMethod
   public void CleanUp(){
      driver.close();
   }

}
