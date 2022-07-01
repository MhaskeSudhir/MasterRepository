package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		//driver.manage().window().maximize();
		
		Thread.sleep(200);
		String url = driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		Thread.sleep(200);
		driver.navigate().to("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(500);
		 WebElement username = driver.findElement(By.id("user-name"));
		 username.sendKeys("standard_user");
		 
		 WebElement pass=driver.findElement(By.id("password"));
		 pass.sendKeys("secret_sauce");
		 
		 Thread.sleep(500);
		 WebElement login =driver.findElement(By.id("login-button"));
		 login.click();
		 
		 WebElement text = driver.findElement(By.xpath("//span[text()='Products']"));
		 
		 String actualtext = text.getText();
		 String exptext1="PRODUCTS";
		 
		 if(actualtext.equals(exptext1)) {
			 System.out.println("test case is passed");
		 }
		 else {
			 System.out.println("test case is failed");
		 }
		 
		 Thread.sleep(200);
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	
		 Thread.sleep(500);
		 driver.findElement(By.className("shopping_cart_link")).click();
		 
		 Thread.sleep(500);
		 driver.findElement(By.id("checkout")).click();
	
		 WebElement Fname=driver.findElement(By.id("first-name"));
		 Fname.sendKeys("vishal");
		 
		 WebElement Lname=driver.findElement(By.id("last-name"));
	
		 Lname.sendKeys("B");
		 
		 driver.findElement(By.id("postal-code")).sendKeys("413512");
		 
		 WebElement count=driver.findElement(By.id("continue"));
		 boolean YorN=count.isEnabled();
		 System.out.println(YorN);
		 
		 count.click();
		 
		 driver.findElement(By.id("finish")).click();
	}

}
