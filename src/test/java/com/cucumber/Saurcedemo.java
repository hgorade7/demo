package com.cucumber;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Saurcedemo {
	WebDriver w;
 
	@Given("Open browser")
	public void open_browser() {
	    w = new ChromeDriver();
	    w.manage().window().maximize();
	}

	@Given("Open saurcedemo web")
	public void open_saurcedemo_web() {
	   w.get("https://www.saucedemo.com/");
	   
	}

	@When("when login valid credentials")
	public void when_login_valid_credentials() {
	    w.findElement(By.name("user-name")).sendKeys("standard_user");
	    w.findElement(By.name("password")).sendKeys("secret_sauce");
	    w.findElement(By.name("login-button")).click();
	}

	@When("verify the url")
	public void verify_the_url() {
	    String actualurl = w.getCurrentUrl();
	    String expectedurl = "https://www.saucedemo.com/inventory.html";
	   Assert.assertEquals(expectedurl, actualurl);
	}

	@Then("logout")
	public void logout() throws Exception {
	    w.findElement(By.id("react-burger-menu-btn")).click();;
	    Thread.sleep(2000);
	    w.findElement(By.linkText("Logout")).click();
	}
}
