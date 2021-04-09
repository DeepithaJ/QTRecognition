package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
		
	}
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	public WebElement login()
	{
		return driver.findElement(login);
		
	}
	public WebElement titleColour()
	{
		return driver.findElement(titlecolour);
		
	}
	public WebElement bodyColour()
	{
		return driver.findElement(bodycolour);
		
	}
	public WebElement buttonColour()
	{
		return driver.findElement(buttoncolour);
		
	}
	
	
	
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
    By login=By.xpath("/html/body/div[2]/form/button");
    By titlecolour=By.xpath("/html/body/div[1]");
    By bodycolour=By.xpath("/html/body/div[2]");
    By buttoncolour=By.xpath("/html/body/div[2]/form/button");



	
}


	

