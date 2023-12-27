package com.myPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getWebElement(locator).getText();	
	}

	@Override
	public WebElement getWebElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		}
		catch(Exception e) {
			System.out.println("Some error occured while creating Web Element!");
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}
		catch(Exception e) {
			System.out.println("Some exception / error occured while waiting for an element "+locator.toString());
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			System.out.println("Title of WebPage is : "+title);
		}
		catch(Exception e) {
			System.out.println("Some exception / error occured while waiting for the title "+title);
		}
		
	}

	@Override
	public void minWait() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void scrollToView(String xpath) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath(xpath));
		jse.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public boolean verifyElementPresent(By locator) {
		boolean res= driver.findElement(locator).isDisplayed();
		try {
		if(res) {
			Assert.assertTrue(res, "Element displayed successfully!");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
}
