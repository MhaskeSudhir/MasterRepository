package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_webelement_Study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[text()='Create an account'])[1]")).click();
		
		Thread.sleep(200);
		driver.findElement(By.id("firstName")).sendKeys("vishal");
		driver.findElement(By.id("lastName")).sendKeys("Birajdar");
		
		driver.findElement(By.id("username")).sendKeys("vishalb8146");
		
		driver.findElement(By.name("Passwd")).sendKeys("Vishalb@8146");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("vishalb@8146");
		
		driver.findElement(By.id("i3")).click();
		
		WebElement text = driver.findElement(By.xpath("//figcaption[contains(text(),'One account. All of Google')]"));
		
		String actualtext=text.getText();

		String Exptext="One account. All of Google working for you.";
		
		if(actualtext.equals(Exptext)) {
			System.out.println("Tc is passed");
		}
		else {
			System.out.println("TC is failed");
		}
		
		Thread.sleep(200);
		driver.findElement(By.linkText("Terms")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='age required to manage your own Google Account']")).click();	
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		
	
	
	
	
	}

}
