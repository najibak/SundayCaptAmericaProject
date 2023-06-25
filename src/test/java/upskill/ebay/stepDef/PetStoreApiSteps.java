package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import upskill.api.restassured.PetStoreRestAssuredActions;

public class PetStoreApiSteps {
	
	 PetStoreRestAssuredActions PetStoreRestAssuredActionsobj = new PetStoreRestAssuredActions();
	
	@Given("Create pet")
	public void create_pet() throws Throwable {
		PetStoreRestAssuredActionsobj.createPet();
	    
	}

	@Given("Get pet")
	public void get_pet() throws Throwable {
		PetStoreRestAssuredActionsobj.getPet();
	}

	@When("Update pet")
	public void update_pet() throws Throwable {
		PetStoreRestAssuredActionsobj.updatePet();
	}

	@When("Delete pet")
	public void delete_pet() throws Throwable {
		PetStoreRestAssuredActionsobj.deletePet();
	}

}
