package java_Framework_Study_POM1;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		Kite_Login_Page login= new Kite_Login_Page(driver);
		login.SendUN("ELR321");
		login.Sendpass("Dhana1111");
		String mytext = login.text();
		login.Clickonliginbutton();
		
		
		Kite_PIN pin=new Kite_PIN(driver);
		
		pin.Sendpin();
		pin.Clickoncontinuebutton();
		
		User_Validation user=new User_Validation(driver);
		
		
		
	}

}
