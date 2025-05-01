package Practiceset.practice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class landingPage {
	WebDriver driver;
	
	
	
	public void LoginPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void Goto() throws IOException
	{   
		Properties prop=new Properties();
	    FileInputStream path = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Practiceset\\practice\\Globalvariables.properties");
	    prop.load(path);
		driver.get(prop.getProperty("URL"));
	}

}
