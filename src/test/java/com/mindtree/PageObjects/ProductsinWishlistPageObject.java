package com.mindtree.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.Uistore.ProductsWishlistUistore;





public class ProductsinWishlistPageObject extends ProductsWishlistUistore  {
public WebDriver driver;
public ProductsinWishlistPageObject(WebDriver driver)
{
	this.driver=driver;
}

public void Search()
{
	try
	{
		WebElement ClickSearch=driver.findElement(search);
		ClickSearch.click();
		ClickSearch.sendKeys("Lamp");
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
		Thread.sleep(2000L);
		a.moveToElement(ClickFilters).contextClick().build().perform();
		WebElement ClickCategory=driver.findElement(Category);
		ClickCategory.click();
		Thread.sleep(2000L);
	}
	catch(Exception e)
	{
		System.out.println("cannot able to Filters");
		
	}
	
}
	
	
	public void AddWishList()
    {
		try
		{

			WebElement ClickProduct=driver.findElement(Prodc1);
			ClickProduct.click();
			
			WebElement ClickWishList=driver.findElement(WishList);
			ClickWishList.click();
	
		}
		catch(Exception e)
		{
			System.out.println("cannot able to WishList");
			
		}
		
    }
	
     
}
