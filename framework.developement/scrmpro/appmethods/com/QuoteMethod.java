package scrmpro.appmethods.com;

<<<<<<< HEAD
import scrmpro.pom.com.AccountPage;
import scrmpro.pom.com.QuotePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuoteMethod extends OppMethods{

    public void ClkQuoteTab(){

       QuotePage.Clk_Quote_tab.click();
    }

     public void ClkAddNewQuote(){
       QuotePage.clk_addnewbtn.click();
   }

     public void QuoteName(String Name){
        QuotePage.entr_quote_name.sendKeys(Name);
   }

     public void ClkQuoteAccountSearch() {
         QuotePage.clk_account_search_Btn.click();
   }

     public void select_QuoteAccountName(String Account) {
        new Select(QuotePage.select_accountname_drpdwn).selectByVisibleText(Account);
   }

     public void ClkQuoteOppSearch() {
        QuotePage.clk_opp_search_Btn.click();
   }
     public void select_QuoteOppName(String Opp) {
       new Select(QuotePage.select_quote_opp_drpdwn).selectByVisibleText(Opp);
   }

     public void select_QuoteIndusty(String Industry) {
        new Select(QuotePage.select_quoteindustry_drpdwn).selectByVisibleText(Industry);
   }
     public void select_quoteStatus(String Status) {
       new Select(QuotePage.select_quotestatus_drpdwn).selectByVisibleText(Status);
   }
     public void select_quotepaymentTerm(String Payment) {
       new Select(QuotePage.select_quote_paymentTerm_drpdwn ).selectByVisibleText(Payment);
   }

     public void Txt_quoteValidTill(String ValidTill){
        QuotePage.Txt_Quote_ValidTill.sendKeys(ValidTill);
        QuotePage.Txt_Quote_ValidTill.sendKeys(Keys.ENTER);
		
   }

     public void select_QuoteCurrency(int i){
    	 Select select = new Select(QuotePage.select_quote_Currency_drpdwn);
    	select.selectByIndex(i);
   }

     public void entrQuoteCondition(String TermCondition){
        QuotePage.entr_quoteterms_condition.sendKeys(TermCondition);
   }

     public void clkQuoteSave(){
        QuotePage.clk_quote_save_btn.click();
   }

     public void clkQuoteBack(){
        QuotePage.Clk_quote_back_btn.click();
   }

     public void clkQuoteSaveNew(){
         QuotePage.clk_quote_SavenewBtn.click();
   }

     public void clkQuoteClose(){
         QuotePage.clk_quoteclose_btn.click();
   }

     public void clkQuoteline(){
         QuotePage.clk_qline.click();
   }

     public void clkQuoteSearch(){
         QuotePage.clk_search_qline_item.click();
   }

     public void selectQuoteCurrency(String Currency){
        new Select(QuotePage.select_currency_Drpdwn).selectByVisibleText(Currency);
       
   }
     public void clkQuoteProductChkbox(){
        QuotePage.clk_All_Product_chkbox.click();
   }

     
     public void selectProducts() {

 		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='ProductTbl']/tbody/tr/td[1]"));

 		// Scroll the browser to the element's X position

 		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 250" + elementToClick.getLocation().y + ")");

 		elementToClick.click();

     }
     public void entr_Search_QuoteProductCategory(String Category){
    	 QuotePage.txt_search_product_catgry.sendKeys(Category);
    	 
     }
     public void enter_Search_QuoteProductName(String ProductName){
    	 QuotePage.txt_search_product_name.sendKeys(ProductName); 
     }
      
     public void entr_Search_QuoteProductQut( CharSequence[] ProductQut){
    	 QuotePage.txt_search_product_qty.sendKeys(ProductQut);
     }
     
     public void clkQuoteLineBind(){
         QuotePage.clk_qLineItemBindbtn.click();
   }

     public void clkQuoteViewPrduct(){
    		QuotePage.clk_view_product.click();
    	}

    	public void clkQuoteLineDisplay(){
    		QuotePage.qLineItems_displayed.click();
    		
    	}
    	// Address Information

    	public void clkQuoteAddressInfo(){
    		QuotePage.clk_Addres_info.click();
    	}

    	public void selectQuoteAddress(String Addressinfo){
    		new Select(QuotePage.select_sddressName_Drpdwn).selectByVisibleText(Addressinfo);
    	}
    	public void chkQuoteDefaultAddress(){
    		QuotePage.chk_DefaultAddress.click();
    	}

    	public void enterQuoteAddress(String Address){
    		QuotePage.entr_address.sendKeys(Address);
    	}

    	public void selectQuoteStreet(String Street){
    		new Select(QuotePage.select_street).selectByVisibleText(Street);
    	}

    	public void selectQuoteCity(String City){
    		new Select(QuotePage.select_city).selectByVisibleText(City);
    	}

    	public void entrQuoteZipCode(String Zip){
    		QuotePage.entr_zipcode.sendKeys(Zip);
    	}

    	public void selectQuoteState(String State){
    		new Select(QuotePage.select_state).selectByVisibleText(State);
    	}

    	public void selectQuoteCuntry(String Country){
    		new Select(QuotePage.select_country).selectByVisibleText(Country);
    	}
    	
 
    /*	
    	public void OpenQuote(String QuoteTit) {
    		 	
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='QuoteTbl']/tbody/tr/td[4]"));
    		for (WebElement QuoteTitle : list) {

    			if (QuoteTitle.getText().equalsIgnoreCase(QuoteTit)) {
    				QuoteTitle.click();
    			}

    		}
    		
    	} */
    	
    	 // Quote View,Edit and Delete
    	
    	public void OpenQuote(String QuoteTit) {
    		 List<WebElement> list = (QuotePage.Clk_quoteList);
    		 
      		for (WebElement QuoteTitle : list) {

        			if (QuoteTitle.getText().equalsIgnoreCase(QuoteTit)) {
        			QuoteTitle.click();
        		}

        }
        		
  	}
     
 

		public void clkeQuotEditIcon(String QuoteEdit){
	         List<WebElement> list = (QuotePage.Clk_edit_icon); 
    		
	    for (WebElement QuoteTitle : list) {	
		  
		  if (QuoteTitle.getText().equalsIgnoreCase(QuoteEdit)) {
  			QuoteTitle.click();
    		
    	}
		  
	  }	
	  
 }
    	
    	public void clkQuotePreviewBtn(){
    		QuotePage.clk_preview_Btn.click();
    	}
    	
    	String parentHandle = driver.getWindowHandle();
    	
    	public void clkQuoteDocumentAccordion(){
    		QuotePage.clk_Document_accordion.click();
    		
    	for (String winHandle : driver.getWindowHandles()) {
    	    driver.switchTo().window(winHandle);  
    	  driver.close(); 
    	  driver.switchTo().window(parentHandle);
    	}
    }
    	public void clkQuoteAddDocumentBtn(){
    		QuotePage.clk_AddDocument_Btn.click();
    	}
    	
    	public void clkQuoteBrowseBtn(){
    		QuotePage.clk_browse_btn.click();
    	}
    	
    	public void clkQuoteUploadBtn(){
    		QuotePage.clk_upload_btn.click();
    	}
    	
    	public void clkQuotedeleteIcon(String QuoteDelete){
	         List<WebElement> list = (QuotePage.clk_delete_Icon); 
   		
	    for (WebElement QuoteTitle : list) {	
		  
		  if (QuoteTitle.getText().equalsIgnoreCase(QuoteDelete)) {
 			QuoteTitle.click();
   		
        }
	}	
	  
}
    	 
    	public void clkQuoteview() {
    		QuotePage.clk_view_qName.click();
    	}
    	
    	public void clkQuoteEditBtn(){
    		QuotePage.clk_edit_btn.click();
    	}
    	
    	public void clkQuoteReviewAccordion(){
    		QuotePage.clk_review_hitory_accordion.click();
    	}
    	
    	public void clkQuote360View(){
    		QuotePage.clk_360view_accordion.click();
    	}
    	
    	public void clkQuoteEmailAccordion(){
    		QuotePage.clk_email_accordion.click();
    	}
    	
    	public void clk_QuoteRecent_Update_Acco(){
    		QuotePage.clk_recentUpdate_accordion.click();
    	}
   // More Actions and Tool	
    	
    	public void clkQuoteMoreActionBtn(){
    		QuotePage.clk_moreaction_drpdwn.click();
    	}
    	
    	public void select_QuoteConvert(String Convert){
    		new Select(QuotePage.select_quote_convert).selectByVisibleText(Convert);
    	}
    	
    	public void select_QuoteChangeQwner(String ChangeQwner){
    		new Select(QuotePage.select_quote_changeowner).selectByVisibleText(ChangeQwner);
    	}
    	
    	public void selectQuoteMassEdit(String MassEdit){
    		new Select(QuotePage.select_quote_massedit).selectByVisibleText(MassEdit);
    	}
    	
    	public void selectQuoteMassDelete(String MassDelete){
    	   new Select(QuotePage.select_quote_massdelete).selectByVisibleText(MassDelete);
    	}
    	
    	public void selectQuoteShareRecord(String ShareRecord){
    		new Select(QuotePage.select_quote_sharerecord).selectByVisibleText(ShareRecord);
    	}
    	
    	public void clk_Quotetool(){
    		QuotePage.clk_tool_drpdwn.click();
    	}
    	
    	public void select_QuotecustomView(String CustomView){
    		new Select(QuotePage.select_quote_customView_drpdwn).selectByVisibleText(CustomView);
    	}
    	
    	}



=======
import scrmpro.pom.com.QuotePage;

public class QuoteMethod extends OppMethods{
	
	public void clickEditButtn(){
		
		QuotePage.Clickon_Edit_btn.click();
	}
	
	public void clkSavebtn(){
		QuotePage.Clickon_Quote_Save_Btn.click();
	}
	
	public void clkQuotelin(){
		QuotePage.QuoteLineItems_Displayed.click();
	}

	
	public void quoteConvert(){
		
		QuotePage.Select_Quote_Convert.click();
		{
			
		}
	}
}
>>>>>>> refs/remotes/origin/master
