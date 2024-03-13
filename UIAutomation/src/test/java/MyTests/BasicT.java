package MyTests;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicT {
	
	@Test
	public void launchAndPerform() {
		System.setProperty("webdriver.chrome.driver","C://Users//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dashboard.tmsz0.de/admin");
		driver.findElement(By.id("emailOrMobile")).sendKeys("org25admin@theqwerkyindian.com");
		driver.findElement(By.id("password")).sendKeys("Qwer@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='n-dropdown-arrow']")).click();
		
//		List<WebElement> list = driver.findElements(By.xpath("//div[@class='n-options false']//div//span"));
//		for(WebElement ele:list) {
//			String txt = ele.getText();
//			if(txt=="Marol") {
//				driver.findElement(ele).click();
//			}
//		}
//		
	}

}
