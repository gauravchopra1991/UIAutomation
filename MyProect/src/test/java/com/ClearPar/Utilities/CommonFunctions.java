package com.ClearPar.Utilities;


import java.time.Duration;


public class CommonFunctions extends BaseClass{
	
	
	public void loginToClearpar()  
	{
		driver.get(baseUrl);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WaitUtils.waitForElementPresent(driver, Duration.ofSeconds(2),CommonLocators.USERID.getLocator(), "User Id Found");
		driver.findElement(CommonLocators.USERID.getLocator()).sendKeys(username);
		driver.findElement(CommonLocators.PASSWORD.getLocator()).sendKeys(password);
		driver.findElement(CommonLocators.LOGIN.getLocator()).click();
	}

}
