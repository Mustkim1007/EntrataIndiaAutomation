package driverClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;
    
    @BeforeClass
	public void setUp() throws IOException 
    {
    	File chromeDriverFile = new File(getClass().getResource("/Chromedriver/chromedriver.exe").getFile());
    	System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.entrata.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
