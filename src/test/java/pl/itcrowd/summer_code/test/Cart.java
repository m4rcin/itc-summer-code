package pl.itcrowd.summer_code.test;

import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 11.07.13
 * Time: 09:46
 * To change this template use File | Settings | File Templates.
 */
public class Cart {

    @FindBy(css = "[$id = ':cartTable:0' input btn btn-danger")
    private WebElement removeItemFromCartButton;

    @FindBy(id = "[:cartTable:0]")
    private WebElement rowIndex;

    @FindBy(css = "div input:nth-of-type(3)")
    private WebElement clearCartButton;

    @FindBy(css = "div input:nth-of-type(1)")
    private WebElement backButton;

    @FindBy(css = "div input:nth-of-type(2)")
    private WebElement checkoutButton;

    @FindBy(css = "[$id = ':cartTable:0'] a")
    private WebElement productNameLink;

    @FindBy(css = "[$id = ':cartTable:f'] td span")
    private WebElement totalCost;

    public String getTotalCost() {
        return totalCost.getText();
    }

    public String getRowIndex(){
        return rowIndex.getText();
    }

    public void removeItemFromCartButtonClick(){
        guardHttp(removeItemFromCartButton).click();
    }

    public void clearCartButtonClick(){
        guardHttp(clearCartButton).click();
    }

    public void backButtonClick(){
        guardHttp(backButton).click();
    }

    public void checkoutButtonClick(){
        guardHttp(checkoutButton).click();
    }

    public void productNameLinkClick(){
        guardHttp(productNameLink).click();
    }
}
