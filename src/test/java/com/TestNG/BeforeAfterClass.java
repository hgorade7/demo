package com.TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BeforeAfterClass {
	WebDriver w;
	@Parameters("bro")
	@BeforeClass
	public void openbrowse(String browser) {
		if(browser.equals("chrome")) {
			w = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			w = new FirefoxDriver();
		}
		}
	@BeforeMethod
	public void opentab(){
		w.get("https://www.flipkart.com/");
		
	}
	@Test
	public void mobile() {
		w.findElement(By.name("q")).sendKeys("iphone15",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
	}
	@Test
	public void nike() {
		w.findElement(By.name("q")).sendKeys("nikeshose",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"WKTcLC\"]")).click();
	}
	@AfterMethod
	public void closetab() throws Exception {
		Thread.sleep(2000);
	String parent = w.getWindowHandle();
	Set<String> childw = w.getWindowHandles();
	for (String c : childw) {
		if(!c.equals(parent)) {
			w.switchTo().window(c);
			Thread.sleep(2000);
			w.close();
			w.switchTo().window(parent);
		}
	}
	}
	@AfterClass
	public void close() {
		w.close();
	}
	
}
