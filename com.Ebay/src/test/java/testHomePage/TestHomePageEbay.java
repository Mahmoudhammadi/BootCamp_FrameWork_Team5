package testHomePage;
import common.BaseAPI;
import homePage.EbayHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

import static homePage.EbayHomePageLocators.*;
public class TestHomePageEbay extends BaseAPI {
    EbayHomePage home1;


    //testAllCategory
    @Test()
    public void testAllCat() {
        home1 = new EbayHomePage();
        home1.allCategory("Books");
        String act = home1.validation();
        String expected = "Books";
        Assert.assertEquals(act, expected, "books not match");
    }

    //testSearchBox
    @Test()
    public void testSearchBox1() {
        home1 = new EbayHomePage();
        home1.searchBox();
        boolean actualres = home1.searchValidation("macbook pro").equalsIgnoreCase(expectedMac);
        boolean expectres = true;
        //String actualResult =home1.searchValidation();
        Assert.assertEquals(actualres, expectres);
    }

    @Test()
    public void testDoInvalidLogin() {
        home1 = new EbayHomePage();
        home1.doLoginUsername();
    }

    // testing My Ebay
    @Test()
    public void testMyEbay() {
        home1 = new EbayHomePage();
        home1.myEbay();
    }


    @Test
    public void TestSeaCHBox() throws InterruptedException {
        home1 = new EbayHomePage();
        home1.searBox();
        home1.readExcelFile("/src/test/resources/test_data/mahmoud5.xlsx");
    }


    @Test(dataProviderClass = EbayHomePage.class, dataProvider = "getTestData2")
    public void testSearchBox(String product) throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        home1 = new EbayHomePage();
        home1.enterDataToSearchBox(product);
    }

//    @Test()
//    public void testJScript() {
//
//        home1 = new EbayHomePage();
//        home1.jScript();

    //}
}
