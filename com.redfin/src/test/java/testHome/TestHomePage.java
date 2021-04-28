package testHome;
import common.BaseAPI;
import homePage.HomePageRedfin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestHomePage extends BaseAPI {

    HomePageRedfin home9= new HomePageRedfin();;

    @BeforeMethod
    public void init(){
        home9= PageFactory.initElements(driver,HomePageRedfin.class);
    }
    @Test(enabled = false)
    public void testGetListOfMortgage(){
        home9=new HomePageRedfin();

        List<WebElement> elementList = home9.mortgageButton;
        int actualCount = elementList.size();
        int expectedCount = 1;

        Assert.assertEquals(actualCount, expectedCount, "COUNT OF teams DOES NOT MATCH");
    }
    @Test(enabled = false)
    public void testSignUp(){
        home9=new HomePageRedfin();
        home9.checkSignUp();
        String expected="Join or Sign In";
        String actual=home9.errorMessage();
        Assert.assertEquals(actual,expected);
    }
    @Test(enabled = false)
    public void testLogIn(){
     home9=new HomePageRedfin();
     home9.logIn();
     Assert.assertTrue(isElementDisplayed(home9.errorLogInMessage));
    }
    @Test(dataProviderClass = HomePageRedfin.class, dataProvider = "getTestData2" ,enabled = false)
    public void testDoInvalidLogin(String email, String password) {
       home9= new HomePageRedfin();
       home9.doLogin(email, password);

    }
    @Test(enabled = false)
    public void call_phone_number_DisplayedTest()  {
        home9.callPhoneNumberDisplayed();
    }
    @Test
    public void affordability_CalculatorTest()  {
        home9.affordabilityCalculator();
    }
    @Test
    public void buyingGuideTest(){
        home9.buyingGuide();
        String expectedResult="https://www.redfin.com/guides/buy";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void buyingFindLendersTest(){
        home9.buyingFindLenders();
        String actualResult=home9.completeYourGuide.getText();
    String expectedResult = "Your complete guide to home buying and selling";
    Assert.assertEquals(actualResult,expectedResult,"NOT EQUAL");
    }
    @Test
    public void buyingBuyingClassesTest(){
        home9.buyingClasses();
        String expectedResult="https://www.redfin.com/buy-a-home/classes-and-events";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void buyingHousingMarketTest(){
        home9.buyingHousingMarket();
        String expectedResult="https://www.redfin.com/us-housing-market";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void buyingBuyRedfinTest(){
        home9.buyingBuyRedfin();
        String expectedResult="https://www.redfin.com/why-buy";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void whatsMyHomeWorthSellTest(){
        home9.whatsMyHomeWorthSell();
        String expectedResult="https://www.redfin.com/what-is-my-home-worth";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void myHomeDashBoardSellTest(){
        home9.myHomedashBoardSell();
        String expectedResult="https://www.redfin.com/what-is-my-home-worth";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void redfinFullServiceSEllTest(){
        home9.redfinFullServiceSEll();
        String expectedResult="https://www.redfin.com/sell-a-home/address?inquirySource=484";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void redfinOwCashOfferSEllTest(){
        home9.redfinOwCashOfferSEll();
        String expectedResult="https://www.redfin.com/services/redfinnow?inquirySource=smh";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
    @Test
    public void RedfinConciergeSEllTest(){
        home9.RedfinConciergeSEll();
        String expectedResult="https://www.redfin.com/services/concierge?inquirySource=[object%20Object]";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");

    }
    @Test
    public void redfinPremierSEllTest(){
        home9.redfinPremierSEll();
        String expectedResult="https://www.redfin.com/premier?inquirySource=[object%20Object]";
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL DIFFERENT");
    }
}
