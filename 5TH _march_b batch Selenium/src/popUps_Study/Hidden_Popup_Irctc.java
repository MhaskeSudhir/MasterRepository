package popUps_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Popup_Irctc {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		 Thread.sleep(6000);
	driver.findElement(By.xpath("//button[text()='OK']")).click();

	}

}
