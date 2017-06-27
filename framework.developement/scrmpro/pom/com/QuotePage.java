package scrmpro.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage extends OppPage{

	public QuotePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Add Quote
	
	@FindBy(id="lBtnQuotePage")
	public static WebElement Clk_Quote_tab;
	
	@FindBy(id="//a[contains(@class,'btn-warning')]")
	public static WebElement clk_addnewbtn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_txtQuoteNumber")
	public static WebElement entr_quote_name;
	
	//@FindBy(id="ContentPlaceHolder1_AddQuote_TxtQuoteNumber")
	//public static WebElement entr_quotenumber;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindAccoun")
	public static WebElement clk_account_search_Btn;	
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAccountName")
	public static WebElement slect_accountname_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lBtnBindOpportunity")
	public static WebElement clk_opp_search_Btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlOpportunity")
	public static WebElement Slect_quote_opp_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlIndustryQuote")
	public static WebElement slect_quoteindustry_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStatusCode")
	public static WebElement slect_quotestatus_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlPaymentTermCode")
	public static WebElement slect_quote_paymentTerm_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbExpiresOn")
	public static WebElement slect_Quote_ValideTill;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlTransactionCurrency")
	public static WebElement slect_quote_Currency_drpdwn;
	
//	@FindBy(id="ContentPlaceHolder1_AddQuote_tbtotalAmount")
//	public static WebElement tex_Quote_total_amount;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_TxtDescription")
	public static WebElement entr_quoteterms_condition;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSave")
	public static WebElement clk_quote_save_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_Button6")
	public static WebElement Clk_quote_back_btn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSaveNew")
	public static WebElement clk_quote_SavenewBtn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lnkBtnCancel")
	public static WebElement clk_quoteclose_btn;
	
	// Quote line item
	
	@FindBy(xpath="//a[contains(@id,'callPopUp')]")
    public static WebElement clk_qline; 
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_lBtnProductBind")
    public static WebElement clk_search_qline_item; 
	
	@FindBy(id="ddlItemCurrency")
    public static WebElement slect_currency_Drpdwn;
	
	@FindBy(xpath="//*[@id='ProductTbl']/thead/tr[1]/td[1]")
	public static WebElement clk_All_Product_chkbox;
	
	@FindBy(id="cbCheckBox2")
	public static WebElement clk_productone_chkbox;
	
	@FindBy(id="cbCheckBox3")
	public static WebElement clk_producttwo_chkbox;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_lnkBtnBindProduct")
	public static WebElement clk_qLineItemBindbtn;
	
	@FindBy(id="@id=txtSearchPCat")
	public static WebElement txt_search_product_catgry;
	
	@FindBy(id="@id=txtSearchPName")
	public static WebElement txt_search_product_name;
	
	@FindBy(id="txtSearchProductQty")
	public static WebElement txt_search_product_qty;
	
	@FindBy(xpath="//*[@id=ProductTbl']/tbody/tr/td[2]/a)")
	public static WebElement clk_view_product;

	@FindBy(xpath=".//div[@class='btn.btn-info']")
	public static WebElement qLineItems_displayed;
	
	// Address Information
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[1]")
	public static WebElement clk_Addres_info;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlAddressTitle")
	public static WebElement slect_sddressName_Drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_chkDefaultAdr")
	public static WebElement chk_DefaultAddress;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbAddress")
	public static WebElement entr_address;

	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlStreet")
	public static WebElement slect_street;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCity")
	public static WebElement slect_city;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_tbZip")
	public static WebElement entr_zipcode;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlState")
	public static WebElement slect_state;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_ddlCountry")
	public static WebElement slect_country;
	
	// Quote View,Edit and Delete
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_tdEditQuote_0")
	public static WebElement Clk_edit_icon;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnPreview")
	public static WebElement clk_preview_Btn;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[22]")
	public static WebElement clk_Document_accordion;
	
	@FindBy(xpath=".//*[@id='Div9']/div[2]/a")
	public static WebElement clk_AddDocument_Btn;
	
	@FindBy(id="fileUpload")
	public static WebElement clk_browse_btn;
	
	@FindBy(id="btnupload")
	public static WebElement clk_upload_btn;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ViewQuote1_lvQuote_lnkbtnRemove_0']")
	public static WebElement clk_delete_Icon;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_cbSelectAll")
	public static WebElement Chk_all_quote;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_cbCheckBox_0")
	public static WebElement Chk_quote1;
	
//	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_cbCheckBox_1")
//	public static WebElement chk_quote2;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lvQuote_tdName_0")	
	public static WebElement clk_view_qName;
	
	@FindBy(id="btnEdit")
	public static WebElement clk_edit_btn;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[12]")
	public static WebElement clk_review_hitory_accordion;
	
	@FindBy(xpath="(.//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[13]")
	public static WebElement clk_360view_accordion;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[20]")
	public static WebElement clk_email_accordion;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_AddQuote_TxtDescription']//following::i[24]")
	public static WebElement clk_recentUpdate_accordion;
	
	
	// More Actions and Tool
	
	@FindBy(xpath="//a[contains(@class,'btn-warning")
	public static WebElement clk_moreaction_drpdwn;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lbkBtnCreateContract")
	public static WebElement slect_quote_convert;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkChangerOwner")
	public static WebElement slect_quote_changeowner;
	
	@FindBy(xpath="//div[4]/button")	
	public static WebElement slect_quote_massedit;
	
	@FindBy(id="ContentPlaceHolder1_ViewQuote1_lnkMassDelete")
	public static WebElement slect_quote_massdelete;
	
	@FindBy(id="lnkShareRecord")
	public static WebElement slect_quote_sharerecord;
	
	@FindBy(xpath="//div[5]/button")
	public static WebElement clk_tool_drpdwn;
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ViewQuote1_liCustomView']/a")
	public static WebElement slect_quote_customView_drpdwn;		
	
	 
}
