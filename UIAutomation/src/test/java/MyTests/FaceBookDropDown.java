package MyTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDown {

	@Test
	public void fetchDropDowns() {
		System.setProperty("webdriver.chrome.driver","C://Users//Moolya//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		List<String> list1 = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
		for(WebElement ele:list) {
			list1.add(ele.getText().toString());
		}
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
	}

}
