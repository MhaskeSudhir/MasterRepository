package Property_File_Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class PropertyUtility_Class {
	
	public static String radfrompropertyfile(String key) throws IOException {
		Properties prop=new Properties();
	 FileInputStream myprop=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\5TH _march_b batch Selenium\\Myproperty.properties");
	 prop.load(myprop);
	 String propvalue = prop.getProperty(key);
	 return propvalue;
		
	}
//	public static String ReadDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
//		File myfile=new File("C:\\Users\\hp\\Documents\\Excel_Apache\\Kite.xlsx");
//		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
//		String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
//		return myvalue;
//		
//	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random=RandomString.make(3);
	File dest= new File("C:\\Users\\hp\\Pictures\\selenium screenshots\\testScreenshot"+random+".png");
	FileHandler.copy(src, dest);
	}
	
	public static void implicitWait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

}
