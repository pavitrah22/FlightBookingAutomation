
package pages;

import com.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReservePage extends TestBase  {

    @FindBy(how = How.XPATH, using = "//tr/td/input")
    List<WebElement> chooseFlightButton;

    @FindBy(how = How.XPATH, using = "//tr/td[2]")
    List<WebElement> flightNumberlist;

    @FindBy(how = How.XPATH, using = "//*[@class='container']/h2")
    WebElement reservedTitle;

    @FindBy(how = How.ID, using = "inputName")
    WebElement Name;

    @FindBy(how = How.ID, using = "address")
    WebElement Address;

    @FindBy(how = How.ID, using = "creditCardNumber")
    WebElement CCNumber;

    @FindBy(how = How.XPATH, using = "//*[@type='submit']")
    WebElement purchaseFlightBtn;

    @FindBy(how = How.XPATH, using = "//*[@class='container hero-unit']/h1")
    WebElement POTitle;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Id')]/../td[2]")
    WebElement POiD;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Amount')]/../td[2]")
    WebElement POamount;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Date')]/../td[2]")
    WebElement PODate;

    @FindBy(how = How.XPATH, using = "//*[@class='container']/p[3]")
    WebElement Price;

    @FindBy(how = How.XPATH, using = "//*[@class='container']/p[4]")
    WebElement AribtraryPrice;

    @FindBy(how = How.XPATH, using = "//*[@class='container']/p[5]/em")
    WebElement TotalCost;



 public ReservePage(){
        PageFactory.initElements(driver, this);
    }

    public void chooseFlight(String flightNumber){
     int index = flightNumberlist.stream().map(WebElement::getText).collect(Collectors.toList()).indexOf(flightNumber);
     chooseFlightButton.get(index).click();
    }

    public String getPurchaseTitle(){
     return reservedTitle.getText();
    }

    public void enterName(String name){
        Name.sendKeys(name);
    }

    public void enterAddress(String address){
        Address.sendKeys(address);
    }

    public void enterCardNumber(String cardNumber){
        CCNumber.sendKeys(cardNumber);
    }

    public void clickPurchaseFlightbtn() {
        purchaseFlightBtn.click();
    }

    public String getPurchaseOrderTitle() {
     return POTitle.getText();
    }

    public boolean isDisplayedPOiD() {
     return POiD.isDisplayed();
    }

    public boolean isDisplayedAmount() {
     return POamount.isDisplayed();
    }

    public double calculateTotalCost() {
     try {
         String price = Price.getText().substring(7,10);
         String arbPrice = AribtraryPrice.getText().substring(26,32);
         double priceValue = Integer.parseInt(price);
         double arbPriceValue = Integer.parseInt(arbPrice);
         double totalCalValue = priceValue + arbPriceValue;
         return totalCalValue;
     }catch (Exception ex){
         return 0;
     }

    }

    public double getTotalCost(){
     double totalCostValue;
     String totalCost = TotalCost.getText();
     return  totalCostValue = Integer.parseInt(totalCost);
    }
}

