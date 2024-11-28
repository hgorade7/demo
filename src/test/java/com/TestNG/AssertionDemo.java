package com.TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	public void GoogleSearch() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("shoes",Keys.ENTER);
		
		String exptitle = "shoes - Google Search";
		String acttitle = w.getTitle();
		
		//heard assertion
		Assert.assertEquals(acttitle, exptitle);
		
		//soft assertion
	//	SoftAssert soft = new SoftAssert();
		
		//soft.assertEquals(acttitle, exptitle);
		System.out.println("hello");
		
		//soft.assertAll();
		
		
		
	}
	
	
}
