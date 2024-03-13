package MyTests;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class WIndowHandling {
    WebDriver driver;
    
    @org.testng.annotations.Test
    public void Test() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");  
//	     WebDriverManager.chromedriver().setup();
	       // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver(); 
	     driver.get("https://www.spicejet.com/");
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("(//div//input[@autocapitalize='sentences'])[1]")).sendKeys("BE");
	     
	     Actions action = new Actions(driver);
	     
	     WebElement ele = (WebElement) action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")));
	     
	     String place = ele.getText();
	     
	     Assert.assertEquals(place, "Bengaluru");
	     
    }
}



