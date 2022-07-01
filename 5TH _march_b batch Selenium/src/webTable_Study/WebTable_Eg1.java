package webTable_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Eg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement text = driver.findElement(By.xpath("//td[text()='Learn SQL in Practical + Database Testing from Scratch']"));
		WebElement text1 = driver.findElement(By.xpath("//td[contains(text(),'Learn SQL in Practical')]"));

		System.out.println(text.getText());
		System.out.println(text1.getText());
		System.out.println("=============================================");
		
		List<WebElement> header = driver.findElements(By.xpath("//tr//th"));
		
		for(WebElement allheadrs:header) {
			System.out.print(allheadrs.getText()+" ||");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		List<WebElement> row5 = driver.findElements(By.xpath("//tbody//tr[5]"));
		
		for(WebElement row:row5) {
			System.out.print("|| "+row.getText()+" ||");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
