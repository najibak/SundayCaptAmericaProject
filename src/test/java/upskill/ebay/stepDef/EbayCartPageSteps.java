package upskill.ebay.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbayCartPageActions;

public class EbayCartPageSteps {
	
	EbayCartPageActions EbayCartPageActionsObj = new EbayCartPageActions();
	
	@When("Select Size")
	public void select_size() throws Throwable {
	   EbayCartPageActionsObj.switchNewWindow();
	   EbayCartPageActionsObj.selectSizeType();
	}

	@When("Select Men Size")
	public void select_men_size() throws Throwable {
		EbayCartPageActionsObj.selectMenSize();
	}

	@When("Select Shade")
	public void select_shade() throws Throwable {
		EbayCartPageActionsObj.selectShade();
	    
	}
	@When("Select Quantity")
	public void select_quantity() throws Throwable {
		EbayCartPageActionsObj.enterQuantity(); 
	    
	}
	
	@Then("Add to shopping cart")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartPageActionsObj.addtoCart();
	  
	}

}
