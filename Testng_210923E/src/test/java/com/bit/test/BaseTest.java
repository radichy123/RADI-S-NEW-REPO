package com.bit.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
 
  @BeforeMethod(groups = "ui")
  public void beforeMethod() {
	  System.out.println("bm");
  }

  @AfterMethod
  public void afterMethod(ITestResult r) {
	  System.out.println("am");
	  if(r.getStatus()==ITestResult.SUCCESS) {
		  System.out.println(r.getName()+"is passed");
	  }
	  else if(r.getStatus()==ITestResult.FAILURE) {
		  System.out.println(r.getName()+"is failed");
		  System.out.println("took screenShot");
	  }
	  else if(r.getStatus()==ITestResult.SKIP) {
		  System.out.println(r.getName()+"is skipped");
		  
	  }// if something goes wrong ill just take a screen shot 
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
