 package org.torychros.objectReposi;

import org.main.generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_Pages {
	private WebDriver driver;
	private String dynamicxpath="//a[.='%s']";
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement adminstrationicon;
	@FindBy(xpath = "//a[@href='index.php?module=Users&action=Logout']") private WebElement signoutpage;
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]") private WebElement opporclick;
	@FindBy(xpath = "//input[@class='crmbutton small delete']") private WebElement delectbutton;
	//initiallization all variables 
	public Common_Pages(WebDriver driver) {
		this.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	//busines libeery 
	/**
	 * this method used for dynamic xpath 
	 * @param tabname
	 * @param webDriverUtility
	 * @throws InterruptedException 
	 */
	 public void  clickopportuinities() throws InterruptedException {
		 opporclick.click();
		 
	 }
	 
	public void clickrequrired(TabName tabname ) {
		String requriedxpath = String.format(dynamicxpath,tabname.getTabNames());
		driver .findElement(By.xpath(requriedxpath)).click();
	}
	public void signoutAction(WebDriverUtility webDriverUtility) {
		webDriverUtility.mouseoverelement(driver, adminstrationicon);
		webDriverUtility.convertdynmaicxpathIntowebelement(dynamicxpath, "Sign Out", driver);
		

}
	public void delectbutton() {
		
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
	
	
