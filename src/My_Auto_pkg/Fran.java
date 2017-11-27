package My_Auto_pkg;

import java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;


public class Fran 

{

	public static void main(String[] args)
	
	{
	
		//System.setProperty("webdriver.firefox.driver", "D:\\Akshat Nirwan\\Akshat_Automation\\geckodriver");
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandbox.franconnect.net/polaris/");
		driver.findElement(By.id("user_id")).sendKeys("admin2017");
		driver.findElement(By.id("password")).sendKeys("fran12345");
		driver.findElement(By.id("ulogin")).click();
		
		
	}

}
