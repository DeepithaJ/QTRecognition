package OthersModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;


import PageObjects.Others;
import PageObjects.SendKudos;
import Resources.base;

public class kudosCount extends base {
	@Test
	public void CountKudos() throws IOException, InterruptedException, AWTException {

		PreConditions();	
	
//	SendKudos sk  = new SendKudos(driver);
//	sk.sendingkudos().click();
	
	  Others ot=new Others(driver);
   //int beforeKudos=Integer.parseInt(ot.CountValue().getText().split(" ")[0]);
      String str=ot.CountValue().getText();
      str = str.replaceAll("[^\\d]", " ");
      str = str.trim();
      str = str.replaceAll(" +", " ");
      int before=Integer.parseInt(str);
     
  
    	  SendKudos sk  = new SendKudos(driver);
  		    sk.sendingkudos().click();
    		sk.enterName().sendKeys("Prasana");
    	    Robot rb=new Robot();
    	    rb.keyPress(KeyEvent.VK_DOWN);
    	    rb.keyPress(KeyEvent.VK_ENTER);
    		
    		sk.selectKudos().click();
    		sk.enterComments().sendKeys("Hello");
    		sk.sendButton().click();
      
            Thread.sleep(5000);
    
		//int AfterKudos=Integer.parseInt(ot.CountValue().getText().split(" ")[0]);
    		 String str1=ot.CountValue().getText();
    	      str1 = str1.replaceAll("[^\\d]", " ");
    	      str1 = str1.trim();
    	      str1 = str1.replaceAll(" +", " ");
    	      int after=Integer.parseInt(str1);
          
          System.out.println(after);
          Thread.sleep(10000);
          System.out.println(before);
          
          if(after>before) {
        	  log1.info("Kudos count is increased");
          }
          
          Thread.sleep(5000);
          driver.close();
          
         
      }
 
   


}
