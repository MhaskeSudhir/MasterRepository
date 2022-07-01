package synchronization_OR_Waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Waits_With_POPUP_Study {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.accept();
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=new RandomString().make(2);
		File dest=new File("C:\\Users\\hp\\Pictures\\selenium screenshots\\file00"+random+".jpg");
		
		FileHandler.copy(scr, dest);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='NewWindow'] ")).click();
		
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(set);
		
		String childid = al.get(1);
		
		driver.switchTo().window(childid);
		
		WebDriverWait ww=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement search = driver.findElement(By.id("the7-search"));
		ww.until(ExpectedConditions.visibilityOf(search));
		
		search.sendKeys("selenium");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
