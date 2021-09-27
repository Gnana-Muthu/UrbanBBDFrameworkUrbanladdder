package com.mindtree.Reusable;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.mindtree.Utilities.PropertyFile;
import com.mindtree.Utilities.Sendmail;



public class ReusableComponents {

	PropertyFile rc=new PropertyFile();
	public String baseURL=rc.getApplicationURL();
	public static WebDriver driver;
	public static Logger logger; 
	public String br=rc.getBrowser();
	
	
	@BeforeClass
	public WebDriver setup() {
		
		logger=Logger.getLogger("Urban");
		BasicConfigurator.configure();
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", rc.getChromepath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", rc.getFirefoxpath());
			driver=new FirefoxDriver();
		} 
		else if(br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", rc.getIEpath());
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	  public void getScreenshot(String result) throws IOException {
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src,new File("C:\\Users\\M1070888\\git\\repository\\AmazonBBDProject\\Screenshots\\"+result+"screenshot.png"));
	}
	
	
	
	
}
