package LoginModule;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import PageObjects.LoginPage;
import Resources.base;


public class Login extends base {
	
	
@BeforeTest
public void preconditions() throws IOException
{
	
driver=initializeDriver();
driver.manage().window().maximize();
}
	
	
@Test(dataProvider="getData")		
public void LoginPageNavigation(String username,String password) throws IOException, InterruptedException
	{
	driver.get(prop.getProperty("url"));
	//log1.info("Successfully invoked the application");
	
	LoginPage l=new LoginPage(driver) ;
	l.username().sendKeys(username);
	l.password().sendKeys(password);
	l.login().click();
	
	String u=driver.getCurrentUrl();
	if (u.equals("https://qtrecognition.testqtwiz.com/Activity.php")) {
    log1.info("Successfully logged in");
	}
	else
		log1.info("Wrong username and password");	
	
	Thread.sleep(5000);
    driver.close();
    
    
    
    }

	
@DataProvider
public Object[][] getData()
{
	Object data[][]=new Object[5][2];
	
	data[0][0]="deepitha.jagatheesan@qualitestgroup.com";
	data[0][1]="P@ssw0ad";
	
	
	
	data[1][0]="test123";
	data[1][1]="P@SSW0RD";
	
	data[1][0]="";
	data[1][1]="";
	
	
	
	data[2][0]="deepitha.jagatheesan@qualitestgroup.com";
	data[2][1]="P@ssw0rd";
	
	data[2][0]="deepitha.jagatheesan@qualitestgroup.com";
	data[2][1]="P@SSW0RD";
	
	
	
	return data;
	
	
	
	
}

}

