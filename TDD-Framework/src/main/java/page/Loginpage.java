package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage (WebDriver driver) {
		this.driver=driver;
	}
	
	//library
	@FindBy (how =How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USERNAME_FIELD;
	@FindBy (how =How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy (how =How.XPATH, using = "//*[@name='login']")
	WebElement SIGNIN_BUTTON_FIELD;
	
	//interactive action
	public void insertUserName(String username) {
		USERNAME_FIELD.sendKeys(username);
	}
	public void insertPassword (String password) {
		PASSWORD_FIELD.sendKeys(password);
			
	}
	public void clickOnSigninButton() {
		SIGNIN_BUTTON_FIELD.click();
		
	}

}
