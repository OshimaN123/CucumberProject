package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends TestBase {
	//@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	@FindBy(how = How.XPATH, partialLinkText = "Bank & Cash")
	WebElement Bank_Cash_Element;
	
	
	@FindBy(how = How.XPATH, linkText = "New Account")
	WebElement New_Account_Element;
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/h5")
	@FindBy(how = How.XPATH, className = "ibox-title")
	WebElement Account_Header_Element;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement Account_Title_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement IniTial_Balance_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement Account_Number_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement Contact_Person_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement Phone_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement Internet_Banking_Url_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit_Button_Element;
	public void ClickOnBankCash() {
		Bank_Cash_Element.click();
	}

	public void ClickOnNewAccount() {
		New_Account_Element.click();
	}

	public String getPageTitle() {
		return Account_Header_Element.getText();
	}
	

	public void insertAccount_Title_Element(String accountTitle) {

		Account_Title_Element.sendKeys(accountTitle + generateRandomNum(999));
	}

	public void insertDescription_Element(String description) {
		Description_Element.sendKeys(description);

	}

	public void insertinitialBalace(String initialBalace) {
		IniTial_Balance_Element.sendKeys(generateRandomNum(999) + initialBalace);
	}

	public void insertAccountNumber(String accountNumber) {
		Account_Number_Element.sendKeys(generateRandomNum(999) + accountNumber);

	}

	public void insertContactPerson(String ContactPerson) {
		Contact_Person_Element.sendKeys(ContactPerson);
	}

	public void insertPhone_Element(String phoneNumber) {
		Phone_Element.sendKeys(generateRandomNum(999) + phoneNumber);
	}

	public void insertInternet_Banking_Url_Element(String internetbanking) {
		Internet_Banking_Url_Element.sendKeys(internetbanking);

	}

	public void clickSubmit_Button_Element() {
		Submit_Button_Element.click();
	}

	public void clickBankCash() {
		Bank_Cash_Element.click();

	}

}
