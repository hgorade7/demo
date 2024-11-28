package com.logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import org.apache.logging.log4j.*;



public class SouceDemoLogin {
Logger log;
WebDriver w;
@Parameters("browser")
@BeforeMethod
public void launchbrowser(String bro) {
	log = LogManager.getLogger();
	if(bro.equals("chrome")) {
	  w = new ChromeDriver();
	  log.info(bro+"has been launch");
	}else if(bro.equals("firefox")) {
		w = new FirefoxDriver();
		log.info(bro+"has been launch");
		}
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	w.get("");
	log.info("souce demo side has been launch");
} 
@Test
public void login() {
	w.findElement(By.id("user-name")).sendKeys("standerd_user");
	log.info("stander_user has been enterin username feild");
	w.findElement(By.id("password")).sendKeys("secret_sauce");
	log.info("secret_sauce has been enterin password feild");
	w.findElement(By.id("login-button")).click();
	log.info("login button has been click");
	
}
	@AfterMethod
	public void logout() {
		w.findElement(By.id("reset-burger-menu-btn")).click();
		log.info("manu button has been click");
		w.findElement(By.linkText("Logout")).click();
		log.info("user has been loggout");
	}
}
