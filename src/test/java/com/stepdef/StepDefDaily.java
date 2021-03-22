package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pom.page.MyHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefDaily extends Base {
	
	MyHome hm;
	
	@Given("^I am the home page$")
	public void i_am_the_home_page() throws Throwable {
		driver = getdriver();
		hm=PageFactory.initElements(driver, MyHome.class);
	   
	   
	}

	@When("^I click on the Daily deals button$")
	public void i_click_on_the_Daily_deals_button() throws Throwable {
		
		hm.getClickDeal().click();
	   
	   
	}

	@When("^I click on the item$")
	public void i_click_on_the_item() throws Throwable {
		
		hm.getClickMore().click();
	   
	   
	}

	@Then("^I am successfully get the page$")
	public void i_am_successfully_get_the_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "Automotive Deals on eBay | Best deals and Free shipping");
		driver.quit();
	   
	   
	}

}
