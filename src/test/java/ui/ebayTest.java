package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ebayTest extends BaseTest {
	
	
	@Test 
	public void ebayTest1() {
		driver.get("https://ebay.com");
	String pageTitle = driver.getTitle();
		System.out.println("Title of the page is "+pageTitle);
		System.out.println("Title of the page is "+pageTitle);
		System.out.println("Title of the page is "+pageTitle);
		System.out.println("Title of the page is "+pageTitle);
		System.out.println("Title of the page is "+pageTitle);
		Assert.assertTrue(true);
		
		
	}
	
	
	
				
}
