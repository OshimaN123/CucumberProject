package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement Dashboard_Header_Element;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement Bank_And_Cash_Element;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement New_Account_Element;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/h5")
	WebElement Title_Element;

	public void validateDashBoardPage() {
		Assert.assertTrue(Dashboard_Header_Element.isDisplayed(), "Dashboard Page not Found!!");
	}

	public void clickBank_And_Cash_Element() {
		Bank_And_Cash_Element.click();
	}

	public void clickNew_Account_Element() {
		New_Account_Element.click();
	}

	public String getPageTitle() {
		return Title_Element.getText();
	}

}
