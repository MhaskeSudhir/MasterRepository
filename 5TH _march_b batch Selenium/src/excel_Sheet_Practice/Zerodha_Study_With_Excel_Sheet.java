package excel_Sheet_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_Study_With_Excel_Sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kite.xlsx");
		 
		 String UN = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 String pass = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 String pin = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		 
		
		
		driver.findElement(By.id("userid")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("pin")).sendKeys(pin);
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
