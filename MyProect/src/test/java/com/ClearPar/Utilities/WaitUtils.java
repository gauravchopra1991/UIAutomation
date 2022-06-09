package com.ClearPar.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends BaseClass{

	 public static void waitForElementPresent(WebDriver driver, Duration seconds, By elementTocheck, String msg) {
	        (new WebDriverWait(driver, seconds).pollingEvery(seconds).ignoring(NoSuchElementException.class, StaleElementReferenceException.class).withMessage(msg)).until(ExpectedConditions.visibilityOf(driver.findElement(elementTocheck)));
	        	
}

	
}
