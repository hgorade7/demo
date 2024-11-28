package com.TestNG;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FlipkartUssingAnnotation {

	WebDriver w;
	
	@BeforeMethod
	public void openbrowser() {
		w =new ChromeDriver();
		w.get("https://www.flipkart.com/");
	}
	@Test(priority = 2)
	public void mobile() {
		
		w.findElement(By.name("q")).sendKeys("iphone15",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
	}
	@Test(priority = 1)
	public void shose() {
	
		w.findElement(By.name("q")).sendKeys("nike",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"WKTcLC\"]")).click();
	}
	@AfterMethod
	public void closebrowser() throws Exception {
		Thread.sleep(2000);
		w.quit();
	}
	
}
