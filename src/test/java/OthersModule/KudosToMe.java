package OthersModule;

import java.io.IOException;

import org.testng.annotations.Test;


import PageObjects.Others;
import Resources.base;

public class KudosToMe extends base {
	
	@Test
	public void KudosT0Me() throws IOException, InterruptedException 
	{
	
		PreConditions();	
		
		Others ot=new Others(driver);
		ot.KudosToMe().click();
		String s1=ot.Name().getText();
		String s2=ot.UserName().getText();
		
		if(s1.equals(s2)) {
			log1.info("Kudos is sent to me");
		}
		
	Thread.sleep(4000);
	driver.close();
	
	
	
	}
	
}
	


