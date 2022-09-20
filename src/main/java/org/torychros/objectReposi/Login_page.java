package org.torychros.objectReposi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//declaration
	@FindBy(name = "user_name") private WebElement usernmaefield;
	@FindBy(name = "user_password") private WebElement passwordfild;
	@FindBy(xpath = "//input[@id='submitButton']") private WebElement loginbutton;
	// inatalized all the element variable
	
	
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	//declartion
	public void login_page_action(String username , String password ) {
	
		
		usernmaefield.sendKeys(username);
		passwordfild.sendKeys(password);
		loginbutton.click();


	}


}
