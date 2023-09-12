package Maveen_TestNG.new_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestCase1 {
	
	WebDriver driver;
	String demoqaurl = "https://demoqa.com/";
	String sturl = "https://www.selenium.dev/";
	
  @Test(enabled = true)
  public void Testc1() {
	  
	  driver.get(demoqaurl);
	  System.out.println(driver.getTitle());
	  
	  System.out.println("testcase1 passed");
	  
  }
  @Test
  public void Testc2() {
	  driver.get(sturl);
	  WebElement aboutlink  = driver.findElement(By.xpath("//*[contains(@href,'downloads')]"));
	  aboutlink.click();
	  String title = driver.getTitle();
	  System.out.println("title is :" + title);
	  Assert.assertEquals(title, "Downloads | Selenium");
	  System.out.println("testcase2 passed");
	  }
  @Test
  public void Testc3(){
	  System.out.println("testcase3 passed");
  }
  
@SuppressWarnings("deprecation")
@BeforeClass
  public void beforeClass() {
	 // System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\91949\\Selenium Training\\new_testNG\\Servers\\chromedriver.exe");
	  ChromeOptions Options = new ChromeOptions();
	  Options.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(Options);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
			  
	  System.out.println("Before Class Pre Condition passed");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  System.out.println("After class Post Condition passed");
  }

}

