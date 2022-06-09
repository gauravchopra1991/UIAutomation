package com.ClearPar.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver; 

public enum CommonLocators  {

	USERID(By.xpath("//*[@type='text']")),
	PASSWORD(By.xpath("//input[@name='password']")),
	LOGIN(By.xpath("//input[@name='btnLogin']"));
	
	private By locator;
	
	CommonLocators(By locator)		
	{
		this.locator=locator;
	}
	 public By getLocator(){
	    	return this.locator;
	    }
}
