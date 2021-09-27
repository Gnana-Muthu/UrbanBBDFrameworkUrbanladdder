package com.mindtree.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.Uistore.SearchProductsUistore;



public class GetProductDetailsPageObject extends SearchProductsUistore {
public WebDriver driver;
	
	public GetProductDetailsPageObject(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Search()
    {
		try
		{
			WebElement ClickSearch=driver.findElement(search);
			ClickSearch.click();
			ClickSearch.sendKeys("bed");
			Thread.sleep(2000L);
			ClickSearch.sendKeys(Keys.ENTER);
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }
	public void Filters()
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement ClickFilters=driver.findElement(Filter1);
			a.moveToElement(ClickFilters).contextClick().build().perform();
			WebElement ClickCategory=driver.findElement(Category);
			ClickCategory.click();
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Filter1");
			
		}
		
    }
     
}
