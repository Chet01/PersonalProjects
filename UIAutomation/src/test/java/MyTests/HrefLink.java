package MyTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HrefLink {

	@Test
	public void testLink()
	{
		 System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");  
//	     WebDriverManager.chromedriver().setup();
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver(); 
	    driver.get("https://www.flipkart.com/");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    for(WebElement ele:allLinks) {
	    	String txt = ele.getText();
	    	System.out.println("text : "+txt);
	    	System.out.println("href value : "+ele.getAttribute("href"));
	    }
	}
}
