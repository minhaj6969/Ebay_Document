package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAdvancePage {
	
	WebDriver driver;
	public  MyAdvancePage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(text(),'Advanced')]")
	WebElement clickad;
	public WebElement getAd(){
		return clickad;
		
	}
	@FindBy(xpath = "//input[@id='_nkw']")
	WebElement sen;
	public WebElement getSen(){
		return sen;
		
	}
	@FindBy(xpath = "(//button[contains(text(),'Search')])[1]")
	WebElement search;
	public WebElement getSearch(){
		return search;
		
	}

}
