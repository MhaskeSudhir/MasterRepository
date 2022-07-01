package actions_Class_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_By_Mouse {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).clickAndHold().moveByOffset(400, 0).build().perform();
	}

}
