package in.sportyshoe.TestScripts;


import org.testng.annotations.Test;

import in.sportyshoe.pages.AddProduct;
import in.sportyshoe.pages.LogInPage;
import in.sportyshoe.pages.PlaceOrderPage;
import in.sportyshoe.pages.RegistrationPage;

public class BuyAShoe extends BaseTest {

	@Test(priority=0)
public void registration() {
	//Register the user
	RegistrationPage registrationpage=new RegistrationPage(driver);
	registrationpage.clickOnRegisterUrl();
	registrationpage.enterName("abc");
	registrationpage.enterEmail("abc@gmail.com");
	registrationpage.enterpassword("abc");
	registrationpage.clickRegisterBtn();
	registrationpage.clickLogoutBtn();
	}
	@Test(priority=1)
	public void login() {
	LogInPage loginPage=new LogInPage(driver);
	loginPage.enterEmail("abc@gmail.com");
	loginPage.enterPassword("abc");
	loginPage.clickLoginBtn();
	}
	@Test(priority=2)
	public void addItem() {
	AddProduct addProduct=new AddProduct(driver);
	addProduct.BuyItem();
	addProduct.clickOnHomeIcon();
	}
	@Test(priority=3)
	public void placeOrder() {
	PlaceOrderPage PlaceOrderPage=new PlaceOrderPage(driver);
	PlaceOrderPage.GoToCartIcon();
	PlaceOrderPage.viewOrder();
}
}
