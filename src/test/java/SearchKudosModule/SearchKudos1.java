package SearchKudosModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


import org.testng.annotations.Test;


import PageObjects.SearchKudos;
import Resources.base;

public class SearchKudos1 extends base{
	
 @Test
	public void Kudossearching() throws IOException, InterruptedException, AWTException {

	 PreConditions();	
		
		SearchKudos se=new SearchKudos(driver);
		se.ClickSearch().click();
		se.EnterName().sendKeys("Sinchana");
		Robot rb=new Robot();
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    se.SearchIcon().click();
	    log1.info("The list of kudos sent from and to the user is displayed");
		
	

}
}
