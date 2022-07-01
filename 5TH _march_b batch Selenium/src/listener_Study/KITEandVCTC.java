package listener_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class KITEandVCTC {
	
	WebDriver driver;
  @Test
  public void KiteZerodha() {
	  System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://kite.zerodha.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  
  @Test (dependsOnMethods = {"KiteZerodha"})
  public void VCTC() {
	  
	  driver.get("https://vctcpune.com/");
	  
  }
}
