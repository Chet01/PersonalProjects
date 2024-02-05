package MyTests;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowHandling {
    WebDriver driver;
    
    @org.testng.annotations.Test
    public void Test() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");  
//	     WebDriverManager.chromedriver().setup();
	       // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver(); 
	     driver.get("https://www.swtestacademy.com/window-handling-in-selenium/");
	     driver.manage().window().maximize();
	     String parentId = driver.getWindowHandle();
	     String parentWindow = driver.getTitle();
	     System.out.println(parentWindow);
	     WebElement ele1 = driver.findElement(By.xpath("//span//strong[contains(text(),'Example-1: How to Handle Multiple Windows in Selenium?')]"));
	     WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target')]"));
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("arguments[0].scrollIntoView();", ele1);
	     ele.click();
	     Thread.sleep(5000);
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles.size());
	     System.out.println("opened next tab");
	     Thread.sleep(4000);
	     Iterator<String> it = handles.iterator();
	     //switch to child window
	     while(it.hasNext()) {
	    		 driver.switchTo().window(it.next());
	    		 System.out.println(driver.getTitle());
	    	 }
	     }
//	     for(String windowId:handles) {
//	    	 String window = driver.switchTo().window(windowId).getTitle();
//	    	 System.out.println(window);
//	     }
    }



