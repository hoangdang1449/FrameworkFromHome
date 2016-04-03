package testgnFiles;

import org.testng.annotations.Test;

public class DependencyAnnotation {
	
	@Test
	public void OpeningBrowser(){
		
		//Open Firefox
		System.out.println("Opening Browser");
	
	}
	
	@Test(dependsOnMethods={"OpeningBrowser"}, alwaysRun=true)
	public void FlightBooking(){
		
		//Depend on other test case
		System.out.println("FlightBooking");
	}
	
	@Test(enabled=false)
	public void Payment(){
		
		//Skip test case if you want to
		System.out.println("New test case");
	
	}
	
	@Test(timeOut=5000)
	public void Timerelated(){
		
		//Complete this test in 5s, if not script failed
		System.out.println("New test case");
	
	}
	
}
