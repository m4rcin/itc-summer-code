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
    private List<button> emailSection;   //buttons new and mailbox

    @FindBy(css = "div.span9 .rf-dt-r")
    private List<message> messages;

    @FindBy(css = "div.span12 div.span9 .pull-right")
    private WebElement remove;

    @FindBy(css = "[id$=':msgSubject']")
    private WebElement subject;

    @FindBy(css ="[id$=':msgContent']")
    private WebElement content;

    @FindBy(css ="[id$=':cancel']")
    private WebElement cancel;

    @FindBy(css ="[id$=':save']")
    private WebElement sendMessage;

    @FindBy(css ="[id$=':message1']")
    private List<errorMessage> errorMessages;

    @FindBy(css = "div.rf-ntf-cnt")
    private WebElement popUp;

    @FindBy(css = "div.rf-pp-cntr")
    private WebElement popUpAfterCancel;

    @FindBy(css= ".rf-fu-btn-cnt-add")
    private WebElement Add;

    @FindBy(css = ".uploaded")
    private List<uploaded> thumbnails;

    @FindBy(css = "body.create-message div.rf-pp-cnt input.btn.pull-left")
    private WebElement popUpCancel;

    @FindBy(css = "body.create-message form input.btn-info.pull-right.marginLeft10")
    private WebElement popUpYes;

    @FindBy(css = "body.create-message form input.btn-warning.pull-right")
    private WebElement popUpNo;

    @FindBy(css = "body.create-message form select:nth-of-type(1) option:nth-of-type(2)")
    private WebElement recipient1;

    @FindBy(css = "body.create-message form select:nth-of-type(1) option:nth-of-type(3)")
    private WebElement recipient2;

    @FindBy(css = "body.create-message form select:nth-of-type(1) option:nth-of-type(4)")
    private WebElement recipient3;



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
    public class message{

        @FindBy(css = ".btn-info")
        private WebElement read;

        @FindBy(css = "input.selectMsg")
        private WebElement chceckbox;

        public void readClick()
        {
            guardHttp(read).click();
        }
        public void checkboxClick()
        {
            guardHttp(chceckbox).click();
        }
    }
    public class errorMessage{
        @FindBy(tagName = "id")
        private WebElement message;

        public void getMessageText()
        {
            message.getText();
        }
    }
    class uploaded{
        @FindBy(tagName = "img")
        private WebElement image;

        public String getImgUrl()
        {
            return image.getAttribute("src");
        }

        public void imageClick()
        {
            guardHttp(image).click();
        }
    }
    public void subjectSendKeys(String string)
    {
        subject.clear();
        subject.clear();
        subject.sendKeys(string);
    }
    public void contentSendKeys(String string)
    {
        content.clear();
        content.clear();
        content.sendKeys(string);
    }
    public void newClick()
    {
        guardHttp(emailSection.get(0)).click();
    }
    public void mailboxClick()
    {
        guardHttp(emailSection.get(1)).click();
    }
    public void cancelClick()
    {
        guardHttp(cancel).click();
    }
    public void popUpCancelClick()
    {
        guardHttp(popUpCancel).click();
    }
    public void popUpYesClick()
    {
        guardHttp(popUpYes).click();
    }
    public void popUpNoClick()
    {
        guardHttp(popUpNo).click();
    }
    public void sendMessageClick()
    {
        guardHttp(sendMessage).click();
    }
    public void recipient1Click()
    {
        guardHttp(recipient1).click();
    }
    public void recipient2Click()
    {
        guardHttp(recipient2).click();
    }
    public void recipient3Click()
    {
        guardHttp(recipient3).click();
    }
    public String getPopUpText()
    {
        return popUp.getText();
    }
    public String getPopUpAfterCancelText()
    {
        return popUpAfterCancel.getText();
    }

}
