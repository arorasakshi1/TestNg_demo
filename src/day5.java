import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {
	WebDriver driver;
	@Test
	public void a()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
		     driver=new ChromeDriver();  
	}
	@Test
	public void b()
	{
		driver.get("https://www.facebook.com");
	}
	
	
		
	
	@Test(dataProvider="credentials")
	public void c(String name,String password)
	{
		
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys(name);
	 //  driver.findElement(By.id("email")).sendKeys("arorasakshi");
	   driver.findElement(By.id("pass")).sendKeys(password);
	  // driver.findElement(By.id("pass")).sendKeys("arorasakshi");
	}
	@Test
	public void d()
	{
		System.out.println("data processing work going on");
	}
	@Test
 public void e()
 {
	 System.out.println("logout successfully");
 }

@DataProvider(name="credentials")
public Object[][]  getdata()

{
	  Object[][] data=new Object[3][2];
	  data[0][0]="first user";
	  data[0][1]="first password";
	  data[1][0]="first user";
	  data[1][1]="first password";
	  data[2][0]="first user";
	  data[2][1]="first password";
	 
return data;
}
}

//optional parameter and priority




