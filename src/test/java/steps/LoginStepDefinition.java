package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DashboardPage dashBoardPage;
	NewAccountPage newAccountPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashBoardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("User is on the techfios login page")
	public void User_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin");

	}

	@When("User enters userName as {string}")
	public void User_enters_userName_as(String userName) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.InsertUserName(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.InsertPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickOnSignInButton();
		takeScreenshot(driver);
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard";
		String actualTitle = // dashBoardPage.getPageTitle();
				driver.findElement(By.className("col-lg-12")).getText();

		System.out.println(" actualTitle =" + actualTitle);
		Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));

	}

	@And("User clicks on BankCash")

	public void user_clicks_On_BankCash() {
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		newAccountPage.clickBankCash();

	}

	@And("User clicks on NewAccount")
	public void user_clicks_On_NewAccount() throws InterruptedException {
		// Thread.sleep(2000);
		//newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);

		newAccountPage.ClickOnNewAccount();
	}

	@Then("User should land on AddNewAccountpage")
	public void user_should_land_on_AddNewAccountPage() {
		//dashBoardPage = PageFactory.initElements(driver, DashboardPage.class);

		String expectedTitle1 = "Add New Account";
		String actualTitle1 = newAccountPage.getPageTitle();
		
		System.out.println("actualTitle1 : "+ actualTitle1);
		Assert.assertTrue(expectedTitle1.equalsIgnoreCase(actualTitle1));

	}

	@And("User enters accountTitle as {string}")
	public void user_enters_accountTitle_as(String accountTitle) {
newAccountPage.insertAccount_Title_Element(accountTitle);
	}

	@And("User enters description as {string}")
	public void user_enters_description_as(String description) {
		newAccountPage.insertDescription_Element(description);
	}

	@And("User enters initialBalace as {string}")
	public void user_enters_initialBalace_as(String initialBalace) {
		newAccountPage.insertinitialBalace(initialBalace);
	}

	@And("User enters AccountNumber as {string}")
	public void user_enters_AccountNumber_as(String AccountNumber) {
		newAccountPage.insertAccountNumber(AccountNumber);
	}

	@And("User enters ContactPerson as {string}")
	public void user_enters_ContactPerson_as(String ContactPerson) {
		newAccountPage.insertContactPerson(ContactPerson);
	}

	@And("User enters phoneNumber as {string}")
	public void user_enters_phoneNumber_as(String phoneNumber) {
		newAccountPage.insertPhone_Element(phoneNumber);
	}

	@And("User enters internetbanking Url as {string}")
	public void user_enters_internetbanking_Url_as(String internetbanking) {
		newAccountPage.insertInternet_Banking_Url_Element(internetbanking);
	}
	@And("User Submit NewAccount Form")
	public void User_Submit_NewAccount_Form() {
		newAccountPage.clickSubmit_Button_Element();
	}

	@Then("User should land on manage account page")
	public void user_should_land_on_manage_account_page() {

		String expectedTitle = "Manage Account";
		String actualTitle = newAccountPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@After
	public void tearDown() {
		// driver.close();
		// driver.quit();
	}

}
