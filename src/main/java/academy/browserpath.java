package academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class browserpath {
	public WebDriver driver;
	@Test
	public WebDriver path() throws IOException
	{
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\kokul\\eclipse-workspace\\E2Eframework\\src\\main\\java\\academy\\path.properties");
		p.load(f);
		//String browsername =System.getProperty("browser");
	   String browsername =p.getProperty("browser");
	    if(browsername.contains("chrome"))
	    { 
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\kokul\\Documents\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("headless");
		driver = new ChromeDriver(op);
		}
	    else if (browsername.equals("edge"))
	    	{
	   	System.setProperty("webdriver.edge.driver","C:\\Users\\kokul\\Documents\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    	
	    }
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    return driver;
	       
		
	}
	public String getscreenshotpath(String testcasename,WebDriver driver) throws IOException
	{
	File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dest = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
	FileUtils.copyFile(s, new File(dest));
	return dest;
	}
	 

}
