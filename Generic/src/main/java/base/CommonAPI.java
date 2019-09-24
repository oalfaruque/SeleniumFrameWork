package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
   public WebDriver driver = null;
   @Parameters({"url"})
   @BeforeMethod
    public void SetUp(String url){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omar Al-Faruque\\IdeaProjects\\FrameWorkSelenium092119\\Generic\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       driver.get(url);
   }
   @AfterMethod
   public void CleanUp(){
      driver.close();
   }

}
