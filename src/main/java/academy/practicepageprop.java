package academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practicepageprop {
	WebDriver driver;
	public practicepageprop(WebDriver driver)
	{
		this.driver = driver;
	}
	By prac =By.xpath("//a[contains(text(),'Practice')]");
	By radiobtn = By.xpath("//div[@class='left-align']/fieldset/label[1]/input");
	By country =By.cssSelector("#autocomplete");
	By dropdown = By.cssSelector("#dropdown-class-example");
	By  checkbox =By.xpath("//input[@id='checkBoxOption1']");
	By nextab =By.xpath("//a[@id='opentab']");
	By alert = By.cssSelector("#name");
	By alertconfirm = By.cssSelector("#confirmbtn");
	By webbody =By.cssSelector("#product");
	By webtable =By.xpath("//table[@id='product']/tbody/tr/td[3]");
	By mousemove = By.cssSelector("#mousehover");
	By mousesel =By.xpath("//div[@class='mouse-hover-content']/a[2]");
	
	
	public WebElement practice()
	{
		return driver.findElement(prac);
	}
	public WebElement rbtn()
	{
		return driver.findElement(radiobtn);
	}
  public WebElement cou()
  {
	  return driver.findElement(country);
  }
  public WebElement drop()
  {
	  return driver.findElement(dropdown);
	  
  }
  public WebElement check()
  {
	  return driver.findElement(checkbox);
  }
  public WebElement switchtab()
  {
	  return driver.findElement(nextab);
  }
  public WebElement alertn()
  {
	  return driver.findElement(alert);
  }
  public WebElement alertbtn()
  {
	 return  driver.findElement(alertconfirm);
  }
  public WebElement webstruc()
  {
	  return driver.findElement(webbody);
  }
  public List<WebElement> webtab()
  {
	  return driver.findElements(webtable);
  }
  public WebElement mousem()
  {
	return  driver.findElement(mousemove);

  }
  public WebElement mouseselect()
  {
	  return driver.findElement(mousesel);
  }
}

