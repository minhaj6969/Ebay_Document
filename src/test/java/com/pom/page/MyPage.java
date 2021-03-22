package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPage {
	
	WebDriver driver;
	
	public MyPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	@FindBy(xpath ="//input[@class='gh-tb ui-autocomplete-input']")
	WebElement search;
	public WebElement getSearch(){
		return search;
		
	}
	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement clickB;
	public WebElement getClickB(){
		return clickB;
		
	}
	@FindBy(xpath = "//h2[contains(text(),'Accepts Offers')]")
	WebElement ClickAc;
	public WebElement getClickAc(){
		return ClickAc;
		
	}

}
