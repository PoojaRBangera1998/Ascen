package Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PomRepo.LoginPage;
import genericLibrary.Base_Class;

public class Tc_001Test extends Base_Class{
	@Test
	public void Bank() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getCustomerLogin().click();
		
		WebElement YourNamedropdown = loginPage.getYourNameDropdown();
		Select select=new Select(YourNamedropdown);
		select.selectByValue("2");
		loginPage.getLoginButton().click();
		loginPage.getDepositButton().click();
		
	}
}
