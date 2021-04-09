package LoginModule;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.base;

public class CheckApplicationTitle extends base{

	
	@Test
public void getAppTitle() throws IOException {
		
		PreConditions();
		System.out.println(driver.getTitle());
	if(driver.getTitle().equals("QTRecognition"))
	{
		log1.info("Application Title is verified");
	}
	
	driver.close();
}
}
