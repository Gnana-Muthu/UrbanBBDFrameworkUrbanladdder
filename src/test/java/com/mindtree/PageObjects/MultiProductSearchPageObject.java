package com.mindtree.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.Uistore.MultiProductSearchUistore;

public class MultiProductSearchPageObject extends MultiProductSearchUistore {
public WebDriver driver;
	
	public MultiProductSearchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Search()
    {
		try
		{
			WebElement ClickSearch=driver.findElement(search);
			ClickSearch.click();
			ClickSearch.sendKeys("Bed");
			Thread.sleep(2000L);
			ClickSearch.sendKeys(Keys.ENTER);
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Search");
			
		}
		
    }
}
