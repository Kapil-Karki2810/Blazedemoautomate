package blazedemo.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import blazedemo.pageobjects.Homepage;
import blazedemo.testcasescomponents.Basetest;

public class Booktheflight extends Basetest {
	
	@Test
	public void destinationdetails()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Homepage homepage = new Homepage(driver);
		homepage.findflights("Boston", "London");
	}

}
