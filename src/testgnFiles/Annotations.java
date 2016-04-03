package testgnFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void UseridGeneration(){
		
		//execute before each test case
		System.out.println("execute this block before every test case");
		
	}
	
	@AfterMethod
	public void ReportAdding(){
		
		//execute after each test case
		System.out.println("execute this block after every test case");
		
	}
	
	@BeforeTest
	public void Cookies(){
		
		//execute once before all test cases
		System.out.println("execute this block before all test cases");
		
	}
	
	@AfterTest
	public void CookiesClose(){
		
		//execute after all test cases
		System.out.println("execute this block after all test cases");

	}
	
	@Test
	public void OpeningBrowser(){
		
		//Open Firefox
		System.out.println("test case 1");
	
	}
	
	@Test(groups=("Priority1"))
	public void FlightBooking(){
		
		System.out.println("test case 2");
		
	}
	
	@Test(groups=("Priority2"))
	public void FlightCancel(){
		
		System.out.println("test case 3");
		
	}
	
}
