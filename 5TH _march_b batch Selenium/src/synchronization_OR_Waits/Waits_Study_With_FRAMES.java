package synchronization_OR_Waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Study_With_FRAMES {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		WebElement parent = driver.findElement(By.id("frame1"));
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(parent));
		
	        WebElement text = driver.findElement(By.xpath("//body[text()='Parent frame']"));
	        
	        System.out.println(text.getText());
	        
	        WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	        
	        w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));
	        
	        System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File dest=new File("C:\\Users\\hp\\Pictures\\selenium screenshots\\filepic.jpg");
	        org.openqa.selenium.io.FileHandler.copy(scr, dest);
	
	        driver.switchTo().defaultContent();
	        
	        driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]")).click();
	        
	        
	

	}

}
