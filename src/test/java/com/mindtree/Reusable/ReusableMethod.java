package com.mindtree.Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.mindtree.Utilities.PropertyFile;

public class ReusableMethod extends PropertyFile {
	Properties pro;
	public ReusableMethod() {
		File src=new File("./Configurations/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getBrowser() {
		String browser=pro.getProperty("browser");
		return browser;
	}
	
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromepath() {
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getIEpath() {
		String IE=pro.getProperty("iepath");
		return IE;
	}
	public String getFirefoxpath() {
		String firefox=pro.getProperty("firefox");
		return firefox;
	}
	public String getExcelpath() {
		String Excel=pro.getProperty("Excel");
		return Excel;
	}
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	

}
