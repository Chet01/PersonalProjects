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

	@Given("user is already on HomePage")
	public void user_is_already_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Moolya/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@When("title of Page is Online Shopping Site")
	public void title_of_page_is_online_shopping_site() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Online Shopping"));
	}
	@Then("user search the product")
	public void user_search_the_product() {
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("user validates the product result")
	public void user_validates_the_product_result() {
		String result = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).getText();
	    Assert.assertEquals(result.contains("iPhone 15"), true);
	}






}
