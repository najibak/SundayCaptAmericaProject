package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.ShettyHomepageActions;


public class ShettyHomepageSteps {
	
	ShettyHomepageActions ShettyHomepageActionsObj = new ShettyHomepageActions();
	
	@Given("Open Shetty Homepage")
	public void open_shetty_homepage() throws Throwable {
	    ShettyHomepageActionsObj.loadShettyHomepage();
	    
	}

	@When("Click on iFrame Home")
	public void click_on_i_frame_home() throws Throwable {
	    ShettyHomepageActionsObj.clickIframeHome();
	}

	@Then("It should reload iframe homepage")
	public void it_should_reload_iframe_homepage() throws Throwable {
	    ShettyHomepageActionsObj.verifyShettyHome();
	}

}
