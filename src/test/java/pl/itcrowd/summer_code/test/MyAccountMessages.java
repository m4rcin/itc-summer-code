package pl.itcrowd.summer_code.test;

import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 10.07.13
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
public class MyAccountMessages {
    @FindBy(css = "div.span12 div.span3 a")
    private List<button> emailSection;

    @FindBy(css = "div.span12 div.span9 .pull-right")
    private WebElement remove;

    @FindBy(css = "div.span9 .btn-info")
    private WebElement read;

    public class button{
        @FindBy(tagName = "a")
        private WebElement button;

        public String getUrl()
        {
            return button.getAttribute("href");
        }

        public void click()
        {
            guardHttp(button).click();
        }
    }
    public void NewClick()
    {
        emailSection.get(0).click();
    }
    public void MailboxClick()
    {
        emailSection.get(1).click();
    }

}
