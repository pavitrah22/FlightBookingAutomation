package StepDefs;

import com.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ReservePage;

public class ChooseFlightsSteps extends TestBase {

    ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);

    @When("^I choose flight (.*)$")
    public void i_choose_flight(String flightnumber) {
     //   ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);
        reservePage.chooseFlight(flightnumber);
    }
    @Then("I am on purchase Page")
    public void i_am_on_purchase_page() {
     //   ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);
        Assert.assertTrue(reservePage.getPurchaseTitle().contains("has been reserved"));
    }

    @When("^I enter address (.*)$")
    public void i_enter_address(String address){
     //   ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);
        reservePage.enterAddress(address);
    }

    @When("^I enter card (.*)$")
    public void i_enter_card(String cardNumber){
     //   ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);
        reservePage.enterCardNumber(cardNumber);
    }

    @Then("I validate Total Cost is displayed correctly")
    public void i_validate_total_cost(){
        Assert.assertEquals(reservePage.calculateTotalCost(), reservePage.getTotalCost());
    }

    @When("^I enter passenger (.*)$")
    public void i_enter_passenger_name(String name){
     //   ReservePage reservePage = PageFactory.initElements(driver, ReservePage.class);
        reservePage.enterName(name);
    }
    @When("I click Purchase Flight")
        public void i_click_purchase_flight(){
        reservePage.clickPurchaseFlightbtn();
    }

    @Then("I validate that I am navigated to confirmation page")
        public void i_Validate_Confirmation_Page_Url(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://blazedemo.com/confirmation.php");
    }
    @Given("I am on Purchase Order page")
    public void i_am_on_Purchase_order_page(){
        Assert.assertTrue(reservePage.getPurchaseOrderTitle().contains("Thank you for your purchase today!"));
    }

    @Then("I validate the PO ID")
    public void i_validate_the_PO_ID(){
        Assert.assertTrue(reservePage.isDisplayedPOiD());
    }
    @Then("I validate amount")
    public void i_validate_amount(){
        Assert.assertTrue(reservePage.isDisplayedAmount());
        }
    }

