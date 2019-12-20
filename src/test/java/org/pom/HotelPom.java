package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class HotelPom {
	public HotelPom() {

		PageFactory.initElements(Hooks.d, this);
	}
	@FindBy(name="radiobutton_0")
	private WebElement btradio;
	@FindBy(name="continue")
	private WebElement btcont;
	
	public WebElement getBtradio() {
		return btradio;
	}
	public WebElement getBtcont() {
		return btcont;
	}

}