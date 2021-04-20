package testHome;

import common.BaseAPI;
import homePage.HomePageBMW;
import homePage.HomePageBMWLocators.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseAPI {
    HomePageBMW home5;
    @Test(enabled = false)
    public void testMenu(){
        home5 =new HomePageBMW();
        home5.bmwMenu("Shopping");
        home5.getShopping();
        String actual=home5.getShopping();
        String expected="";
       Assert.assertEquals(actual,expected,"text not match");
    }
    @Test()
    public void testMenu1(){
        home5=new HomePageBMW();
        home5.holdMenu();
        Assert.assertTrue(isElementDisplayed(home5.menu));

    }

}
