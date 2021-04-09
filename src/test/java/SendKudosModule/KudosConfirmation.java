package SendKudosModule;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import Resources.base;

public class KudosConfirmation extends base {
	
	@Test
	public void ConfirmationMessage() throws IOException, InterruptedException, AWTException {

//		
		SendingKudos sek=new SendingKudos();
		sek.Sendkudos();
		log1.info("Email sent successfully");
	log1.info("Kudos sent is reflected in the recent activity section");
		
//	log1.error("Name of the receiver is not updated in the recent contacts list");
//		sek.recentContacts().click();
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Downloads\\selenium-java-3.141.59\\Screenshot4.png"));
//	    log1.error("Recent contact section is not uploaded");
	}
		
	}
	
	
	

