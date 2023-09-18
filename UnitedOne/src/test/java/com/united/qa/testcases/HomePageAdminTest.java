package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.AssignmentsPageAdmin;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.util.TestUtil;

public class HomePageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public HomePageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
	}
	
	@Test
	public void test()throws Exception {
		//testUtil.testWaitEight();
		assignmentsPageAdmin=homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
