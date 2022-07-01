package screenshot_snapshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Study1 {

	private static final OutputType OutputType = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(500);
		
		WebElement menu = driver.findElement(By.id("oldSelectMenu"));
		
		Select s=new Select(menu);
		
		s.selectByIndex(6);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(s.isMultiple());
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select s1=new Select(cars);
		boolean result = s1.isMultiple();
		
		System.out.println(result);
		
//		s1.selectByVisibleText("Volvo");
//		s1.selectByValue("audi");
//		s1.selectByIndex(1);
		
		for(int i=0; i<=3; i++) {
			Thread.sleep(1000);
			s1.selectByIndex(i);
		}
		
		//Thread.sleep(2000);
		//s1.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String str = RandomString.make(2);
		File dest=new File("C:\\Users\\hp\\Pictures\\selenium screenshots\\image141"+str+".png");
		
		FileHandler.copy(scr, dest);
		
		

	}

}
