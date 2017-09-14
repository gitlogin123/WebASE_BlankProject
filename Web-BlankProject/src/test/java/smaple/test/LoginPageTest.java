package smaple.test;

import java.util.Map;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;

import com.framework.annotation.AFDataProviders;
import com.framework.annotation.AFRetryCounter;
import com.framework.pagefactory.FileBasedElementLocatorFactory;
import com.framework.pages.LoginPage;
import com.framework.reports.Logs;
import com.framework.testng.FactoryRetryAnalyzer;
import com.framework.utility.WebDriverTest;

public class LoginPageTest extends WebDriverTest {
	private LoginPage loginObj;

	

	@AFDataProviders(dataFile = "test/resources/TestData/logintestdata.csv")
	@Test(enabled = false, groups = "Smoke")
	public void loginApplicationTestWithCsv(Map<String, String> data) {

		loginObj = new LoginPage();
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(
				bDriver.driver);
		PageFactory.initElements(factory, loginObj);
		 loginObj.enterUserNameWithPassword();
		// loginObj.doLogin(data.get("user_name"), data.get("password"));
		 

	}

	@AFDataProviders(dataFile = "test/resources/TestData/Logindata.xlsx", sheetName = "LoginData1")
	@Test(testName="datawithexcel",enabled = true, groups = "Login")
	public void loginApplicationTestwithExcel(String sUserName, String sPassword)
			throws InterruptedException {
		DOMConfigurator.configure("test/logs/Log4j.xml");
		Logs.startTestCase("Login with Excel");
		loginObj = new LoginPage();
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(
				bDriver.driver);
		PageFactory.initElements(factory, loginObj);

		loginObj.verifyTitle();
		System.out.println("Test login..");
		loginObj.doLogin(sUserName, sPassword);
		Logs.endTestCase("End Test Case");

	}

}
