package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.Loginpage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	
	WebDriver driver;
	ExcelReader exlread = new ExcelReader("src\\main\\java\\data\\TF-Testdata.xlsx");
	String username = exlread.getCellData("LoginInfo", "UserName", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);
	String fullName = exlread.getCellData("Addcontactinfo", "FullName", 2);
	String companyName = exlread.getCellData("Addcontactinfo", "CompanyName", 2);
	String email = exlread.getCellData("Addcontactinfo", "Email", 2);
	String phone = exlread.getCellData("Addcontactinfo", "Phone", 2);
	String address = exlread.getCellData("Addcontactinfo", "Address", 2);
	String city = exlread.getCellData("Addcontactinfo", "City", 2);
	String country = exlread.getCellData("Addcontactinfo", "Country", 2);
	String state = exlread.getCellData("Addcontactinfo", "State", 2);
	String zip = exlread.getCellData("Addcontactinfo", "Zip", 2);
	
	
	
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		Loginpage loginPage =PageFactory.initElements(driver, Loginpage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardHeader();
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertCompanyName(companyName);
		addCustomerPage.insertEmailAddress(email);
		addCustomerPage.insertPhoneNumber(phone);
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCity(city);
		addCustomerPage.insertstate(state);
		addCustomerPage.insertZip(zip);
		addCustomerPage.enterCountryName(country);
		addCustomerPage.clickOnSubmitButton();
		addCustomerPage.clickOnListCustomerButton();
		
		
	}

}
