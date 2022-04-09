package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;
import com.utils.LibGlobal;

public class FacebookPagePojo extends LibGlobal {

	public FacebookPagePojo() {
		PageFactory.initElements(Hooks.driver, this);
	}

	// Pojo-->Plain Old Java Object
	// 1.declare all webelements in private
	// 2.Generate getters

	@FindBy(id = "email")
	private WebElement txtBoxUserName;

	@FindBy(id = "pass")
	private WebElement txtBoxPass;

	@FindBy(name = "login")
	private WebElement btnLogIn;

	public WebElement getTxtBoxUserName() {
		return txtBoxUserName;
	}

	public WebElement getTxtBoxPass() {
		return txtBoxPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

}
