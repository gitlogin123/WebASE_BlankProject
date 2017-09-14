package homepage.test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;

import com.framework.annotation.AFRetryCounter;
import com.framework.pagefactory.FileBasedElementLocatorFactory;
import com.framework.pages.LoginPage;
import com.framework.testng.FactoryRetryAnalyzer;
import com.framework.utility.WebDriverTest;

public class HomeLoginTest extends WebDriverTest{
	private LoginPage loginObj;
	
	//@AFRetryCounter(2)
	//@Test(enabled = false, groups = "Smoke", retryAnalyzer = FactoryRetryAnalyzer.class)
	@Test(enabled = true, groups = "Smoke")
	public void loginAppTest() {

		loginObj = new LoginPage();
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(
				bDriver.driver);
		PageFactory.initElements(factory, loginObj);
		loginObj.verifyTitle();
		System.out.println("Test Home..");
		loginObj.enterUserNameWithPassword();

	}
}
