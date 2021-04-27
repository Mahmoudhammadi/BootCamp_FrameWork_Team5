package testHome;

import common.BaseAPI;
import org.testng.Assert;
import savingPage.Savings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import savingPage.SavingsLocators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSavings extends BaseAPI {
    Savings savings = new Savings();
    SavingsLocators locators = new SavingsLocators();
    @BeforeMethod
    public void init(){

        savings = PageFactory.initElements(driver,Savings.class);
        savings.clickOnSavings();
    }

    @Test(enabled = false)
    public void getTopFeaturesTest(){
        List<String> list = new ArrayList<>();
       list =  savings.getTopFeatures();
      boolean actual =list.iterator().next().contains("Mobile Check Deposit");
       boolean expected = true;
        Assert.assertEquals(actual,expected,"does not contain any ");

    }

    @Test(enabled = false)
    public void getMobileAndOnlineResourcesTest(){
savings.getMobileAndOnlineResources();
    }
    @Test(enabled = false)
    public void  searchBoxTest(){
        savings.searchBoxData();
    }
    @Test(enabled = false)
    public void signINPageTest(){
        savings.clickSignIN();
    }
    @Test(enabled = false)
    public void sendCredentialsTest(){
        savings.sendSignInCredentials();
    }
    @Test(enabled = false)
    public void verifyBrokenLinksSavingsTest(){
        savings.verifyBrokenLinksSavings();
    }
    @Test
    public void clickOnlinkedInIconTest(){
        // frame need to be handled better
        savings.clickOnlinedInIcon();
        waitForVisibilityOfElement(locators.connectwithlinkedinPopup);
        String actual = locators.connectwithlinkedinPopup.getText();
        String Expected = "Connect with us on LinkedIn";
        Assert.assertEquals(actual,Expected);
    }

}
