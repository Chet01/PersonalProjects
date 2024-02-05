package MyTests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void FetchBrokenLinks() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> activeLinks = new ArrayList<>();
		for (int i = 0; i < allLinks.size(); i++) {
			if (allLinks.get(i).getAttribute("href") != null && allLinks.get(i).getAttribute("href")!=" " ) {
				activeLinks.add(allLinks.get(i));
			}
		}
		for(WebElement el:activeLinks) {
			System.out.println(el.getText());
		}
		int responseCode=0;

		System.out.println(allLinks.size());
		System.out.println(activeLinks.size());
		for (WebElement ele : activeLinks) {
			System.out.println(ele.getText());
				for (int j = 0; j < activeLinks.size(); j++) {
					HttpURLConnection http = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
							.openConnection();
					try {
					http.connect();
					Thread.sleep(3000);
					responseCode = http.getResponseCode();
					String responseMsg = http.getResponseMessage();
					http.disconnect();
					Thread.sleep(3000);
					System.out.println(responseCode);
					System.out.println(responseMsg);
					System.out.println("------------------------------");
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				} 
			} 
		}
}
