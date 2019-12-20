package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hooks;

public class DetailsPom {
public DetailsPom() {
PageFactory.initElements(Hooks.d, this);
}
@FindBy(id="first_name")
private WebElement Txtfirst;
@FindBy(id="last_name")
private WebElement Txtlast;
@FindBy(name="address")
private WebElement Txtadrs;
@FindBy(name="cc_num")
private WebElement Txtccnum;
@FindBy(name="cc_type")
private WebElement Txtcctyp;
@FindBy(name="cc_exp_month")
private WebElement Txtmnth;
@FindBy(name="cc_exp_year")
private WebElement Txtyear;
@FindBy(name="cc_cvv")
private WebElement Txtccv;
@FindBy(name="book_now")
private WebElement btbooknow;

public WebElement getTxtfirst() {
	return Txtfirst;
}
public WebElement getTxtlast() {
	return Txtlast;
}
public WebElement getTxtadrs() {
	return Txtadrs;
}
public WebElement getTxtccnum() {
	return Txtccnum;
}
public WebElement getTxtcctyp() {
	return Txtcctyp;
}
public WebElement getTxtmnth() {
	return Txtmnth;
}
public WebElement getTxtyear() {
	return Txtyear;
}
public WebElement getTxtccv() {
	return Txtccv;
}
public WebElement getBtbooknow() {
	return btbooknow;
}





}
