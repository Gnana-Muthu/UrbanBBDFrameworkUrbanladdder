package com.mindtree.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Uistore.LoginUistore;
import com.mindtree.Uistore.SearchProductsUistore;



public class LoginDetailsPageObject extends LoginUistore {
public WebDriver driver;
ReusableMethod rm=new ReusableMethod();	
	public LoginDetailsPageObject(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Track()
    {
		try
		{
			WebElement Clicktrack=driver.findElement(track);
			Clicktrack.click();
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to track");
			
		}
		
    }
	public void LoginDetails()
    {
		try
		{
			WebElement Clicklogin=driver.findElement(login);
			Clicklogin.click();
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Login");
			
		}
		
    }
	public void LoginData()
    {
		try
		{
			WebElement EnterLogin=driver.findElement(User);
			EnterLogin.sendKeys(rm.getUsername());
			WebElement EnterPassword=driver.findElement(Password);
			EnterPassword.sendKeys(rm.getPassword());
			WebElement ClickSubmit=driver.findElement(Submit);
			ClickSubmit.click();
		}
		catch(Exception e)
		{
			System.out.println("cannot able to LoginData");
			
		}
		
    }
	
     
}
