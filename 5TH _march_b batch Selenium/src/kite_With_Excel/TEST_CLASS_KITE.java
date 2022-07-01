package kite_With_Excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_CLASS_KITE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//EXCEL SHEET PART
		
				
			
		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kitedata.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		
		int totalrowCount = mysheet.getLastRowNum();
		int totalCellCount = mysheet.getRow(0).getLastCellNum()-1;
		
		
		ArrayList<String> al=new ArrayList<>();
		
		
		for(int i=0; i<=totalrowCount; i++) {
		
		//String username = mysheet.getRow(i).getCell(0).getStringCellValue();
		//String password = mysheet.getRow(i).getCell(1).getStringCellValue();
		//String pin = mysheet.getRow(i).getCell(2).getStringCellValue();
			
			for(int j=0; j<=totalCellCount; j++) {
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				al.add(value);
				
				
			}
		
		
		
		
		
		//call methods from POM class
		
		//1.PART 1
		Kite_Login_Page login=new Kite_Login_Page(driver);
		login.sendusername(al.get(0));
		login.sendpass(al.get(1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//2.PART 2
		Kite_Pin_Page pp=new Kite_Pin_Page(driver);
		pp.Sendpin(al.get(2));
		pp.Clickoncontinuebutton();

		//3. PART 3
		 Kite_Home_Page home=new Kite_Home_Page(driver);
		 home.validateuser(al.get(0));
		 home.logout();
		 
		 //4. PART 4
		 Change_User cu=new Change_User(driver);
		 cu.Changeuser();
		 
		 al.clear();
		 
		}
		
		driver.close();
				 
	
	}
}
