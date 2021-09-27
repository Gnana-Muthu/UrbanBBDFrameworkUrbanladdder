package com.mindtree.StepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObjects.ContactPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.ContactUistore;
import com.mindtree.Uistore.HelpUistore;
import com.mindtree.Utilities.LoggerHelper;

@RunWith(Cucumber.class)
public class ContactusStepDefinition extends ContactUistore{
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger logger= LoggerHelper.getLogger(LoggerHelper.class);
	@Given("^Start the Browser$")
    public void start_the_browser() throws Throwable {
		 driver=rc.setup(); 
    }

    @Given("^Start the website$")
    public void start_the_website() throws Throwable {
    	driver.get(rc.baseURL);
    }

    @When("^User Click contact us$")
    public void user_click_contact_us() throws Throwable {
    	ContactPageObject cp =new ContactPageObject(driver);
    	cp.Helptab();
  
    	
    	
            }

    @Then("^User click pintrest$")
    public void user_click_pintrest() throws Throwable {
    	WebElement Contact=driver.findElement(contact);
		Contact.click();
		WebElement Contactpin=driver.findElement(pin);
		Contactpin.click();
    }

    @Then("^Driver is quitted$")
    public void driver_is_quitted() throws Throwable {
        driver.quit();
    }

}