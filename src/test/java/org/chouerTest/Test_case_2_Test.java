package org.chouerTest;

import org.main.generic.Baseclass;
import org.testng.annotations.Test;
import org.torychros.objectReposi.Childbrower;

public class Test_case_2_Test extends Baseclass{
	@Test
public void 	Test_case_2_test() throws InterruptedException{
		
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
		creatednewpages.cancelbutton();
	}
	

}
