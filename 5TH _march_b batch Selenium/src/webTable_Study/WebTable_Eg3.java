package webTable_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Eg3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		List<WebElement> headers = driver.findElements(By.xpath("//table//th"));
		
		int totalnumofcolumns = headers.size();
		int totalnumofrows = rows.size();
		
		System.out.println(totalnumofrows);
		System.out.println(totalnumofcolumns);
		for(WebElement head:headers) {
			System.out.println(head.getText());
		}
		
		for(int i=1; i<=totalnumofrows; i++) {
			for(int j=1; j<=totalnumofcolumns; j++) {
				if(i==1) {
					 String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" ");
				}
				else {
					 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
					 System.out.print(text+" ");
				}
				
			}
			System.out.println();
		}
		
		

	}

}
