package misc;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelements_On_Google_Page {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement name = driver.findElement(By.name("q"));
		
		name.sendKeys("honda");
		
		List<WebElement> searchresults = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
		
		
		for(WebElement search:searchresults) {
			System.out.println(search.getText());
		}
		
		
		String expresult = "honda amaze";
		
		for(WebElement results:searchresults) {
			String actual=results.getText();
		
			if(actual.equals(expresult)) {
				results.click();
				break;
			}
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement images = driver.findElement(By.linkText("Images"));
		
		images.click();
		
		WebElement amaze = driver.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[3]"));
		
		amaze.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\hp\\Pictures\\selenium screenshots\\filegoogle.jpg");
		
		FileHandler.copy(source, dest);

	}

}
