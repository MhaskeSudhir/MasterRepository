package scrolling_Setposition_SetSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SET_Position_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p=new Point(200, 200);
		Thread.sleep(4000);
		driver.manage().window().setPosition(p);
	}

}
