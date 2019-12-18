package com.tm.TestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.MyInfo;
import com.tm.ScreenPages.MyLeave;
import com.tm.ScreenPages.Performance;

public class TestCases_Leave extends BaseClass {

	@Test
	public void TC101_verifyLoginFunctionality() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		/*
		 * for (int i=0;i<=data.length;i++) System.out.println(data[i]);
		 */
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		//Login lp = new Login();
		//Create the page pattern to Home Page
		//Home hpg = PageFactory.initElements(driver, Home.class);		

		lp.LoginHRM(data[0],data[1]);
		
		//lp.LoginHRM("user02", "TM1234");
		
		//hpg.Exist();
		//hpg.logOut();
	}
	
	//==============================================================================
	@Test
	public void TC102_ApplyLeave() {
		
		Login login = PageFactory.initElements(driver,Login.class);
		Home home = PageFactory.initElements(driver,Home.class);
		ApplyLeave applyleave = PageFactory.initElements(driver,ApplyLeave.class);
				
		//Step 1: Login as a team member
		login.LoginHRM("user02","TM1234");
		
		//Step 2: Navigate Apply Leave page
		home.navApplyLeave();
		
		//Step 3: Enter leave details and click save
		applyleave.ApplyLeave();
		
		//Step 4: Navigate my Leave page
		home.navMyLeave();
		
		//Step 5: Verify leave details in My Leave page
		
		
		//Step 6: Logout
		home.Logout();		
		
	}
	
   //=========================================
		@Test
		public void TC103_MyLeave() {
			
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			MyLeave myLeave = PageFactory.initElements(driver, MyLeave.class);
			
		//log4j
		/*
		 * DOMConfigurator.configure("log4j.xml"); Logger log
		 * =Logger.getLogger(TestCases_Leave.class);
		 * log.info("My Leave tab is clicked");
		 */
			
			
			//Reporter Logs
			Reporter.log("My Leave tab is clicked");
					
			//Step 1: Login as a team member
			login.LoginHRM("user02", "TM1234");
			
			//Step 2: Navigate My Leave page
			home.navMyLeave();
			
			//Step 3: Verify leave details and click save
			myLeave.MyLeave();
			
	        //Step 6: Logout
			home.Logout();		
			
}
		
		@Test
		public void TC103_MyInfo() 
		{
			
			Login login = PageFactory.initElements(driver,Login.class);
			Home home = PageFactory.initElements(driver,Home.class);
			MyInfo myInfo = PageFactory.initElements(driver,MyInfo.class);
					
			//Step 1: Login as a team member
			login.LoginHRM("user02", "TM1234");
			
			//Step 2: Navigate My Info page
			home.navMyInfo();
			
			//Step 3: Verify leave details and click save
			myInfo.MyInfo();

	        //Step 6: Logout
			home.Logout();		
      }
		@Test
		public void TC104_Performance() throws InterruptedException
		{
			{
				Login ln=PageFactory.initElements(driver,Login.class);
				Home hm=PageFactory.initElements(driver,Home.class);
				Performance pf=PageFactory.initElements(driver,Performance.class);
		        hm.navPerf();
				pf.Performance();
				hm.Logout();
            }
		}
}
	
	
	
	
	
	
	
	
