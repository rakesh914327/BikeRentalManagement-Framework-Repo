package com.BikeRentalManagement.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
	
	//constructor
		public AdminLogin(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		//WebElements
		@FindAll({@FindBy(xpath = "//input[contains(@name,\"username\")]"),@FindBy(xpath = "//input[@placeholder=\"Username\"]")})
		private WebElement usernameTextField;

		@FindAll({@FindBy(xpath = "//input[contains(@name,\\\"password\\\")]"),@FindBy(xpath = "//input[@placeholder=\"Password\"]")})
		private WebElement passwordTextField;
		
		@FindAll({@FindBy(xpath = "//button[contains(@name,\\\"login\\\")]"),@FindBy(xpath = "//button[@type=\"submit\"]")})
		private WebElement loginButton;

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

}
