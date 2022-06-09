package com.ClearPar.Functions;

import org.openqa.selenium.By;


public enum CreditLocators {
	USERID(By.xpath("//input[@name='uid'])")),
	PASSWORD(By.xpath("//input[@name='uid'])"));
	private By locator;
	
	CreditLocators(By locator)		
	{
		this.locator=locator;
	}
	 public By getLocator(){
	    	return this.locator;
	    }

}

