package practiceTestng;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngannotations {
	
	WebDriver driver;
	@BeforeTest
	public void testng()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/client");
	}
	
	@Test
	public void numberoflinks()
	{
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		for(WebElement list : lists )
		{
			String a = list.getDomProperty("href");
			String b = list.getText();
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	@AfterTest
	public void closewindow()
	{
		driver.close();
	}

}
