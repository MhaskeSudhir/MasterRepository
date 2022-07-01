package misc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksInWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//print all links by iterator

		ListIterator<WebElement> it = links.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		
		
		
		List<WebElement> buttons = driver.findElements(By.tagName("Button"));
		
		 ListIterator<WebElement> li = buttons.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next().getText());
		}
		
		System.out.println("==========================================");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 Iterator<WebElement> it1 = buttons.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next().getText());
		}
	}

}
