package dropdown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_Study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		
		WebElement next = driver.findElement(By.xpath("(//div[@dir='auto'])[10]"));
		WebElement name = driver.findElement(By.name("name"));
		WebElement No = driver.findElement(By.name("phone_number"));
		
		Thread.sleep(200);
		System.out.println(next.isEnabled());

	}

}
