package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import PageObjects.LoginPage;
import Resources.base;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends base{

    @Given("^Initialise the browser with chrome$")
    public void initialise_the_browser_with_chrome() throws Throwable {
    	driver=initializeDriver();
    	driver.manage().window().maximize();
    }
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @When("^User enters (.+) and (.+)$")
    public void User_enters_and(String username, String password) throws Throwable {
    	LoginPage l=new LoginPage(driver) ;
    	l.username().sendKeys(username);
    	l.password().sendKeys(password);
    }

    @Then("^Click on Login button$")
    public void click_on_login_button() throws Throwable {
	LoginPage l=new LoginPage(driver) ;
    	l.login().click();
    	Thread.sleep(5000);
        driver.close();
    }

    

}