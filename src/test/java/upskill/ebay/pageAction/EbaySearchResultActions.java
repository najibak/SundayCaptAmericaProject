package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions () {
		 EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
		}
	
	public void verifyShoesItems() {
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtshoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtshoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtshoes.isDisplayed();
		
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")) {
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if (brand.equals ("Nike")) {
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if (brand.equals ("Unbranded")) {
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not found");
		}
	}

	public void verifyBrandItems(String brand) {
		if(brand.equals("Adidas")) {
		    Assert.assertTrue(EbaySearchResultLocatorsObj.txtshirts.isDisplayed());
		} else if(brand.equals("Nike")) {
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtshoes.isDisplayed());
		} else if(brand.equals("Unbranded")) {
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtpants.isDisplayed());
		} else {
			System.out.println("No results found");
		}
		
	}
	
	public void selectBigTallTee() throws Exception{
		Thread.sleep(3000);
		EbaySearchResultLocatorsObj.linkShirtItems.click();
		Thread.sleep(3000);
	}
	

}
