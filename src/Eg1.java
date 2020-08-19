import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Eg1 {
	@Test (priority=1)
	public void google() 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://www.google.com");
	        
		
	}
	@Test (priority=0)  //minimum priority first execute
	public void Quickyes()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://quickyes.in/");
		
	}
	@Test(priority=-1)
	
	public void facebook()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://facebook.com/");
		
	}
	@Test 
	public void Instagram()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		  
	        // Instantiate a ChromeDriver class.      
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://facebook.com/");
		
	}

}
//optional parameter