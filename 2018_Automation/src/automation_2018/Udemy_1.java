package automation_2018;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Udemy_1 {
	
	WebDriver driver;
	public String baseUrl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		
		String path=System.getProperty("user.dir");
		path=path.concat("/").concat("src").concat("/").concat("geckodriver.exe");
		File file=new File(path);
		
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		baseUrl = "https://clusterdc.franconnect.net/fc/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		assertEquals(driver.getTitle(), "Franconnect");
		fail("Not yet implemented");
	}

}
