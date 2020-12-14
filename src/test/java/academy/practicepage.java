package academy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practicepage extends browserpath {
	public static Logger log = LogManager.getLogger(browserpath.class.getName());
	public WebDriver driver;
@Test
public void pract() throws IOException, InterruptedException
{
	 
	  driver=path();
	  driver.get("http://qaclickacademy.com/");
	  log.info("entered browser");
	  practicepageprop p =new practicepageprop(driver);
	  p.practice().click();
	  log.info("entered practice page");
	  p.rbtn().click();
      p.cou().sendKeys("ind");
      Thread.sleep(4000);
	  int i=0;
	  while(i<1)
	  {
		p.cou().sendKeys(Keys.ARROW_DOWN);
		i++;
	  }
	p.cou().sendKeys(Keys.ENTER);
	p.drop().click();
	int t=0;
	while(t<2)
	{
		p.drop().sendKeys(Keys.ARROW_DOWN);
		t++;
	}
	p.drop().sendKeys(Keys.ENTER);
    p.check().click();
	p.switchtab().click();
	Set<String> win =  driver.getWindowHandles();
	Iterator<String> wins = win.iterator();
	String iter1 =wins.next();
	String iter2 =wins.next();
	driver.switchTo().window(iter2);
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(iter1);
	System.out.println(driver.getCurrentUrl());
	p.alertn().sendKeys("start");
	p.alertbtn().click();
	driver.switchTo().alert().accept();
	p.webstruc();
	int total =p.webtab().size();
	System.out.println(total);
	for(int z=0;z<total;z++)
	{
		System.out.println(p.webtab().get(z).getText());
		
	}
	  Actions a = new Actions(driver);
	  a.moveToElement(p.mousem()).build().perform();
	  p.mouseselect().click();
	
	log.info("tested practice page successfully");
}

}
