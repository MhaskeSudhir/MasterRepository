package synchronization_OR_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_With_Dropdown_Study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select s=new Select(cars);
		
		for(int i=0; i<=3; i++) {
			s.selectByIndex(i);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement head = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]"));
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(head));
		head.click();
		
	}

}
