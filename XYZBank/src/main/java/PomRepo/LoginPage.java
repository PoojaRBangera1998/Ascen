package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Customer Login']")
	private WebElement CustomerLogin;
	public WebElement getCustomerLogin() {
		return CustomerLogin;
	}
	
	@FindBy(xpath = "//select[@id='userSelect']")
	private WebElement YourNameDropdown;
	public WebElement getYourNameDropdown() {
		return YourNameDropdown;
	}
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement LoginButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Deposit')]")
	private WebElement DepositButton;
	public WebElement getDepositButton() {
		return DepositButton;
	}
	
	
	
	
	
}
