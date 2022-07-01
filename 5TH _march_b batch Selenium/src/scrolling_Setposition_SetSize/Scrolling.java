package scrolling_Setposition_SetSize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,2000)");
		
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,-2000)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	     WebElement hide = driver.findElement(By.id("hide-textbox"));
	     
	     JavascriptExecutor js = ((JavascriptExecutor)driver);
	     
	     js.executeScript("arguments[0].scrollIntoView(true);",hide);
	     
	     

	}

}
