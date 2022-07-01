package kite_App_Test_Classes;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kite_App_Base_Class.Base_Class;
import kite_App_Utility_Class.Utility_Class;
import kite_With_Excel_CROSS_BROWSER_test.HOME_Page;
import kite_With_Excel_CROSS_BROWSER_test.Login_Page;
import kite_With_Excel_CROSS_BROWSER_test.PIN_Page;

public class ValidateKiteUserID extends Base_Class{
	
	HOME_Page home;
	Login_Page login;
	PIN_Page pin;
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser() {
	
		openbrowser("chrome");
		login=new Login_Page(driver);
		pin=new PIN_Page(driver);
		home=new HOME_Page(driver);
		
		
		
	}
  @BeforeMethod
  public void LoginKite() throws EncryptedDocumentException, IOException {
	   login.sendusername(Utility_Class.ReadDataFromExcel(0, 0));
	  login.sendpass(Utility_Class.ReadDataFromExcel(0, 1));
	  login.clickOnLoginButton();
	  Utility_Class.implicitWait(driver, 5);
	  
	  pin.sendpin(Utility_Class.ReadDataFromExcel(0, 2));
	  pin.clickOnContinuebutton();
	  
	  
  }
  
  @Test
  public void validateUser() throws EncryptedDocumentException, IOException {
	  String Act=home.validateUser();
	  String Exp=Utility_Class.ReadDataFromExcel(0, 0);
	  
	  Assert.assertEquals(Act, Exp, "TC is Failed");
	  Reporter.log("TC is passed");
	  Utility_Class.takeScreenshot(driver);
  }
  
  @AfterMethod
  public void LogoutKite() throws InterruptedException {
	  
	  home.clickonlogout();
	  
  }
  
  @AfterClass
  public void CloseBrowser() {
	  driver.close();
  }
  
  
}
