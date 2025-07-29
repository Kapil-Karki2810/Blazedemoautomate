package blazedemo.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightselecting {

	WebDriver driver;
	public Flightselecting(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "//table[@class='table']")
	WebElement table;
	
	@FindBy(xpath="//table[@class='table']/thead/tr/th")
	List<WebElement> headers;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr")
	List<WebElement> rows;
	
	public void headername()
	{
		System.out.println(headers.size());
		for (WebElement header: headers)
		{
			System.out.println(header.getText());
		}
	}
	
	public void selectflight(String flightname)
	{
		for(WebElement row: rows)
		{
			List<WebElement>cells = row.findElements(By.tagName("td"));
			if (cells.get(2).getText().equalsIgnoreCase(flightname))
			{
				cells.get(0).click();
				break;
			}
		}
		
	}
	
	
	
}
