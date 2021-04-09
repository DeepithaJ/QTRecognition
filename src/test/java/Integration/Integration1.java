package Integration;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.SendKudos;
import Resources.base;
import SendKudosModule.SendingKudos;

public class Integration1 extends base {

@Test
public void SendKudosIntegration() throws IOException, InterruptedException, AWTException  {
	SendingKudos sek=new SendingKudos();
	sek.Sendkudos();
	log1.info("Kudos has been sent successfully");
	//driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
	Preconditions()
	SendKudos sk  = new SendKudos(driver);
	sk.recentContacts().click();
	sk.selectKudos().click();
	sk.enterComments().sendKeys("Hello");
	sk.sendButton().click();
	
	
	
	
	
}
	

}
