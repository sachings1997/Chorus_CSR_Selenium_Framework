package org.Chorus.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Export_Test_Excution {

	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Export Opportunities']")).click();
		driver.findElement(By.xpath("//input[@value='includesearch']")).click();
	  // driver.findElement(By.xpath("//input[@value=' Cancel ']")).click();
		driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
		
		
		// TODO Auto-generated method stub

	}

}
