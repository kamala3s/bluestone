package com.bluestone.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class ListenersTest implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		
	}
  
	@Override
	public void onTestFailure(ITestResult result)
	{
		String name=result.getMethod().getMethodName();
		EventFiringWebDriver e=new EventFiringWebDriver(BaseTest.driver);
		File src=e.getScreenshotAs(OutputType.FILE);
		
		try
		{
			
		FileUtils.copyFile(src,new File("./screenshot/"+name+".png"));
	    }
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext result)
	{
		
	}
	@Override
	public void onFinish(ITestContext result)
	{
		
	}
	
}
