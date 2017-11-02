package com.bluestone.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest  implements AutoConstant
{
public static WebDriver driver=null;
@BeforeMethod
public void preConditions()
{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
}
@AfterMethod
public void postConditions()
{
	driver.close();
}
}
