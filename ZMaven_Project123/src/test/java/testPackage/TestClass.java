package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TestClass extends BaseClass {
	@BeforeClass
	public void launchUrl() {
		openBrowser();
	}
	
	
	
	
  @Test
  public void f() {
  }
}
