package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation2 {

	@BeforeSuite
	public void installsoftware(){
		
		System.out.println("Im the first");
		
	}
	
	@AfterSuite
	public void deinstallsoftware(){
		
		System.out.println("Im the last");
		
	}
	
}
