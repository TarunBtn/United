package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.AddCommandPage;
import com.united.qa.pages.CheckCommandPage;
import com.united.qa.pages.CompleteAssignment;
import com.united.qa.pages.HomePage;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.MyAssignmentsPage;
import com.united.qa.util.TestUtil;

public class CheckCommandPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	
	public CheckCommandPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitEleven();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEleven();
		testUtil.testWaitEleven();
		addCommandPage=myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEleven();
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitEight();
		addCommandPage.clickUploadFile();
		testUtil.testWaitEight();
							
	}
	
	@Test
	public void checkCommandPageTest()throws Exception {
		completeAssignment=checkCommandPage.clickFillInComplete();
		testUtil.testWaitEight();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
