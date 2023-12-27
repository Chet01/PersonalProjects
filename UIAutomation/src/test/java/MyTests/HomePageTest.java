package MyTests;

import org.testng.annotations.Test;

import com.myPages.Homepage;
import com.myPages.LoginPage;

public class HomePageTest extends BaseTest {

	/**
	 * TC : user is able to search the user in admin tab
	 */
	@Test
	public void userSearch() {
		page.getInstance(LoginPage.class).doLogin("Admin", "admin123")
		.navigateToAdminTab()
		.searchUser("Aaliyah.Haq", "ESS", true)
		.verifyUserDisplayed("Aaliyah.Haq", "//div[contains(text(),'Aaliyah.Haq')]");
	}
	
	/**
	 * TC : user is able to search the user in admin tab
	 */
	@Test
	public void storeDropDownQualificationsValues() {
		page.getInstance(LoginPage.class).doLogin("Admin", "admin123")
		.navigateToAdminTab()
		.fetchQualificationValues();
	}
	
}
