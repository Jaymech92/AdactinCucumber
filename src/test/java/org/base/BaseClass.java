package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepdefinition.Hooks;

public class BaseClass {
	public static void launch(String url) {
	Hooks.d.get(url);
}
	public static void type(WebElement lo,String inp) {
		lo.sendKeys(inp);

	}
	public static void click(WebElement lo) {
		lo.click();
	}
	public static void SelectByText(WebElement lo,String inp) {
		Select s=new Select(lo);
		s.selectByVisibleText(inp);
	}
	public static void SelectByIndex(WebElement lo,int i) {
		Select s=new Select(lo);
		s.selectByIndex(i);
	}
	public static void SelectBy(WebElement lo,String inp) {
		Select s=new Select(lo);
		s.selectByValue(inp);
	}
	public static void alert() {
		Alert al=Hooks.d.switchTo().alert();
		al.accept();
		
	}
	public static void scrollDown(WebElement down) {
		JavascriptExecutor jse=(JavascriptExecutor) Hooks.d;
		jse.executeScript("arguments[0].scrollIntoView(true)", down);
		

	}
	public static void screenshot(String path) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot) Hooks.d;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		File d=new File(path);
		FileUtils.copyFile(sr,d);

	}


}
