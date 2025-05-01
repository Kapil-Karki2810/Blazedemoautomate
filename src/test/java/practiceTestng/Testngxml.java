package practiceTestng;

import org.testng.annotations.BeforeSuite;

public class Testngxml {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("The before suite first work");
	}

}
