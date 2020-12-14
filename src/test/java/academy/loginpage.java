package academy;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginpage extends browserpath{
	public static Logger log = LogManager.getLogger(browserpath.class.getName());
	public WebDriver driver;
	@Test(dataProvider="getdata")
	public void log(String username,String password) throws IOException
	{
		driver=path(); 
		driver.get("http://qaclickacademy.com/"); 
		loginproperties s =new loginproperties(driver);
		s.login().click();
		s.mail().sendKeys(username);
		s.pass().sendKeys(password); 
		s.accept().click();	
		forgotpassword f =s.forgotp();
		f.emailf().sendKeys("abg@gmail.com");
		f.sendme().click();
		
		log.info("done");
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "kokul@gmail.com";
		data[0][1]= "dhf";
		data[1][0]="abc@gmail.com";
		data[1][1]="djf";
		return data;
	}

}
