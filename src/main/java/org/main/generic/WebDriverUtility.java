package org.main.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import javax.lang.model.element.Element;
import javax.swing.JSeparator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * this method used for lunching browser
 * 
 * @author Sachin.g.s
 *
 */

public class WebDriverUtility {
	WebDriver driver;
	public WebDriver luanchbrowser(String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		case "firefox":
			WebDriverManager.chromedriver().setup();

		}
		return driver;

	}
	/**
	 * this method used for maximize 
	 * @param driver
	 */
	public  void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();

	}
	/**
	 * this method for timeutility
	 * @param driver
	 * @param i
	 */
	public void waittillpageload(WebDriver driver,long i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void navigatepage(WebDriver driver, String url) {
		driver.get(url);

	}

	public WebDriver openbrowser(String browser,long Longtimeout,String url) {

		WebDriver driver= luanchbrowser(browser);
		maximizeBrowser(driver);
		waittillpageload(driver,Longtimeout);
		navigatepage(driver,url);
		return driver;


	}
	/**
	 * this method is used to double click on webpage 
	 */
	public void closebrowser(WebDriver driver){
		driver.quit();

	}

	//	/**
	//	 * this window handle 
	//	 * @param driver
	//	 */
	//	public void handlegetwindow(WebDriver driver) {
	//		Set<String> window1 = driver.getWindowHandles();
	//		for(String string:window1) {
	//			driver.switchTo().window(string);
	//			if(string.contains("tyss"))
	//				break;
	//		}
	//		
	//}
	/**
	 * this method used for javaecuter
	 * @param driver
	 */

	public void jsIntaillization(WebDriver driver) {

		JavascriptExecutor jsExcutor = (JavascriptExecutor) driver;


	}
	JavascriptExecutor jsExcutor ;
	public void openApplicationUsing(String url) {
		JavascriptExecutor jsExcutor = null ;
		jsExcutor.executeAsyncScript("window.location=arguments[0]", url);
	}
	public void sendkeysusing(WebElement element,String data) {

		jsExcutor.executeAsyncScript("arguments[0].value=arguments[1]", element,data);

	}
	public void clickUsingJS(WebElement element) {
		jsExcutor.executeScript("arguments[0].click()", element);


	}
	public void scrolltillelementusingJS(WebElement element ) {
		jsExcutor.executeScript("arguments[0].scrollIntoView()", element);

	}
	/**
	 * this method used for take screenshot method 
	 * @param driver
	 * @param javaUtiltiy
	 * @param className
	 * @return
	 * @throws IOException
	 */
	public String screenShot(WebDriver driver , JavaUtiltiy javaUtiltiy , String className) throws IOException {
		String curretTime = javaUtiltiy.currentTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot"+className+"_"+curretTime+".png");
		FileUtils.copyFile(src, dst);
		
		return dst.getAbsolutePath();

	}
	public String screenshot(WebDriver driver) {
		TakesScreenshot ts= (TakesScreenshot)driver;
	String temptath = ts.getScreenshotAs(OutputType.BASE64);
		return temptath;
		
	}
	/**
	 * THIS METHOD USED FOR MOUSEHOVER METHOD 
	 * @param driver
	 * @param element
	 */
	public void mouseoverelement(WebDriver driver, WebElement element) {
		Actions at= new Actions(driver);
		at.moveToElement(element).perform();
	}
	/**
	 * this method used to double click method 
	 * @param driver
	 */
	public void doubleclick(WebDriver driver) {
		new Actions(driver).doubleClick().perform();

	}
	/**
	 * this method used for closeing the browser useing quit method 
	 * @param driver
	 */
	public void  closebrowser1(WebDriver driver) {
		driver.quit();

	}
	/**
	 * THIS method used for dynmaic xpath into the webelement
	 * @param dynmaicxpath
	 * @param replacedata
	 * @param driver
	 * @return
	 */
	public WebElement convertdynmaicxpathIntowebelement(String dynmaicxpath , String replacedata , WebDriver driver ) {
		String requriedxpath = String.format(dynmaicxpath, replacedata);
		WebElement element = driver.findElement(By.xpath(requriedxpath));
		return element;

	}
	/**
	 * this method used to convert the dynamic xpath by locator
	 * @param dynmaicxpath
	 * @param replacedata
	 * @return
	 */

	public By convertdynmaicxpathIntobyclass(String dynmaicxpath ,String  replacedata) {
		String requriedxpath = String.format(dynmaicxpath, replacedata);
		By element = By.xpath(requriedxpath);
		return element ;

	}
	/**
	 * 
	 * @param webelement
	 */
	public void Selectclass(WebElement webelement) {
		Select s= new Select(webelement);
		s.selectByIndex(0);

	}
	/**
	 * 
	 * @param driver
	 * @param webElement
	 */
	public void switchtowindow(WebDriver driver) {
		Set<String> wind = driver.getWindowHandles();
		for(String Browser:wind) {
			driver.switchTo().window(Browser);
			
		}
	}

	
	public void ParentWindow(String id) {
		driver.switchTo().window(id);
		
	}
	/**
	 * this method used for expected utility wait method 
	 * @param driver
	 * @param longtime
	 * @param string
	 */
	public void waittillElement(WebDriver driver , long longtime,WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(longtime));
		wait.until(ExpectedConditions.visibilityOf(webElement));

	}
	public void verifyresulth(String createteopportuininame, String targetaudience) {
		Assert.assertEquals(createteopportuininame   , targetaudience);

	}
	public void verifyresulth(boolean condition) {
		Assert.assertTrue(condition);
	}

	public void verifywebpage(WebElement element , WebDriver driver , long longtime , String expectedresulth, String expectedText) {
		for(;;) {
			try {
				Assert.assertEquals(element.getText(), expectedText);
				break;
			}
			catch(Exception e){

			}
		}

	}
	public void switchtohandle(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void handlegetwindow(WebDriver driver,String orgName) {
		Set<String> window1 = driver.getWindowHandles();
		for(String string:window1) {
			driver.switchTo().window(string);
			if(string.contains(orgName))
				break;
		}

	}
	

}
























