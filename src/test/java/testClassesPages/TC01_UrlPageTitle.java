package testClassesPages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import driverClass.BaseClass;

public class TC01_UrlPageTitle extends BaseClass {

	@Test
	public void testPageTitle()
	{
       String actualtitle = driver.getTitle();
       String expectedtitle = "Property Management Software | Entrata";
       Assert.assertTrue(actualtitle.contains(expectedtitle));
	}
	
	@AfterClass
	public void After()
	{
		driver.quit();
	}

}
