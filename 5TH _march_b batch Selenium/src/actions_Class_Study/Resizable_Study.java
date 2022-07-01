package actions_Class_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable_Study {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	 System.out.println(frames.size());
	 
	 JavascriptExecutor j = ((JavascriptExecutor)driver);
	 j.executeScript("window.scrollBy(0,350)");
	 
	 
	 driver.switchTo().frame(0);
	
	 WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'ui-resizable-handle')])[3]"));

	 
	 Actions act=new Actions(driver);
	 
	 act.moveToElement(element).clickAndHold().moveByOffset(200, 150).build().perform();

	}

}
