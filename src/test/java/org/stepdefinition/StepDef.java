package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pom.DetailsPom;
import org.pom.HotelPom;
import org.pom.LoginPom;
import org.pom.Pom5;
import org.pom.SearchPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass {
	LoginPom p1 = new LoginPom();
	SearchPom p2 = new SearchPom();
	HotelPom p3 = new HotelPom();
	DetailsPom p4 = new DetailsPom();
	Pom5 p5 = new Pom5();

	@Given("launch brouser and open application")
	public void launch_brouser_and_open_application() throws InterruptedException {
		launch("https://www.adactin.com/HotelApp/");
		Thread.sleep(2000);

	}

	@When("Enter credential and click login")
	public void enter_credential_and_click_login(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<String> li = dataTable.asList(String.class);
	     type(p1.getTxtuser(),li.get(1));
		type(p1.getTxtpass(),li.get(0));
		click(p1.getBtlogin());
		Thread.sleep(4000);
	}

	@When("Enter room details and click search")
	public void enter_room_details_and_click_search() {
		SelectByText(p2.getTxtlocat(), "Adelaide");
		SelectByText(p2.getTxthotel(), "Hotel Hervey");
		SelectByText(p2.getTxtroom(), "Super Deluxe");
		SelectBy(p2.getTxttype(), "4");
		SelectBy(p2.getTxtadult(), "2");
		SelectBy(p2.getTxtchild(), "1");
		click(p2.getBtsub());
		
	}

	@When("Select hotel and click continue")
	public void select_hotel_and_click_continue() {
		click(p3.getBtradio());
		click(p3.getBtcont());
		
	}


	@When("Enter personal details and click Book")
	public void enter_personal_details_and_click_Book() throws Exception {
		type(p4.getTxtfirst(), "Jay");
		type(p4.getTxtlast(), "Prakash");
		type(p4.getTxtadrs(), "Erode");
		type(p4.getTxtccnum(), "6666565577764567");
		SelectByText(p4.getTxtcctyp(), "Master Card");
		SelectBy(p4.getTxtmnth(), "2");
		SelectBy(p4.getTxtyear(), "2021");
		type(p4.getTxtccv(), "567");
		click(p4.getBtbooknow());
		Thread.sleep(5000);
		
	}

	@When("Complete all procedure for cancellation and click logout")
	public void complete_all_procedure_for_cancellation_and_click_logout() throws Throwable {
		scrollDown(p5.getBtlogout());
		Thread.sleep(5000);
		screenshot("F:\\Screenshot1.png");
		click(p5.getBtiti());
		click(p5.getBtradio1());
		click(p5.getBtcancel());
		alert();
		click(p5.getBtlogout1());

	}

	@Then("Logout succesfully and Home page opens")
	public void logout_succesfully_and_Home_page_opens() {

		System.out.println("success");
		
	}

}
