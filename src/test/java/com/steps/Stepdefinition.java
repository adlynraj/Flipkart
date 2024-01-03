package com.steps;

import java.util.Set;

import org.junit.Assert;
import org.objrepo.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userlab.UtilityBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition extends UtilityBaseClass {
	public static PojoClass pj;

	@Given("User should hit the url of the flipkart application'")
	public void user_should_hit_the_url_of_the_flipkart_application() throws InterruptedException {
		launchBrowser();
		launchUrl("https://www.flipkart.com/");
		impWait();
		browserMaximize();
		pj = new PojoClass();
		pj.getPopExit().click();

	}

	@When("User should search the product")
	public void user_should_search_the_product() {
		pj.getSearchBox().sendKeys("iphone");
		pj.getSumbitBtn().click();

	}

	@When("User should select the product")
	public void user_should_select_the_product() throws InterruptedException {
		pj.getIphone().click();
		String parent = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();

		for (String allId : allWindow) {
			if (!parent.equals(allId)) {
				driver.switchTo().window(allId);
			}
		}
		pj.getAddToCart().click();

		pj.getLogin().click();
		Thread.sleep(2000);
		pj.getEmailField().sendKeys("9342181135");
		pj.getPasswordField().sendKeys("Adlynjudy@1234");
		pj.getLoginField().click();
		Thread.sleep(2000);
		pj.getPlaceOrder().click();
	}

}
