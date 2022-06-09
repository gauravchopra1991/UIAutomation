package com.ClearPar.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends BaseClass implements ITestListener {
	
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub				
    				
        Logs.info("Failed"+result.getThrowable());
        System.out.println("Take screensh");
        takeScreenshot();
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
    	Logs.info("skipped"+result.getThrowable());
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
	
	

}
