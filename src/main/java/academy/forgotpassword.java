package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpassword {
	WebDriver driver;
	
	
	public forgotpassword(WebDriver driver)
	{
		this.driver= driver;
	}
	By forgemail = By.cssSelector("#user_email");
	By ins = By.xpath("//input[@name='commit']");
	
	
	public WebElement emailf()
	{
		return driver.findElement(forgemail);
	}
	public WebElement sendme()
	{
		return driver.findElement(ins);
	}
	
	
	

}
