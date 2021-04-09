package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityPage {
	public WebDriver driver;
	public ActivityPage (WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver=driver;
	}
	public WebElement Username()
	{
		return driver.findElement(username);
		
	}
	By username=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/h5");
	
	

}
