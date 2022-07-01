package testNG_Keywords_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {
  @Test(invocationCount = 2)
  public void mymethod5() {
	  Reporter.log("Mymethod 5 is running",true);
  }
  @Test(priority = -1)
  public void mymethod1() {
	  
	  Reporter.log("Mymethod 1 is running",true);
	  Assert.fail();
  }
  
  @Test(enabled = true)
  public void mymethod3() {
	  Reporter.log("Mymethod 3 is running",true);
  }
  @Test(timeOut = 1000)
  public void mymethod4() throws InterruptedException {
	  Thread.sleep(1100);
	  Reporter.log("Mymethod 4 is running",true);
  }
  @Test(dependsOnMethods = "mymethod4")
  public void mymethod2() {
	  Reporter.log("Mymethod 2 is running",true);
  }
}
