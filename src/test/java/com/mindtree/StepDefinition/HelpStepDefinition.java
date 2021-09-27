package com.mindtree.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObjects.HelpPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.HelpUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpStepDefinition extends HelpUistore {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger logger= LoggerHelper.getLogger(LoggerHelper.class);
	  @Given("^Browser is opened$")
	    public void browser_is_opened() throws Throwable {
		  driver=rc.setup();
	    }

	    @Given("^Initilise the website$")
	    public void initilise_the_website() throws Throwable {
	    	driver.get(rc.baseURL);
	    }

	    @When("^User Click Help button$")
	    public void user_click_help_button() throws Throwable {
	    	HelpPageObject hp =new HelpPageObject(driver);
	    	hp.Helptab();
	    	
			
	    }

	    @Then("^Send Query and Search$")
	    public void send_query_and_search() throws Throwable {
	    	HelpPageObject hp =new HelpPageObject(driver);
	    	hp.Helpquery();

			
	    }
	    @Then("^End card the Driver$")
	    public void end_card_the_driver() throws Throwable {
	        driver.quit();
	    }


}
