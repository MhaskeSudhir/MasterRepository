package webTable_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Eg2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to know how many rows are present in table
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalnumofrows = rows.size();
		System.out.println(totalnumofrows);
		System.out.println("===========================");
		
		
		for(WebElement totalrows:rows) {
			System.out.println(totalrows.getText()+" ||");
		}
		System.out.println();
		
		
		//to know how many columns are present in table
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		
		int totalnumofcol = columns.size();
		System.out.println(totalnumofcol);
		
		for(WebElement col:columns) {
			System.out.print(col.getText()+" ||");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
