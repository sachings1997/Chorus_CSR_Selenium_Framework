package org.main.generic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.torychros.objectReposi.Common_Pages;
import org.torychros.objectReposi.Create_information_page;
import org.torychros.objectReposi.Create_opportinities_page;
import org.torychros.objectReposi.Login_page;
import org.torychros.objectReposi.TabName;

public class Baseclass {
	private static final long Longtimeout = 0;
	private static final DataType datatype = null;
	private static final TabName tabname=null;
	protected Login_page Login_page;
	protected Common_Pages common_Pages;
	protected WebDriver driver;
	protected WebDriverUtility webDriverUtility;
	protected ExcelUtility excelutility;
//	protected String opportuinitiesnextstep;
	protected int randomNumber;
	private String browser;
	protected String url;
	protected String password;
	protected String username;
//	protected String opportuinitiesname;
     protected Create_opportinities_page creatnewpages;
    public static WebDriver sdriver;
    public static JavaUtiltiy sjavaUtiltiy;
    protected FileUtility fileUtility;
     protected Create_information_page creatednewpages;
     protected  String parent;
   
	/**
	 * intialize the all utility class open the excel propertyfile read the common
	 * data create the instanc for browser (lunach browser) maximize , implicit wait
	 * open the application intialilize jsexecutor, actions webdriverwait create the
	 * instance for common object repo
	 * 
	 * @throws IOException
	 * 
	 */
	@BeforeClass
	public void classsetup() throws IOException {
		// create instance for the genrice utility
		excelutility = new ExcelUtility();
		FileUtility fileUtility = new FileUtility();
		JavaUtiltiy javaUtiltiy = new JavaUtiltiy();
		sjavaUtiltiy=javaUtiltiy;
		webDriverUtility = new WebDriverUtility();
		// intailized the porperty file and excelfile

		fileUtility.intaillizedPropertyfile(IConstantPath.PROPERTY_FILE_PATH);
		excelutility.openExcel(IConstantPath.EXCEL_PATH);
		
		
		
		// opportuinitiesnextstep = excelutility.getdatafromExcel("opportuinities module", 0, 3)+randomNumber;
		//System.out.println(opportuinitiesname);


		 browser = fileUtility.getdatafromporpertyfile("browser");
		 username = fileUtility.getdatafromporpertyfile("username");
		 password = fileUtility.getdatafromporpertyfile("password");
		 url = fileUtility.getdatafromporpertyfile("url");

		String timeout = fileUtility.getdatafromporpertyfile("timeouts");
		int randomNumber = javaUtiltiy.getrandomnuber(timeout, DataType.LONG);
		javaUtiltiy.getrandomnuber(timeout, datatype);
		// lunching the browser and doing some brwoser setting
		driver = webDriverUtility.openbrowser(browser, Longtimeout, url);
		sdriver=driver;
		webDriverUtility.jsIntaillization(driver);
		

		// create object for common pom repo
		Login_page = new Login_page(driver);
		
		 common_Pages = new Common_Pages(driver);
			creatnewpages = new Create_opportinities_page(driver);
		 creatednewpages= new Create_information_page(driver);
		 parent = driver.getWindowHandle();

	}

	// login to the application
	/**
	 * when ever we create the testscript class for module and test annotation
	 * method for testcase create instance for browser(lunch broser)
	 * maximize,implicitiy wait intialize jsexecutor, actions , webdriverwait create
	 * the instance for common oject repo(driver) login to the application
	 */
	@BeforeMethod
	public void methodsetup() {
		Login_page.login_page_action(username, password);
		
	}

	@AfterMethod
	public void methodtreamdown() throws FileNotFoundException, IOException {
		 
		common_Pages.signoutAction(webDriverUtility);
		 
		//excelutility.savedataintoexcel(IConstantPath.EXCEL_PATH);
	}

	@AfterClass
	public void classTearDown() throws IOException {
		webDriverUtility.closebrowser(driver);
		excelutility.closeingexcelutility();
	}

}
