package StepDefs;

import com.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.BlazeWelcomePage;

public class BlazeWelcomeSteps extends TestBase {



    @Given("I am on Blaze Flight booking")
    public void i_Am_On_Blaze_Flight_Booking() {
        TestBase.initialization();
    }

    @Then("I am on Blaze Flight Welcome Page")
    public void i_Am_On_Blaze_Flight_Welcome_Booking() {
        BlazeWelcomePage welcomePage = PageFactory.initElements(driver, BlazeWelcomePage.class);
        String title = welcomePage.getWelcomeTitle();
        Assert.assertTrue(title.contains("Welcome to the Simple Travel Agency!"));
    }

    @When("^I choose departure (.*)$")
    public void i_choose_departure(String depCity) {
        BlazeWelcomePage welcomePage = PageFactory.initElements(driver, BlazeWelcomePage.class);
        welcomePage.selectDepatureCity(depCity);
    }

    @When("^I choose destination (.*)$")
    public void i_choose_destination(String desCity) {
        BlazeWelcomePage welcomePage = PageFactory.initElements(driver, BlazeWelcomePage.class);
        welcomePage.selectDestinationCity(desCity);
    }

    @When("I click find flight button")
    public void i_click_find_flight_button() {
        BlazeWelcomePage welcomePage = PageFactory.initElements(driver, BlazeWelcomePage.class);
        welcomePage.clickFindFlight();
    }

    @Then("I verify choose the flight page is displayed")
    public void i_verify_choose_the_flight_page_is_displayed() {
        BlazeWelcomePage welcomePage = PageFactory.initElements(driver, BlazeWelcomePage.class);
        Assert.assertTrue(welcomePage.getFindFightTitle().contains("Flights from"));
    }
}
