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

public class flipkartworking {
	WebDriver w;
	
       @BeforeMethod
	public void openbrowser() {
		w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		
		
	}
       @Test
       public void sofas() {
    		w.findElement(By.name("q")).sendKeys("sofaset",Keys.ENTER);
    	   w.findElement(By.cssSelector("a[class=\"wjcEIp\"]")).click();
    	   
    //	   w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
    	
    	}
       @Test
       public void phone() {
    		w.findElement(By.name("q")).sendKeys("oneplus5g",Keys.ENTER);
    	   w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
    	//  w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
    	   
       }
       
//       @Test(priority = 3)
//       public void addtocart() {
//    	w.findElement(By.cssSelector("a[class=\"_9Wy27C\"]")).click();   
//       }
       
       @AfterMethod
      public void closebrowser() throws Exception {

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
	
       }	
}
