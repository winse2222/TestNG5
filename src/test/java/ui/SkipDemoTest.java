package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	
	Boolean datasetup = true;
	
	@Test (enabled=false)
	public void skipTest1() {
		System.out.println("Do not execute");
		
	}
	
	@Test (enabled=false)
	public void skipTest2() {
		System.out.println("Do not execute");
		throw new SkipException("Skipping this test");
	}
	
	@Test (enabled=true)
	public void skipTest3() {
		System.out.println("Do not execute");
		
	}
	
	
}
