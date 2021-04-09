package ActivityPageModule;

import java.io.IOException;

import PageObjects.ActivityPage;
import Resources.base;

public class CheckName extends base{
	
	public void Name() throws IOException {
	
	PreConditions();
	
	ActivityPage ap=new ActivityPage(driver);
	String s1=ap.Username().getText();
	if(s1.equals("Deepitha Jagatheesan")) {
		log1.info("UserName is verified");

}
	driver.close();
}
}