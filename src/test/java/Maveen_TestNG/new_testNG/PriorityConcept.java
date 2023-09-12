package Maveen_TestNG.new_testNG;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	
	@Test(priority = 0)
	  public void Testcase1() {
		  System.out.println("testcase1");
		  
	  }
	@Test(priority = 2)
	  public void Testcase2() {
		  System.out.println("testcase2");
		  
	  }
	@Test(priority = 1, enabled = false)
	  public void Testcase3() {
		  System.out.println("testcase3");
		  
	  }
	@Test(priority = -1)
	  public void Testcase4() {
		  System.out.println("testcase4");
		  
	  }
	@Test(priority = 1)
	  public void Testcase5() {
		  System.out.println("testcase5");
		  
	  }

}
