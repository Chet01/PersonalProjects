package com.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    
	WebDriver driver;
    WebDriverWait wait;
    
    public Page(WebDriver driver) {
    	this.driver = driver;
    	//explicit wait
    	this.wait = new WebDriverWait(this.driver,15);
    }
    
    //abstract methods
    public abstract String getPageTitle();
    
    public abstract String getPageHeader(By loacator);
    
    public abstract WebElement getWebElement(By locator);
    
    public abstract void waitForElementPresent(By locator);
    
    public abstract void waitForPageTitle(String title);
    
    public abstract void minWait();
    
    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
    	try{
    	return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		return null;
    }
}
