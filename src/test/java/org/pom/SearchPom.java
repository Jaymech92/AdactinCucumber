package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class SearchPom {

public SearchPom() {
	PageFactory.initElements(Hooks.d, this);
}
@FindBy(name="location")
private WebElement Txtlocat;

public WebElement getTxtlocat() {
	return Txtlocat;
}
@FindBy(name="hotels")
private WebElement Txthotel;

public WebElement getTxthotel() {
	return Txthotel;
}

@FindBy(name="room_type")
private WebElement Txtroom;

public WebElement getTxtroom() {
	return Txtroom;
}

@FindBy(name="room_nos")
private WebElement Txttype;

public WebElement getTxttype() {
	return Txttype;
}

@FindBy(name="adult_room")
private WebElement Txtadult;

public WebElement getTxtadult() {
	return Txtadult;
}

@FindBy(name="child_room")
private WebElement Txtchild;

public WebElement getTxtchild() {
	return Txtchild;
}

@FindBy(id="Submit")
private WebElement btsub;

public WebElement getBtsub() {
	return btsub;
}

}
