package dropdown_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_Study1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");

	    Thread.sleep(200);
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	    
	    Thread.sleep(2000);
	    WebElement day = driver.findElement(By.id("day"));
	    
	    Select s=new Select(day);
	    s.selectByIndex(9);
	    
	    WebElement month = driver.findElement(By.name("birthday_month"));
	    
	    Select s1=new Select(month);
	    s1.selectByValue("4");
	    
	    WebElement year = driver.findElement(By.id("year"));
	    
	    Select s2=new Select(year);
	    s2.selectByVisibleText("2022");
	    
	    boolean result = s2.isMultiple();
	    System.out.println(result);
	    
	    Thread.sleep(200);
	    for(int i=0; i<=9; i++) {
    	Thread.sleep(500);
    	s.selectByIndex(i);
    }
	    
    Thread.sleep(2000);
    for(int j=0; j<=4; j++) {
	    	Thread.sleep(500);
	    	s1.selectByIndex(j);
	    }
	    
	    for(int k=0; k<=5; k++) {
	    	Thread.sleep(500);
	    	s2.selectByIndex(k);
	    }
	}

}
