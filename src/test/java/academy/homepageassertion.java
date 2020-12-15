package academy;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepageassertion extends browserpath{
	public static Logger log = LogManager.getLogger(browserpath.class.getName());
	public WebDriver driver;
	@Test
	public void home() throws IOException
	{
		driver=path();
		driver.get("http://qaclickacademy.com/");
		homepageprop p =new homepageprop(driver);
		Assert.assertFalse(p.course().isDisplayed());
		Assert.assertTrue(p.nav().isDisplayed());
		Assert.assertTrue(p.mailn().isDisplayed());
		log.debug("donef");
		log.error("not done");
		driver.close();
		//driver.quit();
		
	}
	
	
	

}
