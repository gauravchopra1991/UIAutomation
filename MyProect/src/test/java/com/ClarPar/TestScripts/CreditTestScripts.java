package com.ClarPar.TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ClearPar.Utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.ClearPar.Functions.CreditFunctions ;

public class CreditTestScripts extends BaseClass{
	
	CreditFunctions cf=new CreditFunctions();
	
	@Test
	public void testCreateCredit() {
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String match=driver.findElement(By.xpath("//a[starts-with(@title,'Sri Lanka Women vs Pakistan Women') and starts-with(@class,'text')]")).getText();	
		driver.findElement(By.xpath("//a[starts-with(@title,"+match+") and starts-with(@class,'cb-mat-mnu-itm cb-ovr-flo')]"));
	}
			
				
}
