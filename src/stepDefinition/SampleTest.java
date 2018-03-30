package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTest {

	WebDriver driver;
	
	
	@Given("^open firefox and navigate to facebook website$")
	public void open_firefox_and_navigate_to_facebook_website() throws Throwable {
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
		
	}

	@When("^I enters the email and password$")
	public void I_enters_the_email_and_password() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("Amit@hghjgj.com");
		driver.findElement(By.id("pass")).sendKeys("amitttrvh");
		
	}

	@Then("^User should be able to login Successfully$")
	public void User_should_be_able_to_login_Successfully() throws Throwable {
	    driver.findElement(By.xpath("//*[@type='submit' and @id='u_0_4']")).click();
	}

	
}
