package com.code;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {
	
 public static void main(String [] args)
 {
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46616/ban-vs-sl-2nd-test-sri-lanka-tour-of-bangladesh-2022");
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ltst')]/div[contains(@class,'itms')]/div[3]")).getText());
	driver.close();
 }
	
}
