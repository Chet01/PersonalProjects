package com.myPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Homepage extends BasePage{

	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	private By adminBtn = By.xpath("(//div[@class='oxd-sidepanel-body']//li[@class='oxd-main-menu-item-wrapper'])[1]");
	
	private By username = By.xpath("//div[@class='oxd-table-filter']//input[@class='oxd-input oxd-input--active']");
	
	private By userRoleDrpdwn = By.xpath("(//div[@class='']//div[@class='oxd-select-text oxd-select-text--active'])[1]");
	
	private By searchBtn = By.xpath("//div[@class='oxd-form-actions']//button[@type='submit']");
	
	private By statusBtn = By.xpath("(//div[@class='']//div[@class='oxd-select-text oxd-select-text--active'])[2]");
	/**
	 * Method to return Home Page Title
	 * @return String LoginPageTitle
	 */
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	/**
	 * Method to navigate to Admin Tab
	 */
	public Homepage navigateToAdminTab() {
		WebElement adminTab = driver.findElement(adminBtn);
		adminTab.click();;
		Assert.assertTrue(true,"Clicked on Admin Tab button!");
		return getInstance(Homepage.class);
	}
	
	/**
	 * Method to search User
	 * @param userName
	 * @param userRole
	 * @param enabled
	 * @return
	 */
	public Homepage searchUser(String userName,String userRole,boolean enabled) {
		driver.findElement(username).sendKeys(userName);
		//select a dropdown using Select Class
		driver.findElement(userRoleDrpdwn).click();
		driver.findElement(By.xpath("//span[contains(text(),'"+userRole+"')]")).click();
		driver.findElement(statusBtn).click();
		if(enabled==true) {
			driver.findElement(By.xpath("//span[contains(text(),'Enabled')]")).click();
		}
		else {
			driver.findElement(By.xpath("//span[contains(text(),'Disabled')]")).click();
		}
		WebElement search = driver.findElement(searchBtn);
		search.click();
		Assert.assertTrue(true, "Searched the User Specified : "+userName+" and clicked Search Button!");
		return getInstance(Homepage.class);
	}

	public By getAdminBtn() {
		return adminBtn;
	}

	public By getUsername() {
		return username;
	}

	public By getUserRoleDrpdwn() {
		return userRoleDrpdwn;
	}

	public By getSearchBtn() {
		return searchBtn;
	}

	public void verifyUserDisplayed(String userName,String xpath) {
		if(verifyElementPresent(By.xpath(xpath))) {
		scrollToView(xpath);
		minWait();
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'"+userName+"')]")).getText(), userName,"Record found with User Name : "+userName);
		}
		else {
		   System.out.println("User not Found!");
		}
	}

	public void fetchQualificationValues() {
		driver.findElement(By.xpath("//span[text()='Qualifications ']//i[@class='oxd-icon bi-chevron-down']")).click();
		List<WebElement> qualifications = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']"));
		for(WebElement ele:qualifications) {
			System.out.println(ele.getText());
		}
	}
;
}
