package testWireless;

import common.BaseAPI;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;
import wirelessPage.WirelessPage;

import static wirelessPage.WirelessPageLocators.*;

public class TestWirelessPage extends BaseAPI {
    WirelessPage home4;

    @Test(enabled = false)
    public void testWirelessPage(){
        home4=new WirelessPage();
        home4.wirelessButton();
        home4.getText();
        String actualResult=home4.getText();
        String expectedResult="New and existing customers get the best deals";
        Assert.assertEquals(actualResult,expectedResult,"text not match");
    }
    @Test(enabled = false)
    public void testSelectUltraS21()throws Exception {
        home4=new WirelessPage();
        home4.wirelessButton();
        home4.pageDown1();
        home4.selectIphoneXS();
//        home4.getText1();
//        String actualResult=home4.getText1();
//        String expectedResult="Galaxy S21 5G";
//        Assert.assertEquals(actualResult,expectedResult,"text not match");
     Assert.assertTrue(isElementDisplayed(home4.iphoneXS));

    }
    @Test()

    public void testSelectBlackColor()throws Exception{
        home4=new WirelessPage();
        home4.wirelessButton();
        home4.pageDown1();
        home4.samsungButton();
        home4.selectBlackColor();
//        Assert.assertTrue(isElementSelected(home4.black),"color not match");

    }
}
