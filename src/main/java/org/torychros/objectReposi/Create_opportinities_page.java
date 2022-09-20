package org.torychros.objectReposi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_opportinities_page {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement createopportuinitypage;
	
	public Create_opportinities_page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	public void Create_opportuinities_action() {
		createopportuinitypage.click();
	}
	

}
