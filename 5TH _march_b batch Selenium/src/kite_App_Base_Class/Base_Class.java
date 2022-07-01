package kite_App_Base_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {
	public WebDriver driver;
	
	public void openbrowser(String browser) {
		
		if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("incognito");
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
		else if(browser.equals("Microsoft edge")) {
			
			System.setProperty("webdriver.edge.driver","G:\\5th march b batch\\chromedriver_win32\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
	}

}
