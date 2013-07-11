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

    @FindBy(css = "#rF div:nth-of-type(14) input:nth-of-type")
    private WebElement submitOrderButton;

    @FindBy(css = ".rf-ntf-sum")
    private WebElement noMoneyInfo;

    @FindBy(css = "#rF:firstName:i")
    private WebElement firstName;

    @FindBy(css = "#rF:lastName:i")
    private WebElement lastName;

    @FindBy(css = "#newAddress")
    private WebElement newAddressChecked;

    @FindBy(css = "#rF:telephone:i")
    private WebElement telephone;

    @FindBy(css = "#rF:addr1:i")
    private WebElement addressLine1;

    @FindBy(css = "#rF:addr2:i")
    private WebElement addressLine2;

    @FindBy(css = "#rF:city:i")
    private WebElement city;

    @FindBy(css = "#rF:zipcode:i")
    private WebElement zipcode;

    @FindBy(css = "#rf:country:i option:nth-of-type(12)")
    private WebElement country;

    @FindBy(css = "#rf:region:i option:nth-of-type(15)")
    private WebElement region;

    @FindBy(tagName = "value")
    private WebElement value;

    @FindBy(css = "#wrap div:nth-of-type(2) span div:nth-of-type(2) input")
    private WebElement buyMoreCreditsButton;


    public String getValue(WebElement webElement){
        return webElement.getAttribute("value");
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
}
