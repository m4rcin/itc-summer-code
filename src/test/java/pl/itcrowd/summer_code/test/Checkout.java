package pl.itcrowd.summer_code.test;

import org.jboss.arquillian.graphene.context.GrapheneContext;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;
import static org.jboss.arquillian.graphene.Graphene.waitGui;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 11.07.13
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public class Checkout {

    @FindBy(css = "#rF div:nth-of-type(14) input:nth-of-type(1)")
    private WebElement submitOrderButton;

    @FindBy(css = ".rf-ntf-sum")
    private WebElement noMoneyInfo;

    @FindBy(css = "#rF.firstName.i")
    private WebElement firstName;

    @FindBy(css = "#rF.lastName.i")
    private WebElement lastName;

    @FindBy(css = "#newAddress")
    private WebElement newAddressChecked;

    @FindBy(css = "#rF.telephone.i")
    private WebElement telephone;

    @FindBy(css = "#rF.addr1.i")
    private WebElement addressLine1;

    @FindBy(css = "#rF.addr2.i")
    private WebElement addressLine2;

    @FindBy(css = "#rF.city.i")
    private WebElement city;

    @FindBy(css = "#rF.zipcode.i")
    private WebElement zipCode;

    @FindBy(css = "#rf.country.i option:nth-of-type(12)")
    private WebElement country;

    @FindBy(css = "#rf.region.i option:nth-of-type(15)")
    private WebElement region;

    @FindBy(tagName = "value")
    private WebElement value;

    @FindBy(css = "#rf div:nth-of-type(14) input:nth-of-type(1)")
    private WebElement cancelCheckoutButton;

    @FindBy(css = "html body div:nth-of-type(4) div")
    private WebElement considerProposalPopUp;

    @FindBy(css = "#wrap div:nth-of-type(2) span div:nth-of-type(2) input")
    private WebElement buyMoreCreditsButton;

    @FindBy(css = "#rF.cartTable.f td span")
    private WebElement totalCost;

    @FindBy(css = "#wrap div:nth-of-type(1) div div div:nth-of-type(1) form ul li:nth-of-type(6) a")
    private WebElement creditsHeld;

    public String getFirstNameText(){
        return firstName.getText();
    }

    public String getLastNameText(){
        return lastName.getText();
    }

    public String getTelephoneText(){
        return telephone.getText();
    }

    public String getAddressLine1Text(){
        return addressLine1.getText();
    }

    public String getAddressLine2Text(){
        return addressLine2.getText();
    }

    public String getCityText(){
        return city.getText();
    }

    public String getZipCode(){
        return zipCode.getText();
    }

    public String getCountryText(){
        return country.getText();
    }

    public String getRegionText(){
        return region.getText();
    }

    public String getMissingQuantityOfCredits(){
        Double creditsNeeded = getTotalCost();
        Double creditsHeld = getCreditsHeld();
        Double creditsMissing = creditsNeeded - creditsHeld;
        return creditsMissing.toString();
    }

    public String getValue(WebElement webElement){
        return webElement.getAttribute("value");
    }

    public String getBuyCreditsUrlPlusAmount(){
        String url = "https://itcrowd.pl/vop/private/buyCredits?predefinedQuantity=";
        String amount = getMissingQuantityOfCredits();
        return url+amount;
    }

    public Double getCreditsHeld(){
        String customerBalanceText = creditsHeld.getText();
        Double customerBalance = Double.parseDouble(customerBalanceText.substring(14));
        return customerBalance;
    }

    public Double getTotalCost(){
        String costText = totalCost.getText();
        Double cost =  Double.parseDouble(costText.substring(7));
        return cost;
    }

    public String getConsiderProposalPopUpText(){
        return considerProposalPopUp.getText();
    }

    public void submitOrderButtonClick(){
        guardHttp(submitOrderButton).click();
    }

    public String getInsufficientCreditsPopUpText(){
        new Actions(GrapheneContext.getProxy()).moveToElement(noMoneyInfo).build().perform();
        waitGui().until().element(noMoneyInfo).is().visible();
        return noMoneyInfo.getText();
    }

    public void buyMoreCreditsButtonTest(){
        guardHttp(buyMoreCreditsButton).click();
    }

    public void cancelCheckoutButtonClick(){
        guardHttp(cancelCheckoutButton).click();
    }
}
