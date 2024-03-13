package MyTests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePage {

	@Test
	public void addAmount() {
		//System.setProperty("webdriver.chrome.driver","C://Users//chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//		WebElement ele = driver.findElement(By.xpath("//legend[contains(text(),'Web Table Fixed header')]"));
		//		
		//		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//		
		//		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		//		
		//		List<WebElement> list = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr"));
		//		
		//		List<String> list1 = new ArrayList<>();
		//		
		//		List<Integer> list2 = new ArrayList<>();
		//		
		//		for(int i=1;i<list.size();i++) {
		//			list1.add(driver.findElement(By.xpath("(//table[@id='product'])[2]//tr["+i+"]//td[2]")).toString());
		//		}
		//		
		//		for(int i=0;i<list1.size();i++) {
		//			list2.add(Integer.parseInt(list1.get(i)));
		//		}
		//		
		//		int total = 0;
		//		for(int i:list2) {
		//			total+=i;
		//		}
		//		System.out.println(list2);
		//		System.out.println("Total amount is : "+total);
	}

}
