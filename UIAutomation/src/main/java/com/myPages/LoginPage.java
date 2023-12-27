/**
 * 
 */
package com.myPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */
public class LoginPage extends BasePage {
	
	private By username = By.xpath("//div//input[@name='username']");
	private By password = By.xpath("//div//input[@name='password']");
	private By loginBtn = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getUsername() {
		return getWebElement(loginBtn);
	}

	public WebElement getPassword() {
		return getWebElement(password);
	}

	public WebElement getLoginBtn() {
		return getWebElement(loginBtn);
	}
	
	//All Login Page Methods
	
	/**
	 * Method for login using default credentials
	 * @return Homepage
	 */
	public Homepage doLogin() {
		try {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginBtn).click();
		System.out.println("logged in Successfully!");
		}
		catch(Exception e) {
			System.out.println("Coudn't log in due to some Error!");
		}
		return getInstance(Homepage.class);	
	}

	/**
	 * Method for login using different credentials
	 * @return Homepage
	 */
	public Homepage doLogin(String userName,String passWord) {
		try {
		WebElement userId = driver.findElement(username);
		userId.sendKeys(userName);
		WebElement pass = driver.findElement(password);
		pass.sendKeys(passWord);
		driver.findElement(loginBtn).click();
		System.out.println("logged in Successfully!");
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("Coudn't log in due to some Error!");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getInstance(Homepage.class);	
	}
	/**
	 * Method to return login Page Title
	 * @return String LoginPageTitle
	 */
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	

}
