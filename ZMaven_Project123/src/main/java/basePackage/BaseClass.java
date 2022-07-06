package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	

}
