package com.mindtree.Uistore;

import org.openqa.selenium.By;

public class LoginUistore {
	public static By track=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[1]/a");
	public static By login=By.xpath("//*[@id=\"app-container\"]/div/main/section/form[2]/button");
	public static By Submit=By.id("ul_site_login");
	public static By User=By.xpath("//input[@placeholder='Email Address'][1]");
	public static By Password=By.xpath("//input[@placeholder='Password'][1]");

	//public static By User=By.id("spree_user_email");
	//public static By password=By.id("spree_user_password");
}
