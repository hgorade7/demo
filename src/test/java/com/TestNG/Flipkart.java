package com.TestNG;




import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
     WebDriver w;  
	
	
	@BeforeMethod
	public void close() {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
	}
	@Test
	public void phone() throws Exception {
		w.findElement(By.name("q")).sendKeys("Motorola Edge 50 Fusion (Hot Pink, 256 GB)",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
		
		String parentw =w.getWindowHandle();
		Set<String> childw = w.getWindowHandles();
		for (String c : childw) {
			if(!c.equals(parentw)) {
				w.switchTo().window(c);
				WebElement buynow =	w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]"));
				
				Actions act = new Actions(w);
				act.moveToElement(buynow).click().perform();
			}
		}
		
//	WebElement addtocart =	w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]"));

		
		
		
//		Thread.sleep(20000);
//		w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]")).click();
	}
	@AfterMethod
	public void closeB() throws Exception {
		Thread.sleep(2000);
		w.quit();
		
	}
	
	
	
}
