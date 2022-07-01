package actions_Class_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.id("name"));
		
		//element.sendKeys("Vishal");

		Actions act=new Actions(driver);
		act.sendKeys(element,"Vishal").perform();
		
		act.keyDown(element,Keys.SHIFT).sendKeys("vishal").keyUp(Keys.SHIFT).sendKeys("birajdar").build().perform();
	}

}
