package webTable_Study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Eg4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> headers = driver.findElements(By.xpath("//tbody//tr//th"));
		
		int totalnumofcolumns = headers.size();
		System.out.println(totalnumofcolumns);
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
		
		int totalnumofrows = rows.size();
		System.out.println(totalnumofrows);
		

//		for(WebElement header:headers) {
//			System.out.print(header.getText()+" ");
//		}
		
		List<WebElement> mydata = driver.findElements(By.xpath("//tbody//tr//td"));
		
		System.out.println(mydata.size());
		System.out.println("==============================");
//		for(WebElement data:mydata) {
//			System.out.print(data.getText()+" ");
//			System.out.println();
//		}
		
		for(int i=1; i<=totalnumofrows; i++) {
			for(int j=1; j<=totalnumofcolumns; j++) {
				
				if(i==1) {
					String text = driver.findElement(By.xpath("//tbody//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" | ");
				}
				
				else {
					String text1 = driver.findElement(By.xpath("//tbody//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text1+" | ");
				}
				
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
