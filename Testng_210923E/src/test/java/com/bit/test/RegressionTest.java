package com.bit.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BD.DBTEst;

public class RegressionTest extends BaseTest {
	
	@Test(dataProviderClass = DBTEst.class,dataProvider="login")
	public void test5(Object b, Object c) {
		
	}
	
	@Parameters({"browser","url"})
	@Test(groups = "ui",priority=1,enabled=false)
	public void test2(String b,String u) {
		System.out.println("test2");
		if(b.equals("chrome")) {
			System.out.println("open chrome");
		} else if(b.equals("firefox")) {
			System.out.println("open forefox");
	}
	}
	@Test(groups = { "ui", "backEnd" })
	public void test3() {
		System.out.println("test3");
	}

}
