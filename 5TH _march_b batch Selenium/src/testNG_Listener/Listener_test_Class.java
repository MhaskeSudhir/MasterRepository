package testNG_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Listener.Listener.class)
public class Listener_test_Class {
  
	
	@Test
  public void A() {
		Assert.fail();
		
		
  }
	@Test (dependsOnMethods = "A")
	
	public void B() {
		Reporter.log("+=====+++++++++======+");
	}
}
