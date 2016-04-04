package bitrix24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CommonAction 

{

public WebDriver driver = null;

@Test
public void Login() throws IOException

{
	//Load value from properties file
	Properties prop = new Properties();
	FileInputStream datasetfile = new FileInputStream("D:\\Backup\\Training\\New folder\\FrameworkFromHome\\src\\bitrix24\\dataset.properties");
	prop.load(datasetfile);
	
	//Browsers select from properties file
	if(prop.getProperty("browser").equals("firefox"))
		
		{
			driver = new FirefoxDriver();
		}
	
	else if(prop.getProperty("browser").equals("chrome"))
		
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Backup\\Training\\BrowserDrivers\\Chromedriver.exe");
			driver = new ChromeDriver();
		}
	
	else
			
		{
			System.setProperty("webdriver.ie.driver", "D:\\Backup\\Training\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	
	//Navigate to bitrix24
	driver.get(prop.getProperty("url"));
	
	//Check the title of the page
	System.out.println(driver.getTitle());
}
	
}
