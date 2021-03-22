package com.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHome {
	
	WebDriver driver;
	public MyHome(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//a[contains(text(),' Daily Deals')]")
	WebElement clickdeal;
	public WebElement getClickDeal(){
		return clickdeal;
		
		
	}
	@FindBy(xpath="//span[contains(text(),'Automotive')]")
	WebElement clickmore;
	public WebElement getClickMore(){
		return clickmore;
		
	}
	
	
	
	

}
