package com.mindtree.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
Properties pro;
	
	public PropertyFile() {
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
	

}
