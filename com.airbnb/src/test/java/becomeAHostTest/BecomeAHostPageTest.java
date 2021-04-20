package becomeAHostTest;

import becomeAHostPage.BecomeAHostPage;
import common.BaseAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class BecomeAHostPageTest extends BaseAPI {

    BecomeAHostPage home2;

    @Test(enabled = false)
    public void testBecomeAHostButton() throws InterruptedException {

        home2=new BecomeAHostPage();
        home2.becomeAHostButton();
        //home2.getBecomeAHostText();

        String actualResult = home2.getBecomeAHostText();
        String expectedResult= "A space to share, a world to gain";
        Assert.assertEquals(actualResult,expectedResult,"text not match");
    }
    @Test(enabled = false)
    public void testStartToBecomeAHost() throws InterruptedException {
        home2=new BecomeAHostPage();
        home2.becomeAHostButton();
        home2.getStart();
        home2.enterPhoneNumber();
        //home2.continueButton();
        home2.getConfirmText();
        String actualResult =home2.getConfirmText();
        String expectedResult="Sign up";
        Assert.assertEquals(actualResult,expectedResult,"text not match");



    }
    @Test(enabled = false)
    public void testPageDown()throws Exception{
        home2=new BecomeAHostPage();
        home2.becomeAHostButton();
        home2.pageDown();
        home2.getText();
        String actualResult =home2.getText();
        String expectedResult="Host with confidence";
        Assert.assertEquals(actualResult,expectedResult,"text not match");

    }
    @Test (enabled = false)
    public void testOpenAndSwitchToNewTab() throws InterruptedException {
        home2 = new BecomeAHostPage();
        home2.becomeAHostButton();
        home2.openNewTabAndSwitchToIt();

        Assert.assertTrue(isElementDisplayed(home2.howAirBnB));
    }

    @Test()
  public void testSignUpToBecomeAHost()throws Exception{
        home2=new BecomeAHostPage();
        home2.becomeAHostButton();
        home2.pageDown();
        home2.signUpToBecomeAHost();

        String actualResult=home2.confirmText.getText();
        String expectedResult="Thanks! We’ll be in touch soon about hosting.";

        Assert.assertEquals(actualResult,expectedResult,"text not match");
    }




}
