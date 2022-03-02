package com.bit.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListner implements ITestListener{
	//interface
			
    public void onFinish(ITestContext arg0) {					
        // up to eecute level> henlde by itextcontext
    	System.out.println(arg0.getName()+"is finishes");
    	
        		
    }		

    		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub
    	System.out.println(arg0.getName()+"is started");
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	
    
        		
    }		

   		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.out.println(arg0.getName()+"is failed");
    	System.out.println("call screenshot method");
    	//tracking the behavoir of the test cases ,using itest lisetner 
        		
    }		

   		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.out.println(arg0.getName()+"is skipped");
    	System.out.println("call screenshot method");
        		
    }		

    		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	System.out.println(arg0.getName()+"is starting");
    	
        		
    }		

    		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

}
