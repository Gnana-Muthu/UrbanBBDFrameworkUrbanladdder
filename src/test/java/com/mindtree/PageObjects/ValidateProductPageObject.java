package com.mindtree.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.Uistore.SearchProductsUistore;
import com.mindtree.Uistore.ValidateProductUistore;



public class ValidateProductPageObject extends ValidateProductUistore {
public WebDriver driver;
	
	public ValidateProductPageObject(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Store()
    {
		try
		{
			WebElement ClickStore=driver.findElement(store);
			ClickStore.click();
			WebElement Clickpune=driver.findElement(pune);
			Clickpune.click();
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Store");
			
		}
		
    }
	public void CheckHead()
    {
		try
		{
			WebElement HeadCheck=driver.findElement(HeadValue);
			String Actualvalue=HeadCheck.getText();
			String Expectedvalue="Urban Ladder Furniture Store - Hadapsar";
			Assert.assertEquals(Expectedvalue,Actualvalue);
			System.out.println((HeadCheck).getText());
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Store");
			
		}
		
    }
	public void Tv()
    {
		try
		{
			WebElement ClickTv=driver.findElement(Tv);
			ClickTv.click();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Tv");
			
		}
		
    }
	
     
}
