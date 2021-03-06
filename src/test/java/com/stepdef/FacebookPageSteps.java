package com.stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pojo.FacebookPagePojo;
import com.utils.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookPageSteps extends LibGlobal {

	@Given("User launch the browser")
	public void user_launch_the_browser() {
	}

	@Given("User enters the url")
	public void user_enters_the_url() {
		getUrl("https://www.facebook.com/");

	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) throws IOException {
		FacebookPagePojo fb = new FacebookPagePojo();
		// 2D with header
		List<Map<String, String>> asMaps = table.asMaps();
		Map<String, String> map = asMaps.get(1);
//Edited
		String s1 = map.get("userName");
		String s2 = map.get("password");
		System.out.println("Hello");
		System.out.println("Welcome");
		System.out.println("Java");
		System.out.println("234567890-");
		System.out.println(s1);
		System.out.println(s2);

		insertType(fb.getTxtBoxUserName(), s1);
		insertType(fb.getTxtBoxPass(), s2);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		FacebookPagePojo fb = new FacebookPagePojo();

		isEnabled(fb.getBtnLogIn());
		click(fb.getBtnLogIn());
	}

	@Then("User navigates to login failure page")
	public void user_navigates_to_login_failure_page() throws InterruptedException {
		pause(3000);
		String currentUrl = getCurrentUrl();
		Assert.assertTrue("Not navigated to login failure page", currentUrl.contains("login"));
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String userName, String password) {
		FacebookPagePojo fb = new FacebookPagePojo();
		insertType(fb.getTxtBoxUserName(), userName);
		insertType(fb.getTxtBoxPass(), password);

	}

}
