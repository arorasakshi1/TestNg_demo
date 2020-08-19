package abc;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	@BeforeSuite
	public void apilogin()
	{
		System.out.println("belongs to day3 method name api login");
	}
	@AfterSuite
	public void apilogout()
	{
		System.out.println("belongs to day3 method name api logout");
	}
	@Test
	public void data()
	{
		

		
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
		        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
		        
		        //driver.get("https://www.demoqa.com");
		        
		        Reporter.log("data test", true);
	              //  driver.close();
		//.log(“message”,true);
	}
	//----------------------------------------------------------------
	@Test(enabled=false)
	public void excel()
	{
		System.out.println("belongs to day3 method name excel");
	}
	@Test
	public void word()
	{
		System.out.println("belongs to day3 method name word");
	}
	@Test(groups= {"socialsite"})
	public void hike()
	{
		System.out.println("belongs to day3 method name hike");
	}
	

}

//Maven