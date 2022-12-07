package ui;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class PagetitleTest {
  @Test
  public void titleTest() {
		String exptitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exptext = "Free";
		String acttext = "Free";
		
		SoftAssert softassert = new SoftAssert();
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		String acttitle = driver.getTitle();
		
		softassert.assertEquals(acttitle, exptitle);
		
		softassert.assertEquals(acttext, exptext);
		softassert.assertAll();
		
		
		driver.close();
}
}
