package testClassesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import driverClass.BaseClass;
public class TC02_WatchDemo extends BaseClass {
	
	@Test
	public void testWatchDemoLinkFunctionality()
	{
		WebElement demoLink=driver.findElement(By.linkText("Watch Demo"));
		demoLink.click();
		
		String expectedDemoPageUrl = "https://go.entrata.com/watch-demo.html";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedDemoPageUrl, "Demo page url did not match");
	}
	
	@AfterClass
	public void After()
	{
		driver.quit();
	}

}
