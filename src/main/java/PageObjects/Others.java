package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Others {
	public WebDriver driver;
	public Others(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver=driver;
	}
	public WebElement Name()
	{
		return driver.findElement(name);
		
	}
	public WebElement UserName()
	{
		return driver.findElement(username);
		
	}
	public WebElement KudosFromMe()
	{
		return driver.findElement(kudosfromme);
	}
	public WebElement KudosToMe()
	{
		return driver.findElement(kudostome);
	}
	public WebElement CountValue()
	{
		return driver.findElement(countvalue);
	}
	
	public WebElement Receiver()
	{
		return driver.findElement(receiver);
		
	} 
	public WebElement Sender()
	{
		return driver.findElement(sender);
		
	} 
	public WebElement KudosFromMeRecipient ()
	{
		return driver.findElement(kudosfromMerecipient);
		
	} 
	public WebElement KudosToMeRecipient ()
	{
		return driver.findElement(sender);
		
	} 
	
	
	
	By name=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[1]");
    By username=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/h5");
    By kudosfromme=By.xpath("//span[contains(text(),'Kudos from me')]");
    By kudostome=By.xpath("//span[contains(text(),'Kudos to me')]");
   
    By countvalue=By.xpath("//*[@id=\"todayCount\"]");
    By sender=By.xpath("//*[@id=\"0\"]/div/h5/b[1]");
    By receiver=By.xpath("//*[@id=\"0\"]/div/h5/b[2]");
    By kudosfromMerecipient=By.xpath("//*[@id=\"shoutout_to_me\"]/div[5]/div/h5/b[2]");
    
}
