package testNG_Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass1 {
  @Test (groups = "sanity")
  public void mymethod1() {
	  Assert.fail();
	  Reporter.log("My method 1 is ok", true);
	  
  }
  @Test (groups = "Regression")
  public void mymethod2() {
	  
	  Reporter.log("My method 2 is ok", true);
	  
  }
  @Test (groups = "sanity")
  public void mymethod3() {
	  
	  Reporter.log("My method 3 is ok", true);
	  
  }
  @Test (groups = "Regression")
  public void mymethod4() {
	  
	  Reporter.log("My method 4 is ok", true);
	  
  }
}
