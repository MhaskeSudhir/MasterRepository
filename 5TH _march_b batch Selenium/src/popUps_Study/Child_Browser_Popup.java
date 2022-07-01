package popUps_Study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);//we get main page id
		
		//now we want id of child page....all id's are received in set
		Set<String> allid = driver.getWindowHandles();
		
		//set need to convert into array list
		ArrayList<String> ar=new ArrayList<>(allid);
		
	for(int i=0; i<=ar.size()-1; i++) {
			Thread.sleep(1000);
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar.get(1));
		
		String mainid=ar.get(0);
		String childid=ar.get(1);
		Thread.sleep(2000);
		//now switch to child page
		driver.switchTo().window(childid);//focus switched to child page
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
		//Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(mainid);
		
		Thread.sleep(2000);
		driver.findElement(By.name("NewTab")).click();
		
		Thread.sleep(10000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
