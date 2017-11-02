package com.bluestone.generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)

	{
		this.driver=driver;
		
	}
	
	//To verify the title of the page
	
	public void VerifyTitle(String eTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching:"+eTitle,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching:"+eTitle,true);
			Assert.fail();
		}
	}

//To verify the elements
	public void verifyElementPresent(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is matching:"+element,true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching:"+element.getText(),true);
			Assert.fail();
		}
	}
}

