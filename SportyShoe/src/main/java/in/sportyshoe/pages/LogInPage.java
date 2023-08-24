package in.sportyshoe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	@FindBy(id = "email")
	private WebElement emailTextBox;
	@FindBy(id = "password")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	private WebElement login;
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
		
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
		
	}
	public void clickLoginBtn() {
		login.click();
	}
}
