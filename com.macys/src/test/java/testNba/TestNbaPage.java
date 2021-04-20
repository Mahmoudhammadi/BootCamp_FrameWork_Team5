package testNba;
import common.BaseAPI;
import dealsPage.DealsPage;
import dealsPage.DealsPageLocators.*;
import io.cucumber.java.an.E;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNbaPage extends BaseAPI {
    DealsPage home8;

    @Test(enabled = false)
    public void testDealsButton() {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.walletText();
        String actualResult = home8.walletText();
        String expectedResult = "Wallet";
        Assert.assertEquals(actualResult, expectedResult, "text not match");
    }

    @Test(enabled = false)
    public void testFindOutMore() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.findOutMore();
        home8.addOffers();
        String actualResult = home8.addOffers();
        String expectedResult = "ADD OFFERS TO YOUR MACY’S WALLET & SAVE!";
        Assert.assertEquals(actualResult, expectedResult, "text not match");

    }

    @Test(enabled = false)
    public void testSelectDarkBleu() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.pageDown();
        home8.nemSection();
        home8.selectDarkBleu();
        Assert.assertTrue(isElementDisplayed(home8.darkBleu));
    }

    @Test(enabled = false)
    public void testSelectBlack() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.pageDown();
        home8.womenSection();
        home8.selectBlack();
        Assert.assertTrue(isElementDisplayed(home8.black));
    }

    @Test(enabled = false)
    public void testSelectShort() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.pageDown();
        home8.kidsSection();
        home8.selectShort();
        Assert.assertTrue(isElementDisplayed(home8.shortForKids));
    }
    @Test(enabled = false)
    public void testSelectPemAmerica() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.pageDown();
        home8.homeSection();
        home8.selectPemAmerica();
       // Assert.assertTrue(isElementDisplayed(home8.pemAmerica));
    }
    @Test()
    public void testSelectPinkColor() throws Exception {
        home8 = new DealsPage();
        home8.dealsButton();
        home8.pageDown();
        home8.homeSection();
        home8.aeroGardenItem();
        home8.selectPink();
        Assert.assertTrue(isElementDisplayed(home8.pinkColor));
    }


}
