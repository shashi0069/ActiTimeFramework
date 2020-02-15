package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;
import com_ActiTime_Generic.GenericUtils;

public class actiTIMEEnterTimeTrackPage extends BasePage
{
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]") 
	private WebElement help;
	
	@FindBy(xpath="//a[.='About your actiTIME']") 
	private WebElement about;
	
	@FindBy(xpath="//span[@class='productVersion']/../span[2]") 
	private WebElement bno;

	public actiTIMEEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout()
	{
		logout.click();
		
	}
	public void clickOnHelp()
	{
		help.click();
	}
	public void clickOnAboutYourActiTIME()
	{
		about.click();
	}
	public void SwitchToAlert(WebDriver driver) 
	{
		GenericUtils.SwitchToJavaScriptAlert(driver);
	}
	
	
	public String verifyBilledNo()
	{
		verifyElement(bno);
		String abno = bno.getText();
		return abno;
	}
	
}
