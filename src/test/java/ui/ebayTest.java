package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ebayTest extends BaseTest {
	
	
	@Test 
	public void ebayTest1() {
		driver.get("https://ebay.com");
		Assert.assertTrue(true);
		
		
	}
	
	
	
				
}
