package academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageprop {
	WebDriver driver;
	public homepageprop(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='text-center']/h2")
	WebElement text;
    @FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
    WebElement navigationbar;
    @FindBy(xpath="//span[contains(text(),'info')]")
    WebElement mailbar;
    
    public WebElement course()
    {
    	return text;
    }
    public WebElement nav()
    {
    	return navigationbar;
    }
    public WebElement mailn()
    {
    	return mailbar;
    }
}

