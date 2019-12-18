package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyLeave extends Weblibrary
{
	
	//From Date field
	@FindBy(xpath = "//input[@id='calFromDate']")
	public static WebElement edit_FromDate;
	
	//To Date field
	@FindBy(xpath = "//input[@id='calToDate']")
	public static WebElement edit_ToDate;
	
	//All Checkbox field
	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public static WebElement chkbx_All;
	
	//Search field
		@FindBy(xpath = "//input[@name='btnSearch']")
		public static WebElement btn_Search;
		
   //Search Table with contents is displayed
		@FindBy(xpath = "//table[@class='table hover']/thead/tr/th/span")
		public static WebElement tbl_Search;
		

	//==============================================
	
	public static void MyLeave(){
		boolean status;
		
	    status = setTextandEscape(edit_FromDate, "2019-10-26");
		logEvent(status, "From date entered", "From date not entered");
		
		status = setTextandEscape(edit_ToDate, "2019-10-26");
		logEvent(status, "To date entered", "To date not entered");
		
		status = clickElement(btn_Search);
		logEvent(status, "Search button clicked", "Search button not clicked");
		
		status=isExist(tbl_Search);
		logEvent(status, "Search Table with contents is displayed", "Search Table with contents is not displayed");
	}
	
	//==============================================
	
}







