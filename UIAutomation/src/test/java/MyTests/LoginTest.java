package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myPages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void doLogin() {
		page.getInstance(LoginPage.class).doLogin("Admin", "admin123");
		String title = page.getInstance(LoginPage.class).getPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

}
