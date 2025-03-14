package stepDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.*;
import myHooks.Hooks;



public class Events {
	

  @Given("^Login to parsippany baptist church url$")
  public void Login_to_parsippany_baptist_church_url() throws Throwable {
	  //Hooks.driver = InitializeBrowser.getDriver();
	    }

  @When("^I click on events tab$")
  public void I_click_on_events_tab() throws Throwable {
	 Hooks.driver.findElement(By.xpath("(//a[text()='Events'])[1]")).click();
  }

  @And("^I click on the calendar$")
  public void I_click_on_the_calendar() throws Throwable {
	  Hooks.driver.findElement(By.xpath("//a[text()='Calendar']")).click();
  }

  @And("^I click on the list$")
  public void I_click_on_the_list() throws Throwable {
	  Hooks.driver.findElement(By.xpath("//button[text()='list']")).click();
  }

  @And("^I click on AM worship service$")
  public void I_click_on_AM_worship_service() throws Throwable {
	  Hooks.driver.findElement(By.xpath("//a[@href='/events/am-worship-service/2025-03-16']")).click();
  }
  
  @Then("^I validate the outcomes$")
  public void I_validate_the_outcomes() throws Throwable {
	  Hooks.driver.findElement(By.xpath("(//div[@class='d-flex align-items-center mb-2'])[1]")).getText();
  }
  
}
