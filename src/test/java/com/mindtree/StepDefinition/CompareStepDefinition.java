package com.mindtree.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.PageObjects.CompareDetailsPageObjects;
import com.mindtree.PageObjects.LoginDetailsPageObject;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Uistore.CompareUistore;
import com.mindtree.Utilities.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompareStepDefinition extends CompareUistore {
	WebDriver driver;
	ReusableComponents rc=new ReusableComponents();
	Logger logger= LoggerHelper.getLogger(LoggerHelper.class);	
	CompareDetailsPageObjects cp =new  CompareDetailsPageObjects(driver);
	 @Given("^Hit on Browser$")
	    public void hit_on_browser() throws Throwable {
		 driver=rc.setup();
	    }

	    @Given("^Hit on website$")
	    public void hit_on_website() throws Throwable {
	    	driver.get(rc.baseURL);
	    	//LoginDetailsPageObject lp=new LoginDetailsPageObject(driver);
	    	//lp.LoginData();
	    }

	@When("^User Search Particular Products$")
	public void user_Search_Particular_Products() throws Throwable {
		//CompareDetailsPageObjects cd=new CompareDetailsPageObjects(driver);
		//cd.Search();
		WebElement ClickSearch=driver.findElement(search);
		ClickSearch.click();
		ClickSearch.sendKeys("play tables");
		ClickSearch.sendKeys(Keys.ENTER);
		
	}

	@Then("^Add Some Filters to the Products$")
	public void add_Some_Filters_to_the_Products() throws Throwable {
		logger.info("Add Filters to SearchProducts");
		//CompareDetailsPageObjects cd=new CompareDetailsPageObjects(driver);
		//cd.Recommended();
		Actions a=new Actions(driver);
		WebElement ClickReco=driver.findElement(Recom);
		a.moveToElement(ClickReco).contextClick().build().perform();
		WebElement ClickHigh=driver.findElement(High);
		ClickHigh.click();
	
	}


	@Then("^Add the products to comapre$")
	public void add_the_products_to_comapre() throws Throwable {
		logger.info("Add Compare to SearchProducts");
		Actions a=new Actions(driver);
		WebElement ClickPro1=driver.findElement(pro1);
		a.moveToElement(ClickPro1).contextClick().build().perform();
		WebElement ClickComp1=driver.findElement(Comp1);
		ClickComp1.click();
		WebElement ClickPro2=driver.findElement(pro2);
		a.moveToElement(ClickPro2).contextClick().build().perform();
		WebElement ClickComp2=driver.findElement(Comp2);
		ClickComp2.click();
		//WebElement ClickComp=driver.findElement(Comp);
		//ClickComp.click();
		
		
		
	}

    @Then("^Quit the Driver$")
    public void quit_the_driver() throws Throwable {
    	driver.quit();
    }
    

}
