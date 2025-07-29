package blazedemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[type='submit']")
	WebElement FindFlights;
	
	@FindBy(css ="select[name='fromPort']")
	WebElement DepartureCity;
	
	@FindBy(css ="select[name='toPort']")
	WebElement DestinationCity;
	
	public void findflights(String deptcity, String Destcity)
	{
	    Select departcity = new Select(DepartureCity);
	    departcity.selectByValue(deptcity);
	    Select destntcity = new Select(DestinationCity);
	    destntcity.selectByValue(Destcity);
	    FindFlights.click();
	}

}
