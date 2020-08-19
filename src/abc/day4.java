package abc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	 WebDriver driver;
	@Test
	public void openbrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		     driver=new ChromeDriver();  
	}
	@Test(dependsOnMethods= {"openbrowser"})
	public void Enterurl()
	{
		driver.get("http://demo.guru99.com/test/delete_customer.php");	
	}
	
	@Test(dependsOnMethods= {"openbrowser","Enterurl"})
	@Parameters({"val1"})
	public void datatitle(@Optional("default")String name)  //optional parameter
	{
		driver.findElement(By.name("cusid")).sendKeys(name);					
	    driver.findElement(By.name("submit")).submit();	
	}
	@Test(dependsOnMethods= {"openbrowser","Enterurl","datatitle"})
	
	public void ztaskcomplete() throws InterruptedException
	{
		
	
		  Alert alert = driver.switchTo().alert();		
  		
		    // Capturing alert message.    
		    String alertMessage= driver.switchTo().alert().getText();		
		    		
		    // Displaying alert message		
		    System.out.println(alertMessage);	
		    Thread.sleep(5000);
		    		
		    // Accepting alert		
		    alert.accept();
	        Reporter.log("We used Google Chrome Ver 80 for this test");
	        Reporter.log("abc", true);

}					
}

    
    // Alert Message handling
      	