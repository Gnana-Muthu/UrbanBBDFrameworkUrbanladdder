package com.mindtree.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.Uistore.ContactUistore;

public class HelpPageObject extends ContactUistore {
public WebDriver driver;
	
	public HelpPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Helptab()
    {
		try
		{
		WebElement ClickHelp=driver.findElement(Help);
		ClickHelp.click();
		
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }

	public void Helpquery()
    {
		try
		{
			WebElement ClickSearch=driver.findElement(search);
			ClickSearch.click();		
		ClickSearch.sendKeys("How do I track my order status?");
		ClickSearch.sendKeys(Keys.ENTER);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }

}
