package automation_2018;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First_TestCase {
	
	WebDriver driver;

	@Test
	public void test()
	{
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
		assertEquals(ExpectedTitle, ActualTitle);
		//fail("Not yet implemented");
	}

}
