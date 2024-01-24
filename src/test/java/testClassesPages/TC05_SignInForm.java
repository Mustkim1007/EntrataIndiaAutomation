package testClassesPages;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TC05_SignInForm extends TC04_SignInSection{

	@Test
	public void testSignInForm() throws InterruptedException, IOException
	{	
		WebElement ClientLogin=driver.findElement(By.linkText("Property Manager Login"));
		ClientLogin.click();
		
		Thread.sleep(2000);
		
		String path = "src/main/resources/ExcelFile/Data.xlsx";

		File file = new File(path);
		String absolutePath = file.getAbsolutePath();
		
		XSSFWorkbook wb=new XSSFWorkbook(absolutePath);
		XSSFSheet sheet=wb.getSheetAt(1);
		
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++)
        {
			String Username=sheet.getRow(i).getCell(0).getStringCellValue();
			String Password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			WebElement UserName=driver.findElement(By.id("entrata-username"));
			UserName.sendKeys(Username);
			Thread.sleep(2000);
			
			WebElement PassWord=driver.findElement(By.id("entrata-password"));
			PassWord.sendKeys(Password);
			Thread.sleep(2000);
			
			WebElement SignInBtn=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			SignInBtn.click();
			Thread.sleep(2000);
			
			String expectedmsg="Login Successfully";
			String actualmsg=driver.findElement(By.id("statusMessage")).getText();
			Thread.sleep(2000);
			
			Assert.assertEquals(actualmsg, expectedmsg, "Not LoggedIn");
        }
		
	}
	
	
	@AfterClass
	public void After()
	{
		driver.quit();
	}
}
