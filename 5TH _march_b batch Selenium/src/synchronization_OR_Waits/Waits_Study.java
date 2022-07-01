package synchronization_OR_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio2']"));
		
		radio.click();
		System.out.println(radio.isSelected());
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(8));
		
		w.until(ExpectedConditions.visibilityOf(dropdown));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("option2");
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		
		hide.click();
		
		WebElement text = driver.findElement(By.id("displayed-text"));
		
		System.out.println(text.isDisplayed());
		
		driver.findElement(By.id("show-textbox")).click();
		
		System.out.println(text.isDisplayed());
		
		
		
		

	}

}
