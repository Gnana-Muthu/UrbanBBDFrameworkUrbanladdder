package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import com.mindtree.PageObjects.GetProductDetailsPageObject;
import com.mindtree.PageObjects.ValidateProductPageObject;
import com.mindtree.PageObjects.LoginDetailsPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Uistore.LoginUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition extends LoginUistore {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	ReusableMethod rm=new ReusableMethod();	
	Logger log= LoggerHelper.getLogger(LoggerHelper.class);	
	@Given("^Initialize the Browser$")
	public void initialize_the_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=rc.setup();
		  
		 log.info("Driver is Setup");
	}

	@Given("^Navigate to website$")
	public void navigate_to_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(rc.baseURL);
		log.info("URL is opened");
	}

	@Then("^Click Track and Login Track$")
	public void click_Track_and_Login_Track() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Clicktrack=driver.findElement(track);
		Clicktrack.click();
		WebElement Clicklogin=driver.findElement(login);
		Clicklogin.click();
		
		
	}
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String username, String password) throws Throwable {
		WebElement EnterLogin=driver.findElement(User);
		EnterLogin.sendKeys(username);
		WebElement EnterPassword=driver.findElement(Password);
		EnterPassword.sendKeys(password);
		WebElement ClickSubmit=driver.findElement(Submit);
		ClickSubmit.click();
    }


    @Then("^Close Driver$")
    public void close_driver() throws Throwable {
    	driver.quit();
    }
	
}
