package com.bluestone.generic;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class genericUtils {

	//To handle the drop down list /list box-to select options
	
	public static void SelectByIndex(WebElement element,int n)
	{
		Select sel= new Select(element);
		sel.selectByIndex(0);
	}
	public static void SelectByValue(WebElement element,String value)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
		
	public static void deselectByVisibleText(WebElement element,String visibleText)
	{
		Select sel= new Select(element);
		sel.deselectByVisibleText(visibleText);
	}
	
	//to deselect the options
	
	public static void deselectByIndex(WebElement element,int n)
	{
		Select sel= new Select(element);
		sel.deselectByIndex(0);
	}
	public static void deselectByValue(WebElement element,String value)
	{
		Select sel= new Select(element);
		sel.deselectByValue(value);
	}
		
	public static void SelectByVisibleText(WebElement element,String visibleText)
	{
		Select sel= new Select(element);
		sel.deselectByVisibleText(visibleText);
	}
	
	//To handle mouse operations of drop down menu
	
	public static void moveToElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public static void dragAndDrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dest).perform();
	}
	
	//to context click
	public static void contextClick( WebDriver driver,WebElement link)
	{
		Actions act=new Actions(driver);
		act.moveToElement(link).perform();
	}
		
	
	//To composite Actions
	public static void compositeAction( WebDriver driver,WebElement link)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL).click(link).perform();
	}
	//To alert accept
	public static void alertAccept( WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	
	}
	
	//To handle child browsers pop up
	
	public static void windowHandle(WebDriver driver,String eTitle)
	{
		Set<String>winHandle =driver.getWindowHandles();
		Iterator <String> itr=winHandle.iterator();
		while(itr.hasNext())
		{
			String  wh=itr.next();
			driver.switchTo().window(wh);
			if(driver.getTitle().equals(eTitle))
			{
				break;
			}
		}
		
	}
	
}