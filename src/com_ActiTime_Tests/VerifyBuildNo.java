package com_ActiTime_Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Generic.GenericUtils;
import com_ActiTime_Pages.actiTIMEEnterTimeTrackPage;
import com_ActiTime_Pages.actiTIMELoginPage;

public class VerifyBuildNo extends BaseTest
{
	
	@Test(priority=4)
	public void Verifybuildnumber()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		String eBuildno = ExcelData.getData(file_path, "TC04", 1, 0);
		actiTIMELoginPage lg = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		lg.verifyTitle(lgTitle);
		lg.EnterUserName(un);
		lg.EnterPassword(pw);
		lg.ClickOnLogin();
		lg.verifyTitle(hpTitle);
		hp.clickOnHelp();
		hp.clickOnAboutYourActiTIME();
	   // hp.SwitchToAlert(driver);
		String aBuildno = hp.verifyBilledNo();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aBuildno, eBuildno);
		sa.assertAll();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
