     package org.Chorus.practice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.main.generic.ExcelUtility;
import org.main.generic.FileUtility;
import org.main.generic.IConstantPath;
import org.main.generic.JavaUtiltiy;

import org.main.generic.WebDriverUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.torychros.objectReposi.Common_Pages;
import org.torychros.objectReposi.Create_information_page;
import org.torychros.objectReposi.Create_opportinities_page;

import org.torychros.objectReposi.Login_page;
import org.torychros.objectReposi.TabName;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Create_opportuintites {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileUtility fileutility=new FileUtility();
		ExcelUtility excelutility= new ExcelUtility();
		WebDriverUtility webdriverutility=new WebDriverUtility();
		JavaUtiltiy javautility= new JavaUtiltiy();
		Create_opportuintites cpages= new Create_opportuintites();
		
		

		excelutility.openExcel(IConstantPath.EXCEL_PATH);
		fileutility.intaillizedPropertyfile(IConstantPath.PROPERTY_FILE_PATH);
		String browser = fileutility.getdatafromporpertyfile("browser");
		String username = fileutility.getdatafromporpertyfile("username");
		String password = fileutility.getdatafromporpertyfile("password");
		String url = fileutility.getdatafromporpertyfile("url");
		
	
		String timeout = fileutility.getdatafromporpertyfile("timeouts");
		


		WebDriver driver = webdriverutility.openbrowser("chrome", 10, url);


		
		Login_page login= new Login_page(driver);
		login.login_page_action(username, password);
		excelutility.getDataFromExcelInMap("datatype");

		
		Common_Pages pages= new Common_Pages(driver);
		  pages.clickrequrired(TabName.ORPPORTUNITIES);
	//	webdriverutility.waitpageloadexplicity(driver, 10, element);
		
		
	  Create_information_page informationpage=  new Create_information_page(driver);
	  
		Create_opportinities_page opages= new Create_opportinities_page(driver);
		opages.Create_opportuinities_action();
	  
		
		informationpage.create_information_page_action("sachings", "profit");
		driver.findElement(By.xpath("//input[@name='amount']/ancestor::td/preceding-sibling::td/preceding-sibling::td//img[@alt='Select']")).click();
 
		String ele1 = driver.getWindowHandle();
		Set<String> elist = driver.getWindowHandles();
		
		for(String string:elist) {
			if(!ele1.equals(elist))
				driver.switchTo().window(string);
		}


		
	   driver.findElement(By.xpath("//a[text()='tyss']")).click();
	   driver.switchTo().window(ele1);
        
		WebElement listbox = driver.findElement(By.xpath("//select[@id='related_to_type']"));
		webdriverutility.Selectclass(listbox);
		WebElement listbox1 = driver.findElement(By.xpath("//select[@name='opportunity_type']"));
		webdriverutility.Selectclass(listbox1);
		WebElement listbox2 = driver.findElement(By.xpath("//select[@name='leadsource']"));
		webdriverutility.Selectclass(listbox2);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		WebElement listbox3 = driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
		webdriverutility.Selectclass(listbox3);	
        driver.findElement(By.xpath("//input[@name='probability']/ancestor::td/preceding-sibling::td/preceding-sibling::td/img[@alt='Select']")).click();
		String elea1 = driver.getWindowHandle();
		Set<String> eleist2 = driver.getWindowHandles();
		for(String wi:eleist2) {
			if(!elea1.equals(eleist2))
				driver.switchTo().window(wi);

		}
		driver.findElement(By.xpath("//a[text()='banner advt']")).click();
		driver.switchTo().window(elea1);
		driver.findElement(By.xpath("//input[@value='AUTO GEN ON SAVE']"));
		driver.findElement(By.id("nextstep"));
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("10,0000");

		driver.findElement(By.name("closingdate")).clear();
		driver.findElement(By.name("closingdate")).sendKeys("2022-08-24");
		//driver.findElement(By.xpath("//input[@name='nextstep']")).sendKeys("opportuinty");

		WebElement listbox4 = driver.findElement(By.xpath("//select[@name='sales_stage']"));
		webdriverutility.Selectclass(listbox4);
	
	
	
		driver.findElement(By.xpath("//input[@name='probability']"));



		//Thread.sleep(8000);
	driver.findElement(By.xpath("//b[text()='Opportunity Information:']/ancestor::tr/preceding-sibling::tr//input[@title='Save [Alt+S]']")).click();
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("(//a[text()='Opportunities'])[2]")).click();
		pages.signoutAction(webdriverutility);
		   
		System.out.println("test case passed");
		

}
}


