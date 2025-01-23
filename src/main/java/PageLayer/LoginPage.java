package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class LoginPage extends BaseClass{

	@FindBy(name="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	
	public void loginPageFunctionality(String user,String password)
	{
		WebElementHelper.sendKeys(userName,user);
		WebElementHelper.sendKeys(pass,password);
		WebElementHelper.click(login);
	}
}
