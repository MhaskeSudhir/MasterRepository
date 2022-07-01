package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	

}
