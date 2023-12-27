package MyTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.myPages.BasePage;
import com.myPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
    public Page page;
    
    
    @BeforeMethod
    @Parameters(value={"browser"})
    public void setUp(String browser) throws InterruptedException {
    	if(browser.equals("chrome")) {
    		// System Property for Chrome Driver   
    	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
//    	     WebDriverManager.chromedriver().setup();
    	       // Instantiate a ChromeDriver class.       
    	    driver=new ChromeDriver(); 
    	}
    	else if(browser.equals("ff")) {
    		System.setProperty("", "");
    		WebDriver driver = new FirefoxDriver();
    	}
    	else {
    		System.out.println("No Browser if defined in xml file!");
    	}
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	try {
//    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    		Thread.sleep(2000);
    	}
    	catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    	finally {
    		page = new BasePage(driver);
    	}
    }
    
    @AfterMethod
    public void closeBrowser() {
    	driver.close();
    }

}
