package Practiceset.practice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Practiceset.baseset.basecomponents;

public class registrationPage extends basecomponents {
	
	
	@Test
	public void intiate() throws IOException
	{
	
	landingPage obj = new landingPage();
	obj.Goto();
	}
	
	

}
