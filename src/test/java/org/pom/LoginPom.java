package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class LoginPom {
public LoginPom() {
	PageFactory.initElements(Hooks.d, this);
}
@FindBy(name="username")
private WebElement Txtuser;
@FindBy(name="password")
private WebElement Txtpass;
@FindBy(name="login")
private WebElement btlogin;
public WebElement getTxtuser() {
	return Txtuser;
}
public WebElement getTxtpass() {
	return Txtpass;
}
public WebElement getBtlogin() {
	return btlogin;
}
}
