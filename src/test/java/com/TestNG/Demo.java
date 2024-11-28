package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test (priority = 2)
	
	public void Goggle() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		Thread.sleep(2000);
		w.quit();
	}
	@Test (priority = 1,invocationCount = 2,enabled = false)
	public void Facebook() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	}
	@Test
	public void instagram() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.instagram.com/");
		Thread.sleep(2000);
		w.quit();
	}
	
}