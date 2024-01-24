package testClassesPages;

import java.io.File;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC03_WatchDemoForm extends TC02_WatchDemo{

	@Test
	public void TestwatchDemoForm() throws IOException, InvalidFormatException, InterruptedException
	{
		String path = "src/main/resources/ExcelFile/Data.xlsx";

		File file = new File(path);
		String absolutePath = file.getAbsolutePath();
		
		XSSFWorkbook wb=new XSSFWorkbook(absolutePath);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++)
        {
			String FirstName=sheet.getRow(i).getCell(0).getStringCellValue();
			String LastName=sheet.getRow(i).getCell(1).getStringCellValue();
			String Email=sheet.getRow(i).getCell(2).getStringCellValue();
			String CompanyName=sheet.getRow(i).getCell(3).getStringCellValue();
			String PhoneNo = sheet.getRow(i).getCell(4).getStringCellValue();	
			String UnitCount=sheet.getRow(i).getCell(5).getStringCellValue();
			String Jobtitle=sheet.getRow(i).getCell(6).getStringCellValue();
			
			WebElement FirstNameTxt=driver.findElement(By.id("FirstName"));
			FirstNameTxt.sendKeys(FirstName);
			Thread.sleep(2000);
			
			WebElement LastNameTxt=driver.findElement(By.id("LastName"));
			LastNameTxt.sendKeys(LastName);
			Thread.sleep(2000);
			
			WebElement EmailTxt=driver.findElement(By.id("Email"));
			EmailTxt.sendKeys(Email);
			Thread.sleep(2000);
			
			WebElement CompanyNameTxt=driver.findElement(By.id("Company"));
			CompanyNameTxt.sendKeys(CompanyName);
			Thread.sleep(2000);
			
			WebElement PhoneNoTxt=driver.findElement(By.id("Phone"));
			PhoneNoTxt.sendKeys(PhoneNo);
			Thread.sleep(2000);
			
			WebElement UnitCountDrop = driver.findElement(By.id("Unit_Count__c"));
        	Select Unitcountdp = new Select(UnitCountDrop);
        	Unitcountdp.selectByVisibleText(UnitCount);
        	Thread.sleep(2000);
			
        	WebElement JobtitleTxt=driver.findElement(By.id("Title"));
			JobtitleTxt.sendKeys(Jobtitle);
			Thread.sleep(2000);
			
			WebElement WatchDemoBtn=driver.findElement(By.xpath("//button[@type=\"submit\" and text()=\"Watch Demo\"]"));
			/* WatchDemoBtn.click(); */
		}
	}
}
