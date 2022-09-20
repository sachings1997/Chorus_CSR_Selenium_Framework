package org.Chorus.practice;

import org.main.generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jspratices {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		WebDriverUtility webDriverUtility = new  WebDriverUtility();
		driver.manage().window().maximize();
		webDriverUtility.jsIntaillization(driver);
		webDriverUtility.openApplicationUsing("http://rmgtestingserver:8888/");
		webDriverUtility.sendkeysusing(driver.findElement(By.name("user_name")), "admin");
		webDriverUtility.sendkeysusing(driver.findElement(By.name("user_password")), "admin");
		webDriverUtility.clickUsingJS(driver.findElement(By.id("submitButton")));
		webDriverUtility.scrolltillelementusingJS(driver.findElement(By.xpath("//b[contains(text(),'World Clock')]")));
		
		// TODO Auto-generated method stub

	}

}
