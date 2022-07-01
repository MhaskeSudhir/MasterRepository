package popUps_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_study {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
	
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(5000);
		alt.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		Thread.sleep(6000);
	     Alert alt1 = driver.switchTo().alert();
	     Thread.sleep(8000);
	     alt1.dismiss();
		
		

	}

}
