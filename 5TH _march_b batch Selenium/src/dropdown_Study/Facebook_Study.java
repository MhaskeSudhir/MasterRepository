package dropdown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s=new Select(day);
		s.selectByVisibleText("19");
		
		Select s1=new Select(month);
		s1.selectByValue("1");
		
		Select s2=new Select(year);
		s2.selectByIndex(27);
		
//		Thread.sleep(500);
//		for(int i=0; i<=18; i++) {
//			Thread.sleep(200);
//			s.selectByIndex(i);
//			
//		}
		Thread.sleep(5000);
		
		for(int j=0; j<=11; j++) {
			Thread.sleep(200);
			s1.selectByIndex(j);
		}
		Thread.sleep(5000);
		for(int k=0; k<=27; k++ ) {
			Thread.sleep(200);
			s2.selectByIndex(k);
		}
		
		
		

	}

}
