package Maveen_TestNG.new_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class NewTest {
	//Maveen_TestNG.new_testNG.NewTest
  @Test
  public void fact() {
	  System.out.println("test");
  }
  @Test
  public void fact2() {
	  System.out.println("test2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("this is after classs");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("this is before method");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("this is after method");
  }
  @BeforeTest
  public void beforeMe()
  {
	  System.out.println("this is before test");
  }
  @AfterTest
  public void AfterTe()
  {
	  System.out.println("this is after test");
  }
  @AfterSuite
  public void Aftersu()
  {
	  System.out.println("this is after suite");
  }
  @BeforeSuite
  public void Beforesu()
  {
	  System.out.println("this is before suite");
  }

}
