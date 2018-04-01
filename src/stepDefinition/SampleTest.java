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

	@When("^I enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enters_the_and(String username, String pass) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

	@Then("^User should be able to login Successfully$")
	public void User_should_be_able_to_login_Successfully() throws Throwable {
	   // driver.findElement(By.xpath("//*[@type='submit' and @id='u_0_4']")).click();
		driver.quit();
	}

	
}
