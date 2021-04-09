package SendKudosModule;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObjects.SendKudos;
import Resources.base;

public class recentContacts extends base {
	@Test
	public void RecentContacts() throws IOException, InterruptedException {

		PreConditions();

    SendKudos sk  = new SendKudos(driver);
	sk.recentContacts().click();
//   String n1=driver.findElement(By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5")).getAttribute("value");
//    String n2=driver.findElement(By.xpath("//input[@id='email_address']")).getAttribute("value");
    
    	System.out.println("Email id is autopopulated");
    
    sk.selectKudos().click();
	sk.enterComments().sendKeys("Hello");
	sk.sendButton().click();
	
	Thread.sleep(4000);
	driver.close();
   
}
	
}
