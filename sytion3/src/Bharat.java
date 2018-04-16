import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Bharat {
 public 	WebDriver driver ;
 
	
	


	@Test(priority=4, description= "This test case will varify home page ")
     public void Dash() throws InterruptedException
		
     {
		
		System.setProperty("webdriver.chrome.driver", "./file/chromedriver.exe");
	driver =	 new ChromeDriver();

		driver.get("https://apps.sytion.com/user-login");

		driver.manage().window().maximize();

		Thread.sleep(3000);
 
		driver.findElement(By.id("edit-name")).sendKeys("bharatlatkar.infanion@gmail.com");

		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("Bharat323021");

		driver.findElement(By.id("edit-submit")).click();

	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//span[text()='My templates']")).click();

			Actions act = new Actions(driver);

			String pw = driver.getWindowHandle();
			Thread.sleep(3000);

			WebElement edit = driver.findElement(By.xpath("//div[@class='website-name-block']"));
			

			act.moveToElement(edit).build().perform();

			driver.findElement(By.xpath("//a[text()='Edit']")).click();

			Set<String> s1 = driver.getWindowHandles();

			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String cw = i1.next();

				if (!pw.equalsIgnoreCase(cw)) {
					driver.switchTo().window(cw);

				}
			}

			 for(int i=0; i<=15;i++)
			 { 

					WebDriverWait wait = new WebDriverWait(driver,  60);
			      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-type='columnparent']/div/div[1]//ul[@class='builder-element-action-links']//li[3]/a"))).click();
			 
			      driver.findElement(By.xpath("//a[@class='panel-title']")).click();
			      
			             WebElement       font = driver.findElement(By.xpath("//select[@class='styles-common form-select form-control']"));
			             
			           //  driver.findElement(By.xpath("//div[@class='select-wrapper']")).click();
			             
			      Select s = new Select(font);
			              
			  
			      s.selectByIndex(i);
			      

			         driver.findElement(By.xpath("//button[text()='Submit']")).click();
			         
			         
			         Thread.sleep(3000);
			 }
     }

@Test()
	public void Aont() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,  60);

	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-type='columnparent']/div/div[1]//ul[@class='builder-element-action-links']//li[3]/a"))).click();
	   
	    driver.findElement(By.xpath("//a[@class='panel-title']")).click();
	    
		                  WebElement         family  =  driver.findElement(By.xpath("//select[@data-type='font-family']"));
		                  
		                  
		                  
		                 Select s = new Select(family);
		                 
		              java.util.List<WebElement>   options  =    s.getOptions();
		              
		              
		                        int      count  = options.size();
		              System.out.println(count);
		                  
		              
		                                     for(WebElement  fontfamily : options)
		                                     {
		                                    	  String     text =  fontfamily.getText();
		                                    	     System.out.println(text);
		                                    	  
		                                     }
		                           
		              
		              
		                 
		      driver.findElement(By.xpath("//button[text()='Submit']")).click();
		                 
		                 
		                 Thread.sleep(3000);
		                  
		                  
		  }
}
