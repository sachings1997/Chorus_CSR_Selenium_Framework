package org.Chorus.practice;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class HandlingCalendra {



	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String requireddate = "20";
		String requiredmonth = "August";
		String requiredyear = "2023";
		//int requiredmonthInnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(requiredmonth).get(ChronoField.MONTH_OF_YEAR);
		//int requriedyearinnum = Integer.parseInt(requiredyear);
		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		driver.findElement(By.id("datepicker")).click();
		String actualmonthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		String[] str = actualmonthyear.split(" ");
		String actualmonth=str[0];
		String actualyear = str[1];
		while(!(actualmonthyear.equals(actualmonth)&& actualyear.equals(requiredyear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
	       actualmonthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		   str=actualmonthyear.split(" ");
		   actualmonth=str[0];
		   actualyear=str[1];
		 //    int actualmonthinnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualmonth).get(ChronoField.MONTH_OF_YEAR);
		//	int actualyearinnum = Integer.parseInt(actualyear);	

		}
		driver.findElement(By.xpath("//span[text()='"+requireddate+"']"));





	}
}// TODO Auto-generated method stub

	


