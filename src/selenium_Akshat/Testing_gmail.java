package selenium_Akshat;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;
import java.util.*;


public class Testing_gmail
{

	public static void main(String[] args) throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "/c:/users/aksha/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("akshat1954@gmail.com");
		driver.findElement(By.id("next")).click();
		//driver.findElement(By.id("password")).sendKeys("devaks1954");
		//driver.findElement(By.className("Passwd")).sendKeys("devaks1954");
		//driver.findElement(By.partialLinkText(")
		//driver.findElement(By.cssSelector("input[type='password'][name='Passwd']")).sendKeys("devaks1954");
		//WebElement pass_field = driver.findElement(By.xpath("//*[contains(text(),'password')]"));
		//pass_field.sendKeys("devaks1954");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element1 = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("password")));
        element1.sendKeys("devaks1954");
        
        driver.findElement(By.id("submit")).click();
       
        WebElement compose_btn = wait.until(
              ExpectedConditions.elementToBeClickable(By.xpath("//*[div[@gh='cm']]")));
        compose_btn.click();
        
      /*  WebElement recipient = driver.findElement(By.xpath("//*[contains(text(),'Recipients')]"));
        recipient.click();
        recipient.sendKeys("hi");
        
        //driver.findElement(By.xpath("//*[div [aria-label*='Message Body']")).sendKeys("hi");
       
       // driver.findElement(By.id("pf")).sendKeys("ho");
        
      //  driver.findElement(By.xpath("//*[id(':pf')]"));
        
      /*  WebElement subject_text = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[div[@aria-label='To']")));
        subject_text.sendKeys("hi");
       */  
          
     //  WebElement to = driver.findElement(By.xpath("//div[@id=':b5']/div/div"));
		//WebElement to1 = driver.findElement(By.xpath("//div[2]/div[3]"));
     //   to.sendKeys("hi");
      //  to1.sendKeys("ho");
        
      //  WebElement recipient = wait.until(
          //      ExpectedConditions.elementToBeClickable(By.xpath("//tr//td[2]//div//textarea[@aria-label='Some recipients use services that don't support encryption (click for details)']")));
         //       recipient.sendKeys("hi");
                
     WebElement recipient = driver.findElement(By.xpath("//tr//td[2]//div//textarea[@aria-label='To']"));
     recipient.sendKeys("email");
                
                WebElement body = driver.findElement(By.xpath("//tr//td[2]//div//textarea[@aria-label= 'Message Body']"));
                body.sendKeys("Body hi");
        
        //WebElement subject = driver.findElement(By.xpath(xpathExpression))
        
	//	driver.findElement(By.name("to")).click();
	//	driver.findElement(By.name("to")).clear();
	//	driver.findElement(By.name("to")).sendKeys("nirwan1954@yahoo.co.in");
		
     /*   driver.findElement(By.name("subjectbox")).click();
		driver.findElement(By.name("subjectbox")).clear();
		driver.findElement(By.name("subjectbox")).sendKeys("Automated Mail");
	*/
		
		//	driver.findElement(By.id("od")).sendKeys("yo");
		
	//	driver.findElement(By.xpath("//div[2]/iframe")).click();
	//	driver.findElement(By.xpath("//div[3]/div/div/div/div/b")).click();
        
        
   
       // driver.findElement(By.id(":ot")).sendKeys("Hi");
   
       // driver.findElement(By.
     // WebElement compose_btn = driver.findElement(By.xpath("//*[div[@gh='cm']]"));
        
        //WebElement compose_btn = wait.until(
          //      ExpectedConditions.elementToBeClickable(By.className("T-I J-J5-Ji T-I-KE L3")));
      
	}
}
