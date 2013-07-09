package pl.itcrowd.summer_code.test;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)
public class PhysicMarketplaceTest3 {

    @Drone
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"wrap\"]/div[2]/div[4]/div[2]")
    private PhysicMarketplace3 marketplace;


    @Test
    public void productsEnterTest(){

        //given
        driver.navigate().to("https://itcrowd.pl/vop/");
        //when
        marketplace.clickProduct(0);
        //then
        assertEquals("https://itcrowd.pl/vop/product/62", driver.getCurrentUrl());
    }

    /**
     * TERMS:
     * This method checks if there is 6 products with images in all 16 products.
     * src must be checked to do this
     *
     * SCENARIO:
     * 1. Go to the main page
     * 2. Check thumbnails id's
     *
     * EXPECTED:
     * Thumbnails are different to each other only by id
     * So, assertions must check that each 'n' every thumbnail has expected id

    @Test
    public void productsShowedImageTest(){
        Assert.fail("Not implemented yet");
    }
     */

}
