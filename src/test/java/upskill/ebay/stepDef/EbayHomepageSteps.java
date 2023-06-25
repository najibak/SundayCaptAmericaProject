package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    Thread.sleep(2000);
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
	    EbayHomepageActionsObj.searchShoes();
	    Thread.sleep(2000);
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String Items) throws Throwable {
		EbayHomepageActionsObj.searchItems(Items);
		Thread.sleep(2000);
	    
	}
	
	@Given("Search for Big Tall Cotton Tee")
	public void search_for_big_tall_cotton_tee() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
	    Thread.sleep(2000);
	}
	
	@When("Mouse Hover to MyEbay Summary")
	public void mouse_hover_to_my_ebay_summary() throws Throwable {
	    EbayHomepageActionsObj.mouseHoverMyEbay();
	}

	@Then("Click on Summary")
	public void click_on_summary() throws Throwable {
	   EbayHomepageActionsObj.clickSummary(); 
	}


}
