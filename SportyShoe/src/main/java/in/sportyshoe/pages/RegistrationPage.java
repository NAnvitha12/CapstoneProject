package in.sportyshoe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	@FindBy(linkText  = "New User? Register Here")
	private WebElement register;
	@FindBy(id = "name")
	private WebElement nameTextBox;
	@FindBy(id = "email")
	private WebElement emailTextBox;
	@FindBy(id = "password")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	private WebElement registerBtn;
	@FindBy(linkText  = "Logout")
	private WebElement logout;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnRegisterUrl() {
		register.click();
	}
	public void enterName(String name) {
		nameTextBox.sendKeys(name);
		
	}
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
		
	}
	public void enterpassword(String password) {
		passwordTextBox.sendKeys(password);
		
	}
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	public void clickLogoutBtn() {
		logout.click();
	}
	}

