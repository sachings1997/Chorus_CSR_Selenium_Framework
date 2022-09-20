package org.Chorus.practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice1 {
	@BeforeSuite
	public void beforesetup() {
		System.out.println("script 1");
		Assert.fail();
	}
	@BeforeTest
	public void beforesetup1() {
System.out.println("script 2");   
		
	}
	@BeforeClass
	public void beforesetup3() {
		System.out.println("script 3");
	}
	@BeforeMethod
	public void beforesetup4() {
		System.out.println("script 4");
	}
	@AfterMethod
	public void aftersetup() {
		System.out.println("script 1sos");
	}
   @AfterClass
   public void afterclass() {
	   System.out.println("script 3");
   }
   @AfterMethod
   public void aftermethod() {
	   System.out.println("script 4");
	   
   }
  @Test
  public void test() {
	  System.out.println("script 1sos");
  }
}
