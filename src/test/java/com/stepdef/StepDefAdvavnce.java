package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pom.page.MyAdvancePage;

import cucumber.api.java.en.When;

public class StepDefAdvavnce extends Base {
	
	MyAdvancePage ad;
	
	
	
	@When("^I click on the advance search$")
	public void i_click_on_the_advance_search() throws Throwable {
		driver = getdriver();
		ad=PageFactory.initElements(driver, MyAdvancePage.class);
		ad.getAd().click();
	    
	   
	}

	@When("^I enter text on search box$")
	public void i_enter_text_on_search_box() throws Throwable {
		ad.getSen().sendKeys("Hello Kitty");
	    
	   
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
		
		ad.getSearch().click();
		
		driver.quit();
	    
	   
	}
	

}
