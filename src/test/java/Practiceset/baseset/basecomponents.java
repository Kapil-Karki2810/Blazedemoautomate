package Practiceset.baseset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basecomponents {
	
	WebDriver driver;
	public void start()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

}
