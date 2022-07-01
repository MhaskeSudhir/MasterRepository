package kite_With_Excel_CROSS_BROWSER_test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_class_Cross_Browser {
	
	WebDriver driver;
	Login_Page login;
	 PIN_Page pin;
	 HOME_Page home;
	 Sheet mysheet;
	 
	@BeforeClass
	public void beforeclass() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 login=new Login_Page(driver);
		 pin=new  PIN_Page(driver);
		 home=new HOME_Page(driver);
		driver.get("https://kite.zerodha.com/");
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kite.xlsx");
		
	 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	 driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String mypin=mysheet.getRow(0).getCell(2).getStringCellValue();
		login.sendusername(username);
		login.sendpass(password);
		
		login.clickOnLoginButton();
		Thread.sleep(3000);
		pin.sendpin(mypin);
		pin.clickOnContinuebutton();
		Thread.sleep(4000);
		
	}
	
	
  @Test
  public void UserValidation() {
	   String actuserid = home.validateUser();
	   System.out.println(actuserid);
	  String ExpUserID = mysheet.getRow(0).getCell(0).getStringCellValue();
	  
	  Assert.assertEquals(actuserid, ExpUserID,"both are not equal TC is failed");
	  Reporter.log("both are equal TC is passed");
	  
	  
	  
	  
	  
  }
  
  @AfterMethod
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(4000);
	  home.clickonlogout();
	  
  }
  
  
  @AfterClass
  public void afterclass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
