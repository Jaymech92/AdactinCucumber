package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class Pom5 {
	public Pom5() {

	PageFactory.initElements(Hooks.d, this);
	
}
	@FindBy(name="my_itinerary")
	private WebElement btiti;
	
	@FindBy(name="check_all")
	private WebElement btradio1;
	
	@FindBy(name="cancelall")
	private WebElement btcancel;

	@FindBy(name="logout")
	private WebElement btlogout;
	
	@FindBy(name="logout")
	private WebElement btlogout1;
	
	public WebElement getBtiti() {
		return btiti;
	}

	public WebElement getBtradio1() {
		return btradio1;
	}

	public WebElement getBtcancel() {
		return btcancel;
	}

	public WebElement getBtlogout() {
		return btlogout;
	}

	public WebElement getBtlogout1() {
		return btlogout1;
	}

}
