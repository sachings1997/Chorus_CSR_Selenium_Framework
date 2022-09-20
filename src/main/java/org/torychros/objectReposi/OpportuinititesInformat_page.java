package org.torychros.objectReposi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportuinititesInformat_page {
//declartion
	@FindBy(xpath = "//input[@name='potentialname']") private WebElement opportuintyname;
	public OpportuinititesInformat_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public String opportuinitiesname() {
		return opportuintyname.getText();
		
	}
}