package abc;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeTest
	public void mobilelogin()
	{
		System.out.println("belongs to day1 method name mobile login");
	}
	@AfterTest
	public void mobilelogout()
	{
		System.out.println("belongs to day1 method name mobile logout");
	}
	@Test(dependsOnGroups= {"socialsite"})
	public void mobilesendingmessage()
	{
		System.out.println("belongs to day1 method name mobile logout");
	}
	@Test(groups= {"socialsite"})
	public void whatsappchecking()
	{
		System.out.println("belongs to day1 method name mobile whatsapp");
	}
	@Test(groups= {"socialsite"})
	public void instagram()
	{
		System.out.println("belongs to day1 method name mobile instagram");
	}
	@Test(groups= {"socialsite"})
	public void facebook()
	{
		System.out.println("belongs to day1 method name mobile facebook");
	}
	@BeforeMethod
	public void start()
	{
		System.out.println("-----start---------");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("-----end method------------");
	}
}
//parallel 
// Listner


