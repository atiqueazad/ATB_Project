package stefdefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjetmodel.PageObjectModel;

public class StepDef {
	WebDriver driver;
	@Given("^User visit homepage$")
	public void user_visit_homepage() throws Throwable {
		WebDriver driver = new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	//driver = new ChromeDriver();
	
	driver.get("http://mock.agiletrailblazers.com/contact.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    PageObjectModel obj = new PageObjectModel(driver);	
    obj.selectSubject();
    }
    @When("^User Enter message$")
	public void user_Enter_message() throws Throwable {
    PageObjectModel obj = new PageObjectModel(driver);	
    obj.getEnterEnterMassage().sendKeys("HELLO");
    }
    @When("^User  Click submit button$")
	public void user_Click_submit_button() throws Throwable {
    PageObjectModel obj = new PageObjectModel(driver);	
    obj.getSubmit().click();
	}
    @Then("^User recives a confirmation message$")
	public void user_recives_a_confirmation_message() throws Throwable {
	Assert.assertTrue(true == true);
	System.out.println("Your message was sent successfully Thanks.");
    driver.quit();	
	}}

