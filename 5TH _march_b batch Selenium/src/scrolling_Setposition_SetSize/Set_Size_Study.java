package scrolling_Setposition_SetSize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(4000);
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(500, 900);
		driver.manage().window().setSize(d);
	}

}
