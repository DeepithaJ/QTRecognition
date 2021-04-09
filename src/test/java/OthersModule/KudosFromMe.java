package OthersModule;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.IOException;
import PageObjects.Others;
import Resources.base;

public class KudosFromMe extends base
{
	@Test
	public void KudosfromMe() throws IOException, InterruptedException {

	PreConditions();	
	
	Others ot=new Others(driver);
	ot.KudosFromMe().click();
	String s1=ot.Name().getText();
	String s2=ot.UserName().getText();
	if(s1.equals(s2)) {
		log1.info("Kudos is sent from me");
	}
//	String s= ot.Sender().getText();
//	String r=ot.Receiver().getText();
//	if(!s.equals(r)) {
//		System.out.println("Kudos is sent to another employee");
//	}
	
	}
	
	
	@AfterTest
	public void afterTest() throws InterruptedException
	{
	Thread.sleep(7000);
	driver.close();
	}
	
	

	
}

	
	
	
	
	

   


