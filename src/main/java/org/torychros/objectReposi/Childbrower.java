package org.torychros.objectReposi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Childbrower {
@FindBy(xpath = "//a[text()='tyss']") private WebElement childbrowse;
  

public  Childbrower(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void Childbroweraction() {
	childbrowse.click();
}
}

