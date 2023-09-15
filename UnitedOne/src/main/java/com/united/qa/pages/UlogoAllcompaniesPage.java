package com.united.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.united.qa.base.TestBase;

public class UlogoAllcompaniesPage extends TestBase{
	
	//Pagefactory OR Object Repository
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[1]/a")
		WebElement addNewCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select")
		WebElement verifiedCompanyDropDown;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[1]")
		WebElement allCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[2]")
		WebElement verifiedCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[3]")
		WebElement notVerifiedCompany;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[3]/div/label")
		WebElement searchDeletedCompany;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[4]/div/div[1]/label")
		WebElement exactMatch;
		
		@FindBy(id="filter-input")
		WebElement companyNameFilter;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div/button")
		WebElement resetCompany;
		
		//Initialization
		public UlogoAllcompaniesPage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void clickVerifiedCompanyDropDown() {
			verifiedCompanyDropDown.click();
		}
		
		public void selectVerifiedCompany() {
			verifiedCompany.click();
		}
		
		public void selectNotVerifiedCompany() {
			notVerifiedCompany.click();
		}
		
		public void selectAllCompany() {
			allCompany.click();
		}
		
		public void clickSearchDeletedCompany() {
			searchDeletedCompany.click();
		}
		
		public void clickExactMatch() {
			exactMatch.click();
		}
		
		public void enterValueCompanyFilter(String value) {
			companyNameFilter.sendKeys(value);
		}
		
		public void clickResetCompanyFilter() {
			resetCompany.click();
		}

}
