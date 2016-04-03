package datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlparameters {
	
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
	
	//@Test
	public void OpeningBrowser(){
		
		//Open Firefox
		System.out.println("test case 1");
	
	}
	
	@Test(groups=("Priority1"))
	@Parameters({"adminUserid"})
	public void FlightBooking(String Userid){
		
		System.out.println(Userid);
		
	}
	
	//@Test(groups=("Priority2"))
	public void FlightCancel(){
		
		System.out.println("test case 3");
		
	}
	
	@Test(dataProvider="getData")
	public void userid(String username, String password, String id){
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		
	}
	
	@DataProvider
	public Object [][] getData(){
		//i stands for number of times testcase should run
		//j stands for no of parameters it should send for one go
		Object [][] data=new Object[3][3];
		data[0][0]="1abcd";
		data[0][1]="1xyz";
		data[0][2]="1rwer";
		
		data[1][0]="2abcd";
		data[1][1]="2xyz";
		data[1][2]="2rwer";
		
		data[2][0]="3abcd";
		data[2][1]="3xyz";
		data[2][2]="3rwer";
		return data;
	}
	
}
