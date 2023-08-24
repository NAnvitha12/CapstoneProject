package in.sportyshoe.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddProduct {
	private WebDriver driver;
    private JavascriptExecutor jsExecutor;
   
    @FindBy(linkText = "Add to Cart")
    public WebElement addFirstProductOnCart;
  

    @FindBy(linkText ="Home")
    private WebElement clickonHomePageIcon;
   
    public AddProduct(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.jsExecutor = (JavascriptExecutor) driver; 

    }

    public void BuyItem() {
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();",  addFirstProductOnCart);
    	// addFirstProductOnCart.click(); 
    }
  
    public void clickOnHomeIcon() {
    	clickonHomePageIcon.click();
    	
    }
   
}
