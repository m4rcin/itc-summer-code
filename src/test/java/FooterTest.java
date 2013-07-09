import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 05.07.13
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Arquillian.class)
public class FooterTest {
    @FindBy(css = "#footer")
    Footer footer;
    @Drone
    WebDriver browser;
    @Before
    public void beforeTests(){
        browser.navigate().to("https://itcrowd.pl/vop/");
    }
    @Test
    public void testHelpButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.helpButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/view/help.jsf?content=LOGIN_SIGNUP_CUSTOMER&mode=CUSTOMER"));
    }
    @Test
    public void testAboutUsButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.aboutUsButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/page/ABOUT"));
    }
    @Test
    public void testHowItWorksButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.howItWorksButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/view/help.jsf?content=LOGIN_SIGNUP_CUSTOMER&mode=CUSTOMER"));
    }
    @Test
    public void testAboutPsychicReadingsButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.aboutPsychicReadingsButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/page/PSYCHIC_READING"));
    }
    @Test
    public void testContactUsButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.contactUsButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/contact"));
    }
    @Test
    public void testPrivacyPolicyButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.privacyPolicyButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/page/PRIVACY_POLICY"));
    }
    @Test
    public void testTermsConditionsButton(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.termsConditionsButtonClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://itcrowd.pl/vop/page/TERMS"));
    }
    @Test
    public void testConnectWithUsByFB(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.connectWithUsByFBClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://www.facebook.com/PsychicMarketplace"));
    }
    @Test
    public void testConnectWithUsByTwitter(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.connectWithUsByTwitterClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://twitter.com/voiceofpsychic"));
    }
    @Test
    public void testConnectWithUsByPinterest(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.connectWithUsByPinterestClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("http://pinterest.com/voiceofpsychic/"));
    }
    @Test
    public void testConnectWithUsByYT(){
        //Given
        //URL of the main page is given in @Before
        //When
        footer.connectWithUsByYTClick();
        //Then
        assertTrue(browser.getCurrentUrl().startsWith("https://www.youtube.com/voiceofpsychic"));
    }

}
