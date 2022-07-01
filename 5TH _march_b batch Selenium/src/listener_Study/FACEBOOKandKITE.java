package listener_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FACEBOOKandKITE {
	
	WebDriver driver;
  @Test (priority = -1)
  public void Facebook() {
	  System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  
  @Test
  public void KiteZerodhaNew() {
	  System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://kite.zerodha.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
}
