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
import pages.DatabasePage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DashboardPage dashBoardPage;
	NewAccountPage newAccountPage;
	DatabasePage databasepage;
	By DashBoard_Field=By.xpath("//h2[contains( text(),'Dashboard')]");

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashBoardPage = PageFactory.initElements(driver, DashboardPage.class);
		  databasepage=new DatabasePage();

	}

	@Given("User is on the techfios login page")
	public void User_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin");

	}
	
	/*@When ("User enters the {string} in the from DataBase")
	public void user_enters_from_database(String data) {
	switch (data) {
	case "username":
		loginPage.InsertUserName(databasepage.getData("username"));
		System.out.println("Username from DB: "+databasepage.getData("username"));
		break;
	case "password":
		loginPage.InsertPassword(databasepage.getData("username"));
		System.out.println("password from DB: "+databasepage.getData("password"));
		break;
		default:
			System.out.println("Unable to extract data :" + data +"from DB" );

	}
	}*/
	/*When("User enters the {string}  from DataBase")
	public void user_enters_the_from_DataBase(String userdata) {
		switch (userdata) {
		case "username":
			loginPage.InsertUserName(databasepage.getData("username"));
			System.out.println("Username from DB: "+databasepage.getData("username"));
			break;
		case "password":
			loginPage.InsertPassword(databasepage.getData("username"));
			System.out.println("password from DB: "+databasepage.getData("password"));
			break;
			default:
				System.out.println("Unable to extract data :" + userdata +"from DB" );

		}
	    
	}*/
	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		/*String actualText=dashBoardPage.getPageTitle();
		String expectedText="Dashboard";
		
		Assert.assertEquals("Page title doesnot match", expectedText, actualText);*/
		boolean pageTitleDisplayStatus;
		try {
			WebElement DashBoard_Header_Element=driver.findElement(By.xpath("//h2[contains( text(),'Dashboard')]"));
		 pageTitleDisplayStatus=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			 pageTitleDisplayStatus=false;
		}
		Assert.assertTrue(pageTitleDisplayStatus);


	}
		
		
		

	
	@When ("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String data,String field ){
	if (field.equalsIgnoreCase("username"))	{
		loginPage.InsertUserName(data);
		System.out.println("Data: "+ data);
		
	} else if(field.equalsIgnoreCase("password")){
		loginPage.InsertPassword(data);
		System.out.println("Data: "+ data);
	}
	else {
		System.out.println("Unable to enter Data:"+data+"in ther "+field);
	}
	}
	
	
	
	
	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		
		switch (button) {
		case "login":
			loginPage.clickOnSignInButton();
			break;
		case "bankCash":
			newAccountPage.clickBankCash();
			break;
		case "newAccount":
			newAccountPage.ClickOnNewAccount();
			break;
		case "submit":
		newAccountPage.clickSubmit_Button_Element();
		break;
		default:
			System.out.println("Unable to click on the button: "+button);
		}
		
	}


	/*@Then("User should land on AddNewAccountpage")
	public void user_should_land_on_AddNewAccountPage() {

		String expectedTitle1 = "Add New Account";
		String actualTitle1 = newAccountPage.getPageTitle();
		
		System.out.println("actualTitle1 : "+ actualTitle1);
		Assert.assertTrue(expectedTitle1.equalsIgnoreCase(actualTitle1));

	}*/
	
	//}
	


	@And("User enters {string} in the {string} field")
	public void user_enters_as(String data, String field) {
		switch (field) {
		case "accountTitle" :
			newAccountPage.insertAccount_Title_Element(data);
			break;
		case "description":
			newAccountPage.insertDescription_Element(data);
			break;
		case "initialBalance":
			newAccountPage.insertinitialBalace(data);
			break;
			
		case "accountNumber":
			newAccountPage.insertAccountNumber(data);
			break;
		case "contactPerson":
			newAccountPage.insertContactPerson(data);
			break;
		case "Phone" :
			newAccountPage.insertPhone_Element(data);
			break;
		case "internetBankingURL":
			newAccountPage.insertInternet_Banking_Url_Element(data);
			break;
		}
	}
	
	
	

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String data, String field) {
		
			switch (field) {
			case "accountTitle" :
				newAccountPage.insertAccount_Title_Element(data);
				break;
			case "description":
				newAccountPage.insertDescription_Element(data);
				break;
			case "initialBalance":
				newAccountPage.insertinitialBalace(data);
				break;
				
			case "accountNumber":
				newAccountPage.insertAccountNumber(data);
				break;
			case "contactPerson":
				newAccountPage.insertContactPerson(data);
				break;
			case "Phone" :
				newAccountPage.insertPhone_Element(data);
				break;
			case "internetBankingURL":
				newAccountPage.insertInternet_Banking_Url_Element(data);
				break;
	   
	}
	}
	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
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
