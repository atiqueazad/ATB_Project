package pageobjetmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	WebDriver driver;
	
	public PageObjectModel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='name']")
	@CacheLookup
	public WebElement EnterName;
	public WebElement getEnterName() {
	return EnterName;
	}
	

	@FindBy(how = How.XPATH, using = ".//*[@id='email']")
	@CacheLookup
	public WebElement EnterEmail;
	public WebElement getEnterEmail() {
	return EnterEmail;
	}
	
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mobile']")
	@CacheLookup
	public WebElement EnterPhoneNumber;
    public WebElement getEnterPhoneNumber() {
	return EnterPhoneNumber;
	}}


