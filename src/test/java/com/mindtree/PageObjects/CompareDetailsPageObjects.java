package com.mindtree.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.Uistore.CompareUistore;



public class CompareDetailsPageObjects extends CompareUistore {
public WebDriver driver;
	
	public CompareDetailsPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Search()
    {
		try
		{
			WebElement ClickSearch=driver.findElement(search);
			ClickSearch.click();
			ClickSearch.sendKeys("play tables");
			ClickSearch.sendKeys(Keys.ENTER);
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }
	/*public void Filters()
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
			System.out.println("cannot able to Search");
			
		}
		
    }*/
	public void Recommended()
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement ClickReco=driver.findElement(Recom);
			a.moveToElement(ClickReco).contextClick().build().perform();
			WebElement ClickHigh=driver.findElement(High);
			ClickHigh.click();
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }
	public void Compare()
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement ClickPro1=driver.findElement(pro1);
			a.moveToElement(ClickPro1).contextClick().build().perform();
			WebElement ClickComp1=driver.findElement(Comp1);
			ClickComp1.click();
			WebElement ClickPro2=driver.findElement(pro2);
			a.moveToElement(ClickPro2).contextClick().build().perform();
			WebElement ClickComp2=driver.findElement(Comp2);
			ClickComp2.click();
			WebElement ClickComp=driver.findElement(Comp);
			ClickComp.click();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Compare");
			
		}
		
    }
	
     
}
