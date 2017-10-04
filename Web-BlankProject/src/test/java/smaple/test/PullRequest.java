package smaple.test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;

import com.framework.pagefactory.FileBasedElementLocatorFactory;
import com.framework.pages.LoginPage;
import com.framework.utility.WebDriverTest;

public class PullRequest extends WebDriverTest{

	@Test(enabled = false, groups = "Smoke")
	public void openUrl(){
		
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(
				bDriver.driver);
		PageFactory.initElements(factory, new LoginPage());
		LoginPage.doLogin("Data1","Data2");
	}
}
