package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class GoogleSearch {
	
	private WebDriver driver;
	
	public GoogleSearch() {
		
		this.driver = Hook.getDriver();
		
	}
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		
	   Thread.sleep(1000);
	   System.out.println("Current URL : "+driver.getCurrentUrl());
		
	}

	@When("^I navigate to google page$")
	public void i_navigate_to_google_page() throws Throwable {
		
		driver.get("https://www.google.com/");
		  System.out.println("navigation to google");
	}

	@Then("^I validate search text field$")
	public void i_validate_search_text_field() throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		  System.out.println("validated search text field");
	}
	
	@Then("^I validate the gmail link$")
	public void i_validate_the_gmail_link() throws Throwable {
		 
	   System.out.println("Validated gmail link");
	}
	
	@When("^I enter \"([^\"]*)\" in search keyword$")
	public void i_enter_in_search_keyword(String searchText) throws Throwable {
		 driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchText);
	}

	@Then("^I validated searched text field$")
	public void i_validate_searched_text_field() throws Throwable {
	    Thread.sleep(5000);
	}



}
