package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFile {

	@Test(priority = 2)
	  public void flipkart() throws Exception {
		  WebDriver w = new ChromeDriver();
		  w.get("https://www.flipkart.com/");
		  w.findElement(By.name("q")).sendKeys("iphone15",Keys.ENTER);
		  w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
	  }
	
	@Test(priority = 1,invocationCount = 2)
	public void instagram() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.instagram.com/");
		
		}
}
