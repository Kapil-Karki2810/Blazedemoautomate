package blazedemo.testcasescomponents;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import blazedemo.pageobjects.Homepage;

public class Basetest {
	
	public WebDriver driver;
	
	public Homepage intialize()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Homepage homepage = new Homepage(driver);
		homepage.Goto();
		return homepage;
	}
	
	public List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException
	{   
		//convert json to string
		String jsoncontent = FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
		
		//convert string to hashmap
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data = mapper.readValue(jsoncontent, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
		
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	

}
