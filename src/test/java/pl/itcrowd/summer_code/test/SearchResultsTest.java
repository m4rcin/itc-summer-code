package pl.itcrowd.summer_code.test;

import junit.framework.Assert;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.spi.annotations.Page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 10.07.13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class SearchResultsTest {
    @Drone
    WebDriver browser;

    @Page
    SearchResults searchResults;

    @Before
    public void beforeTests(){

    }

    /**
     * TERMS:
     * Checks if typed string is not found in system
     * Not only URL must be checked, but displayed text result too
     *
     * SCENARIO:
     * 1. Go to "https://itcrowd.pl/vop/view/searchResult.jsf"
     * 2. Type some random text
     * 3. Press enter key/ searchConfirm button
     * 4. Do some assertions
     *
     * EXPECTATIONS
     * You'll be forwarded to the "https://itcrowd.pl/vop/view/searchResult.jsf?find=typed_string"
     * There will be message displayed in both psychics and market section "No results found"
     */
    @Test
    public void notFoundSearchEffectTest(){
        Assert.fail("Not implemented yet");
    }

    /**
     * TERMS:
     * Checks if typed name of existing psychic forward to right URL
     * and if there is anything displayed
     *
     * SCENARIO:
     * 1. Go to "https://itcrowd.pl/vop/view/searchResult.jsf"
     * 2. Type name of existing psychic, e.g. psychic7
     * 3. Press enter key/ searchConfirm button
     * 4. Do assertions
     *
     * EXPECTATIONS
     * You'll be forwarded to the "https://itcrowd.pl/vop/view/searchResult.jsf?find=psychic7"
     * and there will be box displayed in Psychics section
     * In marketplace section the will be:"No results found"
     */
    @Test
    public void psychicFoundSearchEffectTest(){
        Assert.fail("Not implemented yet");
    }

    /**
     * TERMS:
     * Checks when there was nothing typed, and search was pressed,
     * if there is a list of psychics
     *
     * SCENARIO:
     * 1. Go to "https://itcrowd.pl/vop/view/searchResult.jsf"
     * 2. Leave input empty
     * 3. Press enter key/ searchConfirm button
     * 4. Do assertions
     *
     * EXPECTATIONS
     * You'll be forwarded to the "https://itcrowd.pl/vop/view/searchResult.jsf?find="
     * In Psychics section there will be 6 boxes with psychics
     * In Marketplace section there will be 12 boxes with products
     */
    @Test
    public void emptyInputSearchEffectTest(){
        Assert.fail("Not implemented yet");
    }

    /**
     * TERMS:
     * Checks if product exists in system
     *
     * SCENARIO:
     * 1. Go to "https://itcrowd.pl/vop/view/searchResult.jsf"
     * 2. Type product name, e.g. "123"
     * 3. Press enter key/ searchConfirm button
     * 4. Do assertions
     *
     * EXPECTATIONS:
     * You'll be forwarded to the "https://itcrowd.pl/vop/view/searchResult.jsf?find=123"
     * In Psychics section there will be text: "No results found"
     * In Marketplace section there will be searched product.
     */
    @Test
    public void productSearchTest(){
        Assert.fail("Not implemented yet");
    }
}
