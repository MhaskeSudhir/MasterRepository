package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hul.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@aria-label='Our Brands (item 2 of 6)']")).click();
		
		
		
	}

}
