package soft_Assert_Study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	Login_Page login;
	HOME_Page home;
	PIN_Page pin;
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeClass
	public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");
		  soft=new SoftAssert();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	public void loginFirst() {
		 login.sendusername("ELR321");
		login.sendpass("Dhana1111");
		login.clickOnLoginButton();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 pin.sendpin("992278");
		 pin.clickOnContinuebutton();
	}
  @Test
  public void Kite_Zerodha() {
	  String act = home.validateUser();
	  String Exp = "ELR321";
	  soft.assertEquals(act, Exp," TC is failed");
	  Reporter.log("TC is passed", true);
	  
	 
  }
  
  @AfterMethod
  public void logoutLast() throws InterruptedException {
	  home.clickonlogout();
	  
  }
  
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
	  soft.assertAll();
  }
  
}
