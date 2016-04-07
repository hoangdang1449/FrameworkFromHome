package bitrix24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonAction 

{

//Variable declaration
public WebDriver driver = null;
Properties prop = new Properties();


@BeforeTest
public void Navigate() throws IOException 

{
	
	//Load value from properties file
	
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

@Test
public void Login()

{
	driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath("//input[@id='AUTH_SUBMIT']")).click();
}

}