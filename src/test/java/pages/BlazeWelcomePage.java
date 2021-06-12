package pages;
import com.util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
import java.util.List;

public class BlazeWelcomePage extends TestBase{

    @FindBy(how = How.NAME, using = "fromPort")
      List<WebElement> departureCity;

    @FindBy(how = How.NAME, using = "toPort")
     List<WebElement> destinationCity;

    @FindBy(how = How.XPATH, using = "//*[@class='jumbotron']/div/h1")
    WebElement welcomeTitle;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    WebElement findFlightButton;

    @FindBy(how = How.XPATH, using = "//*[@class='container']/h3")
    WebElement findFlightsTitle;


    public BlazeWelcomePage()  {
        PageFactory.initElements(driver, this );
    }


    public void selectDepatureCity(String depCity) {
        departureCity.stream().filter(city-> city.getText().equalsIgnoreCase(depCity))
                .findFirst().ifPresent(WebElement::click);
    }

    public void selectDestinationCity(String desCity) {
        destinationCity.stream().filter(city-> city.getText().equalsIgnoreCase(desCity))
                .findFirst().ifPresent(WebElement::click);
    }

    public String getWelcomeTitle(){
        return welcomeTitle.getText();
    }

    public void clickFindFlight() {
        findFlightButton.click();
    }

    public String getFindFightTitle() {
        return findFlightsTitle.getText();
    }
}
