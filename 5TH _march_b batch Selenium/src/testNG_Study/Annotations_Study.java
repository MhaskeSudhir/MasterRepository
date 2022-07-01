package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Study {

@Test
  public void myTest1() {
	Reporter.log("validate user id from homr page");
  }

@Test
public void myTest2() {
	Reporter.log("validate home page functionality");
}
  
  
  @BeforeClass
	public void BeforeClass() {
		Reporter.log("Launch browser, before class",true);
	}
  
  @AfterClass
  public void AfterClass() {
	  Reporter.log("close browser, after class");
  }
  
  @BeforeMethod
  public void BeforeMethod() {
	  Reporter.log("login with UN and PASS and PIN");
  }
  
  @AfterMethod
  public void AfterMethod() {
	  Reporter.log("logout");
  }
  
}
