package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LoginStepDef {
	WebDriver driver;

	@Given("^User is Already on login Page$")
	public void user_is_Already_on_login_Page(){
	   System.setProperty("webdriver.chrome.driver", "C:/Users/KIRAN GOWDA/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://freecrm.com/");
	   System.out.println("navigated to Free Crm");
	}

}
