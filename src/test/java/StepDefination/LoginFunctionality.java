package StepDefination;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import Reader.PropertyReader;
import io.cucumber.java.en.Given;

public class LoginFunctionality extends BaseClass{
	
	@Given("open OrangeHRM application")
	public void open_orange_hrm_application() throws IOException {
		BaseClass.intialization("Chrome");
	}
	@Given("Enter valid {string} and {string} and click on login button")
	public void enter_valid_and_and_click_on_login_button(String userName, String password) {
		LoginPage obj = new LoginPage();
		obj.loginPageFunctionality(userName,password);
	}
}
