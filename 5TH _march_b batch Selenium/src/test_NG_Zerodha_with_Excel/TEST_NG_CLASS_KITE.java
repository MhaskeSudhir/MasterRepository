package test_NG_Zerodha_with_Excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TEST_NG_CLASS_KITE {
	WebDriver driver;
	 HOME_page home;
	 LOGIN_page login;
	 PIN_page pin; 
	 Sheet mysheet;
	 @Parameters("browser")
	@BeforeClass 
	public void launchBrowser(String browser) throws EncryptedDocumentException, IOException {
		 
		 if(browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
				
			 driver=new ChromeDriver();
		 }
		 
		 else if(browser.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "G:\\5th march b batch\\chromedriver_win32\\geckodriver.exe");
				
			 driver=new FirefoxDriver();
		 }
		 

		 home=new HOME_page(driver);
		 login=new LOGIN_page(driver);
		 pin=new PIN_page(driver);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kite.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		}
	
	
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String mypin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		login.sendusername(username);
		login.sendpass(password);
		login.clickOnLoginButton();
		
		
		Thread.sleep(3000);
		pin.sendpin(mypin);
		pin.clickOnContinuebutton();
		
		
		
	}
 @Test
 
 public void validateuser() throws InterruptedException, EncryptedDocumentException, IOException {
	 File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kite.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String expuserid = mysheet.getRow(0).getCell(0).getStringCellValue();
	      String actualuserid = home.validateUser();
	      
	      Assert.assertEquals(actualuserid, expuserid, "act and exp are not equal so TC is failed");
	      Reporter.log("act and exp are equal so TC is passed ",true);
	  
	  }
 
 @AfterMethod
 public void aftermethod() throws InterruptedException {
	  
	  home.clickonlogout();
	  
 }
 
 @AfterClass
 public void afterclass() {
	  driver.close();
 }
 
}
