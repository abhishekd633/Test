package com.tm.ScreenPages;

import org.apache.log4j.pattern.LogEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyInfo extends Weblibrary
{
	
	/*
	 * //Leave Date field
	 * 
	 * @FindBy(xpath = "//select[@id='entitlements_leave_type']") public static
	 * WebElement dd_Entl_LeaveType;
	 * 
	 * //Leave Period field
	 * 
	 * @FindBy(xpath = "//select[@id='period']") public static WebElement
	 * dd_LeavePeriod;
	 */
	
	//Personal Link field
	@FindBy(xpath = "//a[text()='Personal Details']")
	public static WebElement lnk_Personal;
	
	//Edit Button 
	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement btn_Edit;
	
	//Employee ID
	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")
	public static WebElement txt_EmployeeId;
	
	//Driver License No
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")
	public static WebElement txtLincense_No;
	
	//First Name text
	@FindBy(xpath = "//input[@id='personal__csrf_token'")
	public static WebElement txt_FirstName;
	
	//Button Save 
	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement btn_Save;
	
    //Attachment Add Button 
	@FindBy(xpath = "//input[@id='btnAddAttachment']")
	public static WebElement btn_Attch_Add;
	

	//==============================================
	
	public static void MyInfo(){
		boolean status;
		
		/*
		 * status = selectByText(dd_Entl_LeaveType, ""); logEvent(status,
		 * "From date entered", "From date not entered");
		 * 
		 * status = setTextandEscape(edit_ToDate, "2019-10-26"); logEvent(status,
		 * "To date entered", "To date not entered");
		 */
		
		status = clickElement(lnk_Personal);
		logEvent(status, "Personal_Link clicked", "Personal_Link not clicked");
		
	    status = clickElement(btn_Edit);
		logEvent(status, "Edit Button  clicked", "Edit Button not clicked");
		
		status=isEnabled(txt_EmployeeId);
		logEvent(status, "Employee ID is enabled", "Employee ID is not enabled");
		
		status=isEnabled(txtLincense_No);
		logEvent(status, "Lincense No is enabled", "Lincense No is not enabled");
		
	    status = setText(txt_FirstName,"Test");
	    logEvent(status, "FirstName No is entered", "FirstName is not entered");
	    
	    status = clickElement(btn_Save);
	    logEvent(status, "Save is clicked", "Save is not clicked");
	    
	    //Attachments
	    status=clickElement(btn_Attch_Add);
	    logEvent(status, "Add Button is clicked", "Add Button is not clicked");
	    
	    
	}

	//==============================================
	
}







