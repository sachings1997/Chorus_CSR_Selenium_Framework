package org.torychros.objectReposi;

import org.main.generic.WebDriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_information_page {

	@FindBy(xpath = "//input[@name='potentialname']") private WebElement opportuintiesnametextfield;
     //@FindBy(xpath = "//input[@name='amount']") private WebElement opportuinitiesamounttextfeild ;
     @FindBy(xpath = "//input[@name='nextstep']") private WebElement opportuintiesnextsteptextfield;
    @FindBy(xpath="//input[@class='crmbutton small save']") private WebElement savebutton;
     @FindBy(xpath="//input[@name='amount']/ancestor::td/preceding-sibling::td/preceding-sibling::td//img[@alt='Select']") 
     private WebElement inputbutton;
     @FindBy(xpath = "//a[text()='tyss']") private WebElement clickbutton;
     @FindBy(xpath = "//select[@id='related_to_type']") private WebElement listboxselect;
     @FindBy(xpath = "//select[@name='opportunity_type']") private WebElement listboxselect1;
     @FindBy(xpath = "//b[text()='Opportunity Information:']/ancestor::tr/preceding-sibling::tr//input[@title='Cancel [Alt+X]']")
     private WebElement cancelbutton;
     @FindBy(name=("closingdate")) private WebElement expecteddate;
     
	

     public Create_information_page(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     public void create_information_page_action( String opportuintiesname , String opportuintiesnextstep  ) {
    	 opportuintiesnametextfield.sendKeys(opportuintiesname);
    	
    	 opportuintiesnextsteptextfield.sendKeys(opportuintiesnextstep);
    	
    	inputbutton.click();
    	
    	
    	
    	
     }
    
		public void savebutton() {
		savebutton.click();
	}
		public void cancelbutton() {
			cancelbutton.click();
		}
		
		}


