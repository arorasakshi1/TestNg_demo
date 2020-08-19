package abc;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day2 {
	@BeforeClass
	public void weblogin()
	{
		System.out.println("belongs to day2 method name web login");
	}
	@AfterClass
	public void weblogout()
	{
		System.out.println("belongs to day2 method name web logout");
	}
	@Test(groups= {"socialsite"})
	public void webwhatsapp()
	{
		System.out.println("belongs to day2 method name web whatsapp");
	}
	@Test(groups= {"socialsite"})
	public void webfacebok()
	{
		System.out.println("belongs to day2 method name web facebook");
	}

}