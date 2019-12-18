package com.tm.ScreenPages;

import org.apache.log4j.pattern.LogEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tm.Libraries.Weblibrary;

public class Performance extends Weblibrary
{
@FindBy(xpath="//a[text()='Manage Reviews']")
public static WebElement elm_ManageReviews;
@FindBy(xpath="//a[text()='My Reviews']")
public static WebElement elm_MyReviews;
@FindBy(xpath="//span[text()='Employee']")
public static WebElement lbl_Employee;

public void Performance()throws InterruptedException
{
	boolean status;
	
	status=moveToElement(elm_ManageReviews);
    logEvent(status,"Manage Reviews is clicked","Manage Reviews is not clicked");
    
    status=clickElement(elm_MyReviews);
    logEvent(status,"My Reviews is clicked","My Reviews is not clicked");
    
    status=isExist(lbl_Employee); 
    logEvent(status, "Label Employee is displayed","Label Employee is not displayed");
	
 }
 
}