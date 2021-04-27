package TestHomePage;

import VerizonHomePage.HomePage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseAPI {
    HomePage homePage;
    @Test()
    public void testSelectSHOP() {
        homePage = new HomePage();
        homePage.selectSHOP();

        Assert.assertTrue(isElementSelected(homePage.SHOP));
    }
    @Test()
    public void testSelectPERSONAL(){
        homePage = new HomePage();

    }
}
