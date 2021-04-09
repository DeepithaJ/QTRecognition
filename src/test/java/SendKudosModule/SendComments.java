package SendKudosModule;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.SendKudos;
import Resources.base;

public class SendComments extends base{
	
	@Test(dataProvider="comments")
	public void Citation(String Comments) throws IOException, InterruptedException {

		PreConditions();	

        SendKudos sk  = new SendKudos(driver);
		sk.sendingkudos().click();
	    sk.enterName().sendKeys("Monika Marudhavanan  (monika.marudhavanan@qualitestgroup.com");
		sk.enterName().click();
		
		sk.enterComments().sendKeys(Comments);
		sk.sendButton().click();
		Thread.sleep(5000);
		
		//Assert.assertEquals(driver.findElement(By.xpath("//center[contains(text(),\"Please enter\")]")),"Please Enter any comment");
		if(driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog.modal-lg div.modal-content form:nth-child(1) div.modal-body div:nth-child(1) span:nth-child(1) > center:nth-child(1)")).equals("Please Enter any comment"))
		{
//			log1.info("Test case passed");	
//		}
//		else
//		{
//			log1.info("Test case failed");
//		}
//		if(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div[1]")).getText().equals("Please enter any comment."))
//		{
//			log1.info("Test case passed");	
//		}
//		else
//		{
//			log1.info("Test case failed");
//		}
//		
		
		
		//sk.sendButton().click();
		//.sleep(5000);
	    //driver.close();
		/*boolean chek = true;
		
		
		Assert.assertFalse(chek);
		driver.close();*/
	}


@DataProvider

public Object[] comments()
{
	Object data[]=new Object[2];
	data[0]="Just Kidding";
	data[1]="";
	
return data;
}
}


