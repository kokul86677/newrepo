package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginproperties {
	WebDriver driver;
	
	
	public loginproperties(WebDriver driver)
	{
		this.driver= driver;
	}
	By loginbutton = By.xpath("//span[contains(text(),'Login')]");
	By email =By.xpath("//input[@id='user_email']");
	By password = By.cssSelector("#user_password");
	By confirm = By.cssSelector(".btn.btn-primary.btn-md.login-button");
	By forgot = By.xpath("//a[@class='link-below-button']");
	
	
	public WebElement login()
	{
		  return driver.findElement(loginbutton);
	}
	public WebElement mail()
	{
		return driver.findElement(email);
	}
	public WebElement pass()
	{
		 return driver.findElement(password);
	}
	public WebElement accept()
	{
		 return driver.findElement(confirm);
	}
	
	 public forgotpassword forgotp()
	{
		 driver.findElement(forgot).click();
		forgotpassword f = new forgotpassword(driver);
		return f;
		
	}
	
	

}
