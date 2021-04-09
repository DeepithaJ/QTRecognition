package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchKudos {
	public WebDriver driver;
	public SearchKudos(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver=driver;
	}
	public WebElement ClickSearch()
	{
		return driver.findElement(search);
		
	}
	public WebElement EnterName()
	{
		return driver.findElement(name);
		
	}
	public WebElement SearchIcon()
	{
		return driver.findElement(searchbutton);
		
	}
	
	
	
	By search=By.xpath("//span[contains(text(),'Kudos Search')]");
	By name=By.xpath("//input[@id='s_e_add']");
	By searchbutton=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]");
}
   