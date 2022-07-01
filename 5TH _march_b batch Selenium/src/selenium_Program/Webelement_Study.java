package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		//driver.navigate().refresh();
		
		//Thread.sleep(20000);
		//driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(500);
		//driver.findElement(By.id("mobileNumber")).sendKeys("8080381400");
		
		 WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect ')]"));
		System.out.println(text.getText());
		
		String actualtext = text.getText();
		
		
		String expectedtext = "Facebook helps you connect and share with the people in your life.";
		
		if(actualtext.equals(expectedtext)) {
			System.out.println("test case is pass");
			
		}
		else {
			System.out.println("text case is failed");
		}
		
		WebElement username = driver.findElement(By.id("email"));
	
		Thread.sleep(200);
		username.sendKeys("Vishalb");
		
		Thread.sleep(200);
		boolean condition = username.isEnabled();
		 System.out.println(condition);
		 
		 
		WebElement pass = driver.findElement(By.id("pass"));
		
		 pass.sendKeys("123456");
		 
		 Thread.sleep(200);
		 WebElement login = driver.findElement(By.name("login"));
		 
		 login.click();
		 
		 
		
	}
	

}
