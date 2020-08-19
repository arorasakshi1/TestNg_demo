package abc;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Actions 
{
 public static WebDriver driver;
  
 public static void openBrowser()
 { 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\Desktop\\seide\\abc\\chromedriver.exe");  
	 
	 driver = new ChromeDriver();
	 
	


 }
  
 public static void navigate()
 { 
 driver.get("https://www.browserstack.com/users/sign_in"); }
  
 public static void input_Username()
 {
		driver.findElement(By.name("user[login]")).sendKeys("username");
 }
  
 public static void input_Password()
 {
		driver.findElement(By.name("user[login]")).sendKeys("password");
 }
  
 public static void click_Login()
 {
		driver.findElement(By.name("commit")).click();
 }
 
@Test
 public static void verify_login()
 {
 String pageTitle = driver.getTitle();
System.out.println(pageTitle); 
}
 
 public static void closeBrowser()
 {
 driver.quit();
 
}
}