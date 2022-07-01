package synchronization_OR_Waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waits_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement button = driver.findElement(By.xpath("//button[@id='confirmButton']"));
				button.click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
		
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		alt.accept();
		
		
		
		
	}

}
