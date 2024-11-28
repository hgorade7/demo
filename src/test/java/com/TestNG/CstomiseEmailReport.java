package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class CstomiseEmailReport {

	public void front() {
		Reporter r = new Reporter();
		WebDriver w = new ChromeDriver();
		r.log("Browser has been launch");
		w.get("https://frontaccounting.eu/");
		r.log("browser has been redirect to frountaccounting side");
		
		WebElement username = w.findElement(By.name("user_name_entry_field"));
		WebElement password = w.findElement(By.name("password"));
		
		
		username.clear();
		password.clear();
		
		r.log("username and password data has been clear");
		
		username.sendKeys("demouser");
		password.sendKeys("password");
		
		r.log("in username filed damouser data has been enter and password filed password data has been enter");
		
		w.findElement(By.name("Submituser")).click();
		r.log("Click on login button");
		
		w.findElement(By.name("Logout")).click();
		r.log("click on logout link");
		
	}
	
	
}
