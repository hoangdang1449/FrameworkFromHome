package datadriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class callMethodFromOtherClass extends globalParameters {
	
	@Test
	public void OpeningBrowser() throws IOException{
		
		//Open Firefox
		Login();	
	}
}
