package com.mindtree.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.MultiProductSearchUistore;

@RunWith(Cucumber.class)
public class MultiProductSearchStepDefinition extends MultiProductSearchUistore {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
    @Given("^Browser is ON$")
    public void browser_is_on() throws Throwable {
    	 driver=rc.setup();
    }   

    @Given("^website is Connected$")
    public void website_is_connected() throws Throwable {
    	driver.get(rc.baseURL);
    }


    @When("^User Search Multi Products like \"([^\"]*)\"$")
    public void user_search_multi_products_like_something(String products) throws Throwable {
    	WebElement ClickSearch=driver.findElement(search);
		ClickSearch.click();
		ClickSearch.sendKeys(products);
		ClickSearch.sendKeys(Keys.ENTER);
    }


    @Then("^Drivers is at End Stage$")
    public void drivers_is_at_end_stage() throws Throwable {
    	driver.quit();
    }

}

