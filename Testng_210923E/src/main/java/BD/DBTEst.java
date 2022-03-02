package BD;

import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class DBTEst {
	
	
	SoftAssert s=new SoftAssert();
	public void test9() {
		s.assertTrue(3>8);
		System.out.println("hi");
		s.assertAll();
	}
	
	@DataProvider(name="login")
	public Object[][] getData(){
		//by default double dimension 
		
		Object [][] o=new Object [2][2];
		
		o[0][0]="user1";
		o[0][1]="pass";
		o[1][0]="user3";
		o[1][1]="pass1";
		return o;
		//parent,child
	}
	
//	@Test(dataProvider="login")
//	public void test5(Object b, Object c) {
//		
//	}
	

}
