package ui;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class LoginTest {

		@Test (groups="functional",  description="This is LoginTest1")
		public void loginTest1() {
			System.out.println("Login1"); 
				}
	
		@Test (groups={"functional","regression"})
		public void loginTest2() {
			System.out.println("Login2");
				}

		@Test (groups={"bvt","regression"}, dependsOnMethods = "loginTest1")
		public void loginTest3() {
			System.out.println("Login3");
		}
		
		
		@Test(groups="bvt")
		public void loginTest4() {
			System.out.println("Login4");
		}
	
	
	

}
