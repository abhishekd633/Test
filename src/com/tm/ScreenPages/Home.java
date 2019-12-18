package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary{
	
	//===========Elements section===================
	//Leave menu Field
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement link_Leave;
	
	@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
	public static WebElement link_ApplyLeave;
	
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement link_MyLeave;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	@FindBy(xpath = "//a[@id='menu__Performance']")
	public static WebElement tb_Performance;
	
	//============Methods section==============
	public static void navApplyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);		
		status = clickElement(link_ApplyLeave);	
		logEvent(status, "Apply leave menu link clicked", "Apply leave menu link not clicked");
	}
	
	public static void navMyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);
		status = clickElement(link_MyLeave);	
		logEvent(status, "MyLeave menu link clicked", "MyLeave menu link not clicked");
	}
	
	public static void navMyInfo(){
		boolean status;
		status = clickElement(link_MyInfo);	
		logEvent(status, "MyInfo menu link clicked", "MyInfo menu link not clicked");		
	}

@FindBy(xpath="//a[text()='Manage Reviews']")
public static WebElement elm_ManageReviews;

@FindBy(xpath="//a[text()='My Reviews']")
public static WebElement elm_MyReviews;

	public static void navPerf(){			
		 
		boolean status;
		wait(2);
		status = moveToElement(tb_Performance);
        logEvent(status,"Performance menu link clicked","Performance menu link not clicked");		
	}
	
	public static void Logout(){			
		
	}
	
	//=====================================

}





