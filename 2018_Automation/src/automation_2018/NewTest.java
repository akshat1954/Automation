package automation_2018;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.sql.Driver;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Before
WebDriver driver;

public class NewTest

{
	
	
	
	
  @Test
  public void f()
  {
	 driver = new ChromeDriver(); 
	  
  }
  
 

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
