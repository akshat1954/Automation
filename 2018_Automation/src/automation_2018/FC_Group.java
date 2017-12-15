package automation_2018;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FC_Group {
 
 WebDriver driver;
 public String baseUrl;
 
  @Test
  public void f() throws InterruptedException {
  
   driver.get(baseUrl);
   System.out.println(driver.getTitle());
   driver.findElement(By.id("user_id")).sendKeys("corp12017");
   driver.findElement(By.id("password")).sendKeys("fran12345");
   driver.findElement(By.id("ulogin")).click();
   driver.findElement(By.className("label5")).click();
   driver.findElement(By.xpath(".//a[@original-title='Group Your Leads to Manage Them']")).click();
   driver.findElement(By.id("createGroup")).click();
  
   //Finds all the iFrames
   int size = driver.findElements(By.tagName("iframe")).size();
   for(int i=0; i<=size; i++)
     {
    driver.switchTo().frame(i);
    int total=driver.findElements(By.id("groupName")).size();
    System.out.println(total);
       driver.switchTo().defaultContent();
   }
  
   driver.switchTo().frame(2);
   driver.findElement(By.id("groupName")).sendKeys("Akshat Test Group 1");
   driver.findElement(By.id("groupDescription")).sendKeys("Akshat Test Group Description");
  
   WebElement groupAccessibility = driver.findElement(By.id("groupType"));
   Select dropdown = new Select(groupAccessibility);
   dropdown.selectByVisibleText("Public");
  
   driver.findElement(By.xpath(".//label[@for='groupChoiceTemp']")).click();
   driver.findElement(By.xpath(".//button[@class='btn-style']")).click();
  
  }
 
 
  @BeforeTest
  public void beforeTest() {
   System.setProperty("webdriver.chrome.driver", "D:\\Automation\\2018_Automation\\chromedriver_win32\\chromedriver.exe");
   driver = new ChromeDriver();
   baseUrl = "https://clusterdc.franconnect.net/fc/";
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
  }
  @AfterTest
  public void afterTest() {
  //driver.close();
  }
}