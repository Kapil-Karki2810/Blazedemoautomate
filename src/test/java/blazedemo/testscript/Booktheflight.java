package blazedemo.testscript;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import blazedemo.pageobjects.Flightselecting;
import blazedemo.pageobjects.Homepage;
import blazedemo.testcasescomponents.Basetest;

public class Booktheflight extends Basetest {
	
	@Test(dataProvider = "getData")
	public void destinationdetails( HashMap<String, String> input)
	{
		Homepage homepage = intialize();
		homepage.Goto();
		Flightselecting select = new Flightselecting(driver);
		homepage.Goto();
		homepage.findflights(input.get("destinationfrom"), input.get("destinationto"));
		select.headername();
		select.selectflight(input.get("flightname"));
		closebrowser();
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//blazedemo//testdata//bookingdetails.json");
		return new Object[] [] {{data.get(0)}};
	}

}
