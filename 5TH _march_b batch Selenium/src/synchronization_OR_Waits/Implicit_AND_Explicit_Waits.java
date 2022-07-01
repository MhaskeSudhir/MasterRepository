package synchronization_OR_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_AND_Explicit_Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.name("login")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.id("loginbutton")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		

	}

}
