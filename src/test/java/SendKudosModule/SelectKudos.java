package SendKudosModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


import PageObjects.SendKudos;
import Resources.base;

public class SelectKudos extends base{
	@Test
	public void Select() throws IOException, InterruptedException, AWTException {

		PreConditions();

		SendKudos sk  = new SendKudos(driver);
		sk.sendingkudos().click();
		sk.enterName().sendKeys("Varsini");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		sk.selectKudos().click();
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		
		
		sk.sendingkudos().click();
		sk.enterName().sendKeys("Varsini");
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations"};
		for(int i=0;i<arr.length;i++)
		{
			sk.kudostype(arr[i]);
		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Screenshots\\MultipleKudos.png"));
	    
	   Thread.sleep(5000);
       driver.close();
}
}
