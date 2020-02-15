package com_ActiTime_Tests;

import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMEEnterTimeTrackPage;
import com_ActiTime_Pages.actiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void ValidLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		
		//verify login page title
		lp.verifyTitle(lgTitle);
		
		//enter user name 
		lp.EnterUserName(un);
		
		//enter password
		lp.EnterPassword(pw);
		// click on login button
		lp.ClickOnLogin();
		//verify Enter Time-Track
		lp.verifyTitle(hpTitle);
		// click on logout button
		hp.clickOnLogout();
		//verify login page title
		lp.verifyTitle(lgTitle);
		
	}

}
