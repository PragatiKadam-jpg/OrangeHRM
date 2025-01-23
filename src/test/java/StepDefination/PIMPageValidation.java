package StepDefination;

import PageLayer.PIMLink;
import io.cucumber.java.en.Given;

public class PIMPageValidation {

	@Given("Click on PIM link")
	public void click_on_pim_link() {
		PIMLink obj = new PIMLink();
		obj.pimPageValidation();
	}
}
