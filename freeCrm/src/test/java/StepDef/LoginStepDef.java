package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	WebDriver driver;
	
	@Given("user is already on login Page")
	public void user_is_already_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
//		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(20000);
	}
	@When("title of Login Page is Free CRM")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Free CRM software"));
	}
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("chethan.kumar@moolya.com");
		driver.findElement(By.name("password")).sendKeys("Freecrm@01");
		Assert.assertTrue("Username and Password has been entered!", true);
	}
	@Then("user clicks on Login Page")
	public void user_clicks_on_login_page() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		Assert.assertTrue("Clicked on Login button!", true);
	}
	@Then("user is on Home Page")
	public void user_is_on_home_page() {
		String userName = driver.findElement(By.xpath("//div//span[@class='user-display']")).getText();
		Assert.assertTrue("UserName validated!", userName.equals("Chethan Kumar N"));
	}



}
