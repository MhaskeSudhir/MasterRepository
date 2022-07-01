package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(200);
		
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		
		Thread.sleep(200);
		if(radio2.isSelected()) {
			System.out.println("button is selected");
		}
		else {
			Thread.sleep(200);
			//radio2.click();
			if(radio2.isSelected()) {
				System.out.println("now selected");
			}
			else {
				System.out.println("failed to select");
			}
		}
		Thread.sleep(500);
		WebElement display = driver.findElement(By.id("displayed-text"));
		
		Thread.sleep(200);
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(200);
		if(display.isDisplayed()) {
			System.out.println("text box displayed");
			
		}
		
		else {
			Thread.sleep(500);
			driver.findElement(By.id("show-textbox")).click();
			
			if(display.isDisplayed()) {
				System.out.println("now displayed");
			}
			else {
				System.out.println("failed to display");
			}
		}
		
		display.sendKeys("4521158");
		
		Thread.sleep(500);
		display.clear();
		
		

	}

}
