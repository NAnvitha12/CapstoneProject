package in.sportyshoe.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PlaceOrderPage {
	private WebDriver driver;
    private JavascriptExecutor jsExecutor;
	 @FindBy(xpath ="(//a[contains(@class,'nav-link')])[1]")
	    private WebElement cartIcon;
	@FindBy(linkText  ="Place Order")
	private WebElement clickonOrderIcon;
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 this.driver = driver;
	        this.jsExecutor = (JavascriptExecutor) driver; 

		
	}
	public void GoToCartIcon() {
		cartIcon.click();
	}
	
	public void viewOrder() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();",  clickonOrderIcon);

	}
}
