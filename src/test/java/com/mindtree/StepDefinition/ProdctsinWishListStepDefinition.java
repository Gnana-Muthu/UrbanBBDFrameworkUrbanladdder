package com.mindtree.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.PageObjects.ProductsinWishlistPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.ProductsWishlistUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProdctsinWishListStepDefinition extends ProductsWishlistUistore {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger log= LoggerHelper.getLogger(LoggerHelper.class);	
	ProductsinWishlistPageObject aw=new ProductsinWishlistPageObject(driver);

    @Given("^Browser is hitted$")
    public void browser_is_hitted() throws Throwable {
    	driver=rc.setup();
    }

    @Given("^Website is launced$")
    public void website_is_launced() throws Throwable {
    	driver.get(rc.baseURL);
    }

@When("^User enter data in search bar$")
public void user_enter_data_in_search_bar() throws Throwable {
	ProductsinWishlistPageObject pw=new ProductsinWishlistPageObject(driver);
	pw.Search();
	log.info("SearchProducts");

	
}

@Then("^User click particular product$")
public void user_click_particular_product() throws Throwable {
	ProductsinWishlistPageObject pw=new ProductsinWishlistPageObject(driver);
	pw.Filters();
	

}

@Then("^Add the product to wishlist$")
public void add_the_product_to_wishlist() throws Throwable {
	ProductsinWishlistPageObject pw=new ProductsinWishlistPageObject(driver);
	pw.AddWishList();
	
}
@Then("^Driver is exited$")
public void driver_is_exited() throws Throwable {
	driver.quit();
}

}
