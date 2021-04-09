package OthersModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import PageObjects.Others;
//import PageObjects.Others;
import PageObjects.SendKudos;
import Resources.base;

public class SelfKudos extends base{
	
	@Test
	public void Selfkudos1() throws AWTException, IOException, InterruptedException
	{
		PreConditions();	

		SendKudos sk  = new SendKudos(driver);
		sk.sendingkudos().click();
		sk.enterName().sendKeys("Deepitha");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

		sk.selectKudos().click();
		sk.enterComments().sendKeys("Hello");
		sk.sendButton().click();
		Thread.sleep(10000);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Screenshots\\SelfKudos.png"));
		
		Others ot=new Others(driver);
		String s=ot.Sender().getText();
		String r=ot.Receiver().getText();
		if(s.equals(r))
		{
			log1.info("SelfKudos is sent so it's a failed test case");
		}
		else
		{
			log1.info("Success");
		}
		
		
		
		driver.close();
	}

}
