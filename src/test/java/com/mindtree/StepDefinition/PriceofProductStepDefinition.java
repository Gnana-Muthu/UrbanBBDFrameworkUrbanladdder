package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.PriceofProductsPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.mindtree.Uistore.PriceofProductsUistore;

public class PriceofProductStepDefinition extends PriceofProductsUistore   {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger logger= LoggerHelper.getLogger(LoggerHelper.class);	
	
	@Given("^Launch the Browser$")
    public void launch_the_browser() throws Throwable {
		driver=rc.setup();
    }

    @Given("^website is Navigated$")
    public void website_is_navigated() throws Throwable {
    	driver.get(rc.baseURL);
    }

	@When("^Search Particular Products as required$")
	public void user_Search_Particular_Products() throws Throwable {
		PriceofProductsPageObject pc=new PriceofProductsPageObject(driver);
		pc.Kidsroom();
		pc.KidsChair();
		
		
		
	}

	@Then("^Filters to the Products is added$")
	public void add_Some_Filters_to_the_Products() throws Throwable {
		PriceofProductsPageObject pc=new PriceofProductsPageObject(driver);
		pc.Search();
		
	}

	@Then("^Add the products to cart$")
	public void add_the_products_to_cart() throws Throwable {
		PriceofProductsPageObject pc=new PriceofProductsPageObject(driver);
		pc.Addtocart();
	
	}
	 @Then("^Terminate the Driver$")
	    public void terminate_the_driver() throws Throwable {
		 driver.quit();
	    }

	

}
