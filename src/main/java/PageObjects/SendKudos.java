package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SendKudos  {

		
		public WebDriver driver;
		
		public SendKudos(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
			
		}
		public WebElement sendingkudos()
		{
			return driver.findElement(sendingKudos);
		}
		public WebElement enterName()
		{
			return driver.findElement(name);
		}
		
		public WebElement selectKudos()
		{
			return driver.findElement(selectkudos);
		}
		
		public void kudostype(String kudostype)
		{
			WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
			kt.click();
		}
		public WebElement enterComments()
		{
			return driver.findElement(comments);
		}
		public WebElement sendButton()
		{
			return driver.findElement(sendbutton);
		}
		
		
		
		By sendingKudos=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
		By name=By.xpath("//input[@id='email_address']");
		By selectkudos=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/center[1]/p[1]");
		By comments=By.xpath("//textarea[@id='comment']");
        By sendbutton=By.xpath("//button[contains(text(),'Send')]");
        By recentcontacts=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");

		public WebElement recentContacts() {
			// TODO Auto-generated method stub
			return driver.findElement(recentcontacts);
		}
        
        
}
        
