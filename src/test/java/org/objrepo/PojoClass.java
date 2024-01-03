package org.objrepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.userlab.UtilityBaseClass;

public class PojoClass extends UtilityBaseClass {

	public PojoClass() {
		PageFactory.initElements(driver,this);
	}

	public WebElement getPopExit() {
		return popExit;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSumbitBtn() {
		return sumbitBtn;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginField() {
		return loginField;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getIphoneVerify() {
		return iphoneVerify;
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement popExit;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement sumbitBtn;

	@FindBy(xpath = "//div[text()='APPLE iPhone 13 (Green, 128 GB)']")
	private WebElement iphone;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "(//input[@type='text' and @autocomplete])[2]")
	private WebElement emailField;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']//span[text()='Login']")
	private WebElement loginField;

	@FindBy(xpath = "//a[text()='APPLE iPhone 13 (Green, 128 GB)']")
	private WebElement iphoneVerify;

	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrder;

}
