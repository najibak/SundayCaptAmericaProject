package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartPageLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartPageActions {
	
	EbayCartPageLocators EbayCartPageLocatorsObj;
	
	public EbayCartPageActions() {
		EbayCartPageLocatorsObj = new EbayCartPageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartPageLocatorsObj);
	}
	
	public void switchNewWindow() {
		for (String winhandle : SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo().window(winhandle);
	     }
	}
		
	public void selectSizeType() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartPageLocatorsObj.ddSizeType);
	//	dropDownObj.selectByVisibleText("Big & Tall");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectMenSize() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartPageLocatorsObj.ddMenSize);
	//	dropDownObj.selectByVisibleText("4XLT");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
	//	dropDownObj.selectByIndex(5);
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception {
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartPageLocatorsObj.ddShade);
	//	dropDownObj.selectByVisibleText("Red");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
		Thread.sleep(2000);
	}
	
	public void enterQuantity() throws Exception {
		Thread.sleep(2000);
		EbayCartPageLocatorsObj.txtbxQty.clear();
	//	EbayCartPageLocatorsObj.txtbxQty.sendKeys("2");
		EbayCartPageLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		Thread.sleep(2000);
		
	}
	public void addtoCart() throws Exception {
		Thread.sleep(2000);
		EbayCartPageLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
		
	}
	                           

}
