package Property_Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Property_File_Utility.PropertyUtility_Class;


public class PropertyBase_Class {
	public WebDriver driver;
	
	public void openbrowser() throws IOException {
		
		
	System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("incognito");
		driver=new ChromeDriver(opt);
		driver.get(PropertyUtility_Class.radfrompropertyfile("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
	}

}
