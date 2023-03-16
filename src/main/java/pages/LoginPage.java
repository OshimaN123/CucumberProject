package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase {
	// elements
	// By,WebElement (Page Object Model doesn't work with this two concepts
	// Intractable methods
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement UserName_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PassWord_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SignIn_Element;
	

//intractable methods
	public void InsertUserName(String userName) {
		UserName_Element.sendKeys(userName);

	}

	public void InsertPassword(String password) {
		PassWord_Element.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn_Element.click();
	}

	



	
	

}
