package com.mindtree.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.PageObjects.GetProductDetailsPageObject;
import com.mindtree.PageObjects.SearchProductsPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.SearchProductsUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchProductsStepStepDefinition extends SearchProductsUistore  {
	WebDriver driver;
	 ReusableComponents rc =new  ReusableComponents ();
	Logger logger= LoggerHelper.getLogger(LoggerHelper.class);	
	GetProductDetailsPageObject sp =new GetProductDetailsPageObject(driver);
	 @Given("^Open the Browser$")
	    public void open_the_browser() throws Throwable {
		 driver=rc.setup();
	    }

	    @Given("^Open is website$")
	    public void open_is_website() throws Throwable {
	    	driver.get(rc.baseURL);
	    }
	@Then("^Click Search bar$")
	public void click_Search_bar() throws Throwable {
		logger.info("SearchProducts");
		SearchProductsPageObject sp=new SearchProductsPageObject(driver);
		sp.Search();
	
		
	}

	@When("^User Enter Data and Search data$")
	public void user_Enter_Data_and_Search_data() throws Throwable {
		logger.info("Add Filters to SearchProducts");
		SearchProductsPageObject sp=new SearchProductsPageObject(driver);
		sp.Filters();
		
	}
	 @Then("^Driver is Terminated$")
	    public void driver_is_terminated() throws Throwable {
		 driver.quit();
	    }
}
