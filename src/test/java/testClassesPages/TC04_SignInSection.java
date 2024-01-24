package testClassesPages;

import driverClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TC04_SignInSection extends BaseClass{

	@Test
	public void testSignInSectionFunctionality()
	{
		WebElement SignInLink=driver.findElement(By.linkText("Sign In"));
		SignInLink.click();
		
		String expectedSignInPageUrl = "https://www.entrata.com/sign-in";
	    String actualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl, expectedSignInPageUrl, "SignIn page url did not match");
	}
	
	
	@AfterClass
	public void After()
	{
		driver.quit();
	}
	
}
