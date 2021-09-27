package com.mindtree.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mindtree.PageObjects.ValidateProductPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.ValidateProductUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateProductsStepDefinition extends ValidateProductUistore  {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger log= LoggerHelper.getLogger(LoggerHelper.class);	
	ValidateProductPageObject st=new ValidateProductPageObject(driver);
	 @Given("^Browser is Initialized$")
	    public void browser_is_initialized() throws Throwable {
		 driver=rc.setup();
	    }

	    @Given("^website is opened$")
	    public void website_is_opened() throws Throwable {
	    	driver.get(rc.baseURL);
	    }
	@When("^User Click Store icon$")
	public void user_Click_Store_icon() throws Throwable {
		ValidateProductPageObject vp=new ValidateProductPageObject(driver);
		vp.Store();
	
		
	}

	@Then("^Click Urban Hadspur$")
	public void click_Urban_Hadspur() throws Throwable {
		ValidateProductPageObject vp=new ValidateProductPageObject(driver);
		vp.CheckHead();
	
	}

	@Then("^Validate the Page$")
	public void validate_the_Page() throws Throwable {
		ValidateProductPageObject vp=new ValidateProductPageObject(driver);
		vp.Tv();
		
	}
	@Then("^Exit Driver$")
    public void exit_driver() throws Throwable {
		driver.quit();
    }

}
