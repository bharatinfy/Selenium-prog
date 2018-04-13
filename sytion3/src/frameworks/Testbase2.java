package frameworks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import designwidget.Bagroubdadd;
import designwidget.Bold;
import designwidget.Designtext;
import designwidget.Login;
   

public class Testbase2 {
	public static WebDriver driver;
	public static void getBrowser(String browser) {
 

			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",    "./file/geckodriver.exe");
				driver = new ChromeDriver();
				
				

			} else if (browser.equalsIgnoreCase("chrome")){
				 driver = new FirefoxDriver();
				System.setProperty("webdriver.geck.driver" ,   "./file/geckodriver.exe");
		
				
			}

		}
	

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
                   

	
		Login lo = new Login();
		WebDriver wd = lo.Log();
		
           //test case to add baground image   check border design section        
	    Bagroubdadd.bag(wd);      
	    Bagroubdadd.border(wd); 
		Bagroubdadd.bag(wd);
		Bagroubdadd.border(wd);
		Bagroubdadd.padding(wd);
		Bagroubdadd.effect(wd);
	    Bagroubdadd.effect(wd);
		Bagroubdadd.spacing(wd);
		Bagroubdadd.align(wd);
		
		 Thread.sleep(5000);    
		 
		
		// Test cases to design text  
		 
			Designtext.text(wd);
			Designtext.delete(wd);
			Designtext.bag(wd); 
			Designtext.border(wd);
			Designtext.padding(wd);
			Designtext.effect(wd);   
		Thread.sleep(3000);
		
			Bold.add(wd);
	         
	                                   
	         
		}       
   
}

