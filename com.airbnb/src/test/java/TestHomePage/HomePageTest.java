package TestHomePage;

import AirBnbHomePage.HomePage;
import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseAPI {

    static HomePage AirHome ;

    public void init(){ AirHome = PageFactory.initElements(driver,HomePage.class);
    }

    @Test(priority = 1)
    public void testLearnMoreFeature(){
        init();
        AirHome.learnMoreFeature(); }

    @Test(priority = 2)
    public void testEntireHomesFeature(){
        init();
        AirHome.entireHomesFeature(); }

    @Test(priority = 3)
    public void testUniqueStaysFeature(){
        init();
        AirHome.UniqueStays(); }

    @Test(priority = 4)
    public void testNearByGetAwaysFeature(){
        init();
        AirHome.nearByGetAwaysFeature(); }

    @Test(priority = 5)
    public void testExploreAllFeature(){
        init();
        AirHome.exploreAllFeature(); }

    @Test(priority = 6)
    public void testGetInvolvedFeature(){
        init();
        AirHome.getInvolvedFeature(); }

    @Test(priority = 7)
    public void testStayInformedFeature(){
        init();
        AirHome.stayInformedFeature(); }

    @Test(priority = 8)
    public void testCommunityFeature(){
        init();
        AirHome.communityFeature(); }

    @Test(priority = 9)
    public void testHostFeature(){
        init();
        AirHome.hostFeature(); }


    @Test(priority = 10)
    public void testSupportFeature(){
        init();
        AirHome.supportFeature(); }

    @Test(priority = 11)
    public void testImageFeature(){
        init();
        AirHome.imageFeature(); }

    @Test(priority = 12)
    public void testAddLocationFeature(){
        init();
        AirHome.addLocationFeature();
    }

    @Test(priority = 13)
    public void testCheckInFeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
    }

    @Test(priority = 14)
    public void testCheckInDateFeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
        AirHome.checkInDateFeature();

    }

    @Test(priority = 15)
    public void testCheckOutDateFeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
        AirHome.checkInDateFeature();
        AirHome.checkOutDateFeature();

    }

    @Test(priority = 16)
    public void testadultsfeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
        AirHome.checkInDateFeature();
        AirHome.checkOutDateFeature();
        AirHome.adultsFeature();
    }
    @Test(priority = 17)
    public void testChildrenFeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
        AirHome.checkInDateFeature();
        AirHome.checkOutDateFeature();
        AirHome.adultsFeature();
        AirHome.childrenFeature();
    }

    @Test(priority = 18)
    public void testSearchFeature(){
        init();
        AirHome.addLocationFeature();
        AirHome.checkInFeatiure();
        AirHome.checkInDateFeature();
        AirHome.checkOutDateFeature();
        AirHome.adultsFeature();
        AirHome.childrenFeature();
        AirHome.searchFeature();

    }




}
