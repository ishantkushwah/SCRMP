      package scrmpro.appmethods.com;

import scrmpro.pom.com.QuotePage;
import org.openqa.selenium.support.ui.Select;

public class QuoteMethod extends OppMethods{

    public void ClkQuoteTab(){

       QuotePage.Clk_Quote_tab.click();
    }

     public void ClkAddNew(){
       QuotePage.clk_addnewbtn.click();
   }

     public void QuoteName(String Name){
        QuotePage.entr_quote_name.sendKeys(Name);
   }

     public void ClkAccountSearch() {
         QuotePage.clk_account_search_Btn.click();
   }

     public void Slect_AccountName(String Account) {
        new Select(QuotePage.slect_accountname_drpdwn).selectByVisibleText(Account);
   }

     public void ClkOppSearch() {
        QuotePage.clk_opp_search_Btn.click();
   }
     public void Slect_OppName(String Opp) {
       new Select(QuotePage.Slect_quote_opp_drpdwn).selectByVisibleText(Opp);
   }

     public void Slect_Industy(String Industry) {
        new Select(QuotePage.slect_quoteindustry_drpdwn).selectByVisibleText(Industry);
   }
     public void Slect_quoteStatus(String Status) {
       new Select(QuotePage.slect_quotestatus_drpdwn).selectByVisibleText(Status);
   }
     public void Slect_paymentTerm(String Payment) {
       new Select(QuotePage.slect_quote_paymentTerm_drpdwn ).selectByVisibleText(Payment);
   }

     public void Slect_quoteValidTill(){
        QuotePage.slect_Quote_ValideTill.click();
   }

     public void Clect_QuoteCurrency(String Currency){
         new Select(QuotePage.slect_quote_Currency_drpdwn).selectByVisibleText(Currency);
   }

 
     public void EntrCondition(String TermCondition){
        QuotePage.entr_quoteterms_condition.sendKeys(TermCondition);
   }

     public void ClkQuoteSave(){
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

     public void clkQline(){
         QuotePage.clk_qline.click();
   }

     public void clkQuoteSearch(){
         QuotePage.clk_search_qline_item.click();
   }

     public void slectCurrenc(String CurencyLis){
        new Select(QuotePage.slect_currency_Drpdwn).selectByVisibleText(CurencyLis);
   }
     public void clkProductChkbox(){
        QuotePage.clk_All_Product_chkbox.click();
   }

     public void clkProductFirst(){
    	  QuotePage.clk_productone_chkbox.click();
   }

     public void clkProductscnd(){
         QuotePage.clk_producttwo_chkbox.click();
   }

     public void clkQLineBind(){
         QuotePage.clk_qLineItemBindbtn.click();
   }

     public void entrProductCategory(String Category){
    	 QuotePage.txt_search_product_catgry.sendKeys(Category);
    	 
     }
     public void enterProductName(String ProductName){
    	 QuotePage.txt_search_product_name.sendKeys(ProductName); 
     }
      
     public void entrProductQut( CharSequence[] ProductQut){
    	 QuotePage.txt_search_product_qty.sendKeys(ProductQut);
     }

     public void clkViewPrduct(){
    		QuotePage.clk_view_product.click();
    	}

    	public void clkQLineDisplay(){
    		QuotePage.qLineItems_displayed.click();
    		
    	}
    	// Address Information

    	public void clkAddressInfo(){
    		QuotePage.clk_Addres_info.click();
    	}

    	public void selectAddress(String Addressinfo){
    		new Select(QuotePage.slect_sddressName_Drpdwn).selectByVisibleText(Addressinfo);
    	}

    	public void chkDefaultAddress(){
    		QuotePage.chk_DefaultAddress.click();
    	}

    	public void enterAddress(String Address){
    		QuotePage.entr_address.sendKeys(Address);
    	}

    	public void slectStreet(String Street){
    		new Select(QuotePage.slect_street).selectByVisibleText(Street);
    	}

    	public void slectCity(String City){
    		new Select(QuotePage.slect_city).selectByVisibleText(City);
    	}

    	public void entrZipCode(String Zip){
    		QuotePage.entr_zipcode.sendKeys(Zip);
    	}

    	public void slectState(String State){
    		new Select(QuotePage.slect_state).selectByVisibleText(State);
    	}

    	public void slectCuntry(String Country){
    		new Select(QuotePage.slect_country).selectByVisibleText(Country);
    	}
    	
  // Quote View,Edit and Delete
    	
    	public void clkeditIcon(){
    		QuotePage.clk_edit_btn.click();
    	}
    	
    	public void clkPreviewBtn(){
    		QuotePage.clk_preview_Btn.click();
    	}
    	
    	public void clkDocumentAccordion(){
    		QuotePage.clk_Document_accordion.click();
    	}
    	
    	public void clkAddDocumentBtn(){
    		QuotePage.clk_AddDocument_Btn.click();
    	}
    	
    	public void clkBrowseBtn(){
    		QuotePage.clk_browse_btn.click();
    	}
    	
    	public void clkUploadBtn(){
    		QuotePage.clk_upload_btn.click();
    	}
    	
    	public void clkQDeleteIcon(){
    		QuotePage.clk_delete_Icon.click();
    	}
    	
    	public void clkAllQuote(){
    		QuotePage.Chk_all_quote.click();
    	}
    	
    	public void clkQuote1(int i){
    		QuotePage.Chk_quote1.click();
    	}
    	
    	public void clkQview() {
    		QuotePage.clk_view_qName.click();
    	}
    	
    	public void clkQEditBtn(){
    		QuotePage.clk_edit_btn.click();
    	}
    	
    	public void clkReviewAccordion(){
    		QuotePage.clk_review_hitory_accordion.click();
    	}
    	
    	public void clk360View(){
    		QuotePage.clk_360view_accordion.click();
    	}
    	
    	public void clkEmailAccordion(){
    		QuotePage.clk_email_accordion.click();
    	}
    	
    	public void clk_Recent_Update_Acco(){
    		QuotePage.clk_recentUpdate_accordion.click();
    	}
   // More Actions and Tool	
    	
    	public void clkMoreActionBtn(){
    		QuotePage.clk_moreaction_drpdwn.click();
    	}
    	
    	public void slect_QConvert(String Convert){
    		new Select(QuotePage.slect_quote_convert).selectByVisibleText(Convert);
    	}
    	
    	public void slect_QChangeQwner(String ChangeQwner){
    		new Select(QuotePage.slect_quote_changeowner).selectByVisibleText(ChangeQwner);
    	}
    	
    	public void slectMassEdit(String MassEdit){
    		new Select(QuotePage.slect_quote_massedit).selectByVisibleText(MassEdit);
    	}
    	
    	public void slectMassDelete(String MassDelete){
    	   new Select(QuotePage.slect_quote_massdelete).selectByVisibleText(MassDelete);
    	}
    	
    	public void slectShareRecord(String ShareRecord){
    		new Select(QuotePage.slect_quote_sharerecord).selectByVisibleText(ShareRecord);
    	}
    	
    	public void clk_tool(){
    		QuotePage.clk_tool_drpdwn.click();
    	}
    	
    	public void slect_customView(String CustomView){
    		new Select(QuotePage.slect_quote_customView_drpdwn).selectByVisibleText(CustomView);
    	}
    	
    	}