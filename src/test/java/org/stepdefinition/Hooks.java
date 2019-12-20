package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver d;
	@Before
	public void beforeScenario() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sankar\\Adactin\\driver1\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(3000);
	}
	@After
	public void afterScenario() {
	d.quit();
	}
}
