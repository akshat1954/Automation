package selenium_Akshat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	
	

	public static void main(String[] args) 
	{
		
		try {
			WebDriver driver = new ChromeDriver();
			Actions action = new Actions(driver);
			//ChromeOptions options = new ChromeOptions();
			driver.get("https://www.snapdeal.com/");
			WebElement abc = driver.findElement(By.className("accountUserName"));
			action.moveToElement(abc).build().perform();
			WebElement loginBtn =driver.findElement(By.xpath(".//a[contains(text(),'login')]"));
			action.moveToElement(loginBtn).build().perform();
			loginBtn.click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath(".//input[@id='userName']")).sendKeys("9015463035");
			//WebElement frame = driver.find_element_by_css_selector('div.iframeContainer iframe');
			WebElement frame=driver.findElement(By.cssSelector("div#iframeContainer iframe"));
			driver.switchTo().frame(frame);
			//driver.findElements(By.cssSelector("input[type='text']")).get(1).sendKeys("9015463035");
			driver.findElement(By.id("userName")).sendKeys("9015463035");
			/*WebElement comp = driver.findElement(By.className("catText"));
			action.moveToElement(comp).build().perform();
			*/
			String winHandleBefore = driver.getWindowHandle();
			driver.findElement(By.id("googleUserLogin")).click();
			for(String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			driver.findElement(By.id("identifierId")).sendKeys("akshat1954@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("devaks1954");
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			Thread.sleep(1000);
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(1000);
			WebElement compAndGame = driver.findElement(By.xpath(".//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[4]/a/span[2]"));
			action.moveToElement(compAndGame).build().perform();
			driver.findElement(By.xpath(".//*[@id='category4Data']/div[1]/div/div/p[13]/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[9]/div[1]/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/label")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[9]/div[2]/div[2]/div[3]/div[2]/div/")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[9]/div[2]/div[2]/div[3]/div[2]/div/div")).click();
			driver.findElement(By.xpath(".//*[@id='content_wrapper']/div[9]/div[2]/div[2]/div[3]/div[2]/ul/li[3]")).click();
			
			
			
			
		} 
		
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
		
		
