package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMLink extends BaseClass{

	@FindBy(xpath="//ul[@class='oxd-main-menu']/child::li[2]/descendant::a")
	WebElement pim;
	
	public PIMLink()
	{
		PageFactory.initElements( getDriver(),this);
	}
	
	public void pimPageValidation()
	{
		pim.click();
	}
}
