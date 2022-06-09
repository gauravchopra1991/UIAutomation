package com.ClearPar.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig rc=new ReadConfig();
	public String baseUrl=rc.getPropertyName("baseUrl");
	public String username=rc.getPropertyName("username");
	public String password=rc.getPropertyName("password");
	public static WebDriver driver;
	public String browser = rc.getPropertyName("browser");
	@BeforeClass
	public void setup( )
	{
		switch(browser) 
		{ 
		case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		}
	}
	@AfterClass
	public void teardown()
	{
	driver.quit();
	}
	
	public void takeScreenshot() {
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:/Users/Windows_11/eclipse-workspace/MyProect/Screenshots/screenshot.jpg "));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
