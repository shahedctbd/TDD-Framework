package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCustomerPage extends BasePage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	//Element Library
	
	@FindBy(how = How.XPATH, using ="//*[@id='account']") WebElement FULLNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id='cid']" ) WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'email\']" ) WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'phone\']" ) WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'address\']" ) WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'city\']" ) WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'state\']" ) WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\'zip\']" ) WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id=\"country\"]" ) WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id='submit']" ) WebElement SUBMIT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id='application_ajaxrender']/a" ) WebElement AUTO_LOGIN_BUTTON_LOCATOR;
	@FindBy (how =How.XPATH, using="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_FIELD_LOCATOR;
	
	//Interactive Method
	
	public void insertFullName(String fullName) {
		int genNum = randomGenerator(999);
		FULLNAME_FIELD_LOCATOR.sendKeys(fullName + genNum);	
	}
	public void insertCompanyName(String companyName) {
		selectDropDown(COMPANY_FIELD_LOCATOR, companyName);	
	}
	
	public void insertEmailAddress(String email) {
		int genNum = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(genNum + email);	
	}
	
	public void insertPhoneNumber(String phone) {
		int genNum = randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(genNum + phone);	
	}
	
	public void insertAddress(String address) {
		int genNum = randomGenerator(999);
		ADDRESS_FIELD_LOCATOR.sendKeys(genNum + address);	
	}
	
	public void insertCity(String city) {
		int genNum = randomGenerator(999);
		CITY_FIELD_LOCATOR.sendKeys(genNum + city);	
	}
	
	public void insertstate(String state) {
		int genNum = randomGenerator(999);
		STATE_FIELD_LOCATOR.sendKeys(genNum + state);	
	}
	
	public void insertZip(String zip) {
		int genNum = randomGenerator(999);
		ZIP_FIELD_LOCATOR.sendKeys(genNum + zip);	
	}
	
	
	public void enterCountryName(String countryName) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, countryName);	
	
	}
	
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
		
	}
	
	public void clickOnListCustomerButton() {
		waitForElement(driver, 10, AUTO_LOGIN_BUTTON_LOCATOR );
		LIST_CUSTOMER_FIELD_LOCATOR.click();
		}
}
