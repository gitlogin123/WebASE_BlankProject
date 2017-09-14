package com.framework.test.expences;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.annotations.Test;

import com.framework.annotation.AFDataProviders;
import com.framework.pagefactory.FileBasedElementLocatorFactory;
import com.framework.pages.NewExpenseReportPage;
import com.framework.utility.WebDriverTest;

public class CreateExpenceReport extends WebDriverTest{

	@AFDataProviders(dataFile = "test/resources/TestData/Logindata.xlsx", sheetName = "LoginData1")
	@Test(testName="NewExpRepWithBillable",enabled = true, groups = "expenceReport")
	private void newReportUsingBillabletoClient(String userName,String password) {
		ElementLocatorFactory factory = new FileBasedElementLocatorFactory(
				bDriver.driver);
		PageFactory.initElements(factory, new NewExpenseReportPage());
		
		NewExpenseReportPage.loginApplication.loginAndNavToNewExpenceReport(userName, password);
		NewExpenseReportPage.ExpenceReport.withBlankReport();
		NewExpenseReportPage.withValidData.repName("Asia Tour");
		NewExpenseReportPage.withValidData.billableTo();
		NewExpenseReportPage.withValidData.startDate("10-04-17");
		NewExpenseReportPage.withValidData.endDate("19-04-17");
		NewExpenseReportPage.withValidData.description("New Client refactoring..");

		NewExpenseReportPage.ExpenceReport.clickToSave();
	}
	
}
