package org.chouerTest;

import org.main.generic.Baseclass;
import org.testng.annotations.Test;
import org.torychros.objectReposi.Childbrower;
import org.torychros.objectReposi.Common_Pages;
import org.torychros.objectReposi.Create_information_page;
import org.torychros.objectReposi.Create_opportinities_page;
import org.torychros.objectReposi.TabName;

public class Crete_newopportunitesTest extends Baseclass{
@Test
public void crete_newopportunitesTest() throws InterruptedException {
	String expectedlastname =  excelutility.getdatafromexcel("Sheet1", "OpportunityName");
	String expecteddata = excelutility.getdatafromexcel("Sheet1", "Next Step");
//	System.out.println(expectedlastname);
//	Create_information_page creatednewpages = new Create_information_page(driver);
//	Common_Pages common_Pages = new Common_Pages(driver);
//	Thread.sleep(5000);
//	Create_opportinities_page creatnewpages = new Create_opportinities_page(driver);
//	
//	common_Pages.clickrequrired(TabName.ORPPORTUNITIES);
//	creatnewpages.Create_opportuinities_action();
//	creatednewpages.create_information_page_action(expectedlastname ,expecteddata);
//	webDriverUtility.switchtohandle(driver);
//	Childbrower childbrower = new Childbrower(driver);
//	childbrower.Childbroweraction();
	//creatednewpages.savebutton();
	//creatnewpages.Create_opportuinities_action();

    		
	
    
	}
}
