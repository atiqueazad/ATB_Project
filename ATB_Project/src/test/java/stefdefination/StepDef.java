package stefdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjetmodel.PageObjectModel;

public class StepDef {
	WebDriver driver;
	@Given("^User visit homepage$")
	public void user_visit_homepage() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mock.agiletrailblazers.com/contact.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Atique");

	}

	@When("^User enter name \"([^\"]*)\"$")
	public void user_enter_name(String arg1) throws Throwable {
    PageObjectModel obj = new PageObjectModel(driver);
    obj.getEnterName().sendKeys(arg1);

	}

	@When("^email adress \"([^\"]*)\"$")
	public void email_adress(String arg1) throws Throwable {
	PageObjectModel obj = new PageObjectModel(driver);
    obj.getEnterEmail().sendKeys(arg1);  
	}

	@When("^mobilePhone \"([^\"]*)\"$")
	public void mobilephone(String arg1) throws Throwable {
	PageObjectModel obj = new PageObjectModel(driver);
	obj.getEnterPhoneNumber().sendKeys(arg1);
	}

	@When("^User Select subject$")
	public void user_Select_subject() throws Throwable {

	}

	@When("^User Enter message$")
	public void user_Enter_message() throws Throwable {

	}

	@When("^User  Click submit button$")
	public void user_Click_submit_button() throws Throwable {
	   
	}

	@Then("^User recives a confirmation message$")
	public void user_recives_a_confirmation_message() throws Throwable {
	
	}
}

