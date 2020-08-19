package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_demo {
	WebDriver driver;
	@Test
	public void salesforce()
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
	    
        
         driver=new ChromeDriver();  
        driver.get("https://login.salesforce.com/?locale=in");		
	}
	@Test
	public void google()
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
	    
        // Instantiate a ChromeDriver class.      
         driver=new ChromeDriver();  
        driver.get("https://www.google.com/");		
	}
}
