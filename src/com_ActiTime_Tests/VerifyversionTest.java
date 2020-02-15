package com_ActiTime_Tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMELoginPage;

public class VerifyversionTest extends BaseTest
{
	@Test(priority = 3)
	public void Verifyversion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		String eversion = ExcelData.getData(file_path, "TC03", 1, 0);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		//verify login page title
		lp.verifyTitle(title);
		String aversion = lp.verifyVersion();
		SoftAssert sa = new SoftAssert();
		//verifying version of application
		sa.assertEquals(aversion, eversion);
		Reporter.log("version "+aversion,true);
		sa.assertAll();
	}

}
