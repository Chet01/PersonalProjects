package MyTests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BasicTest {
	
	@Test
	public void fetchListInElectronics() {
		System.setProperty("webdriver.chrome.driver","C://Users//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		////div[@class='_16rZTH']//a
		//span[contains(text(),'Electronics')]
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_16rZTH']//a"));
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		List<WebElement> list2 = new ArrayList<>();
		for(WebElement ele:list1) {
			if(ele.getAttribute("href")!=null) {
				list2.add(ele);
			}
		}
		for(WebElement ele:list1) {
			System.out.println(ele.getText());
		}
		System.out.println("-------------------------");
		for(WebElement ele:list2) {
			System.out.println(ele.getText());
		}
		}
}
