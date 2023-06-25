package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Item
	 @FindBy(xpath="//span[2][contains(text(), 'shoes')]")
	 public WebElement txtshoes;
	 
	//Validate Shirts Item
	 @FindBy(xpath="//span[2][contains(text(), 'shirts')]")
	 public WebElement txtshirts;

	//Validate Pants Item
	 @FindBy(xpath="//span[2][contains(text(), 'pants')]")
	 public WebElement txtpants;
	 
	//Validate Brand Adidas
	 @FindBy(xpath="//input[@aria-label='adidas']")
	 public WebElement cbxBrandAdidas;
	 
	//Validate Brand Nike
	 @FindBy(xpath="//input[@aria-label='nike']")
	 public WebElement cbxBrandNike;
	 
	//Validate Brand Unbranded
	 @FindBy(xpath="//input[@aria-label='unbranded']")
	 public WebElement cbxBrandUnbranded;
	 
	//Shirt Link
	 @FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
	 public WebElement linkShirtItems;
	 
}
