package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Product_Reviews {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","G:\\\\5th march b batch\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("flipkart");
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		for(WebElement text:list) {
			System.out.println(text.getText());
		}
		
		
		
		String exptext = "flipkart";
		for(WebElement text1:list) {
			String acttext = text1.getText();
			
			if(acttext.equals(exptext)) {
				text1.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//cite[text()='https://www.flipkart.com'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("=======================================");
		WebElement id = driver.findElement(By.id("productRating_LSTMOBG6VF5DXHQUPJSYT5FCB_MOBG6VF5DXHQUPJS_"));
		System.out.println(id.getText());
		System.out.println("========================================");
		WebElement reviews = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[2]"));
	    System.out.println(reviews.getText());
	}

}
