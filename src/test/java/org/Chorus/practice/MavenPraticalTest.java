package org.Chorus.practice;

import org.main.generic.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MavenPraticalTest {
   @Test
   public void mavenPratical() {
	 String browser = System.getProperty("b");
	String url = System.getProperty("u");
	System.out.println("browser name is=======>>>>"+browser);
	System.out.println("url name is=====>>>"+url);
	//WebDriverUtility webDriverUtility =  new WebDriverUtility();
	//webDriverUtility.openbrowser(browser, 1000 , url);
	
   }
}
