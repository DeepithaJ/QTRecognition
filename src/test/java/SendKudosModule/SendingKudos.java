package SendKudosModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObjects.SendKudos;
import Resources.base;

public class SendingKudos extends base {
@Test
public void Sendkudos() throws IOException, InterruptedException, AWTException {
	PreConditions();	
	

SendKudos sk  = new SendKudos(driver);
sk.sendingkudos().click();
sk.enterName().sendKeys("Sinchana");
Robot rb=new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);

sk.selectKudos().click();
sk.enterComments().sendKeys("Hello");
sk.sendButton().click();


Thread.sleep(7000);
driver.close();
}


}


