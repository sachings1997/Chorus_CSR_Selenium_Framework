package org.chouerTest;

import org.main.generic.Baseclass;
import org.main.generic.IConstantPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.torychros.objectReposi.Childbrower;
import org.torychros.objectReposi.Create_information_page;

public class Create_opportuinitiesTest extends Baseclass
{
	@Test
	public void create_opportuinitiesTest() throws InterruptedException 
	
	{
		String partialUrl="Accounts&action";
		
	common_Pages.clickopportuinities();
	creatnewpages.Create_opportuinities_action();
    String  opportuinitiesname= excelutility.getdatafromexcel("opport", "Opportunity Name ");
    String opportuinitiesnextstep = excelutility.getdatafromexcel("opport", "Next Step " );
    System.out.println(opportuinitiesname);
    System.out.println(opportuinitiesnextstep);
	creatednewpages.create_information_page_action( opportuinitiesname , opportuinitiesnextstep);
	webDriverUtility.switchtowindow(driver);
	Childbrower childbrower =  new Childbrower(driver);
	childbrower.Childbroweraction();
	webDriverUtility.ParentWindow(parent);
	creatednewpages.savebutton();
  common_Pages.clickopportuinities();
	
	
	
	
	}

	
	
        
        
		
		
	
		   
		
		
		
	}


