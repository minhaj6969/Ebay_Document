package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pom.page.MyPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base{
	
	MyPage my;
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
	    driver = getdriver();
	    my=PageFactory.initElements(driver, MyPage.class);
	   
	}

	@When("^I enter text on the search box$")
	public void i_enter_text_on_the_search_box() throws Throwable {
		
		my.getSearch().sendKeys("Books");
	    
	   
	}

	@When("^I click on  the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		
		my.getClickB().click();
	    
	   
	}

	@When("^I click on the accept offer options$")
	public void i_click_on_the_accept_offer_options() throws Throwable {
		
		my.getClickAc().click();
	    
	   
	}

	@Then("^I successfully get the page$")
	public void i_successfully_get_the_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "Books | eBay");
		
		driver.quit();
	    
	   
	}

}
