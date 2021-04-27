package AirBnbHomePage;

import common.BaseAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static AirBnbHomePage.HomePageLocators.*;


   public class HomePage extends BaseAPI {
    @FindBy(how = How.XPATH, using = WebElementLearnMore)
    public WebElement learnMore;
    public void learnMoreFeature(){
        learnMore.click();
    }

    @FindBy(how = How.XPATH, using = WebEntireHomes)
    public WebElement entirehome;
    public void entireHomesFeature(){
        entirehome.click();
    }

    @FindBy(how = How.XPATH, using = WebUniqueStays)
    public WebElement UniqueStays;
    public void UniqueStays(){
        UniqueStays.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = WebNearByGetAways)
    public WebElement nearbygetaways;
    public void nearByGetAwaysFeature(){
        nearbygetaways.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webExploreAll)
    public WebElement exploreall;
    public void exploreAllFeature(){
        exploreall.click();
    }

    @FindBy(how = How.XPATH, using = WebGetInvolved)
    public WebElement getinvolved;
    public void getInvolvedFeature(){
        getinvolved.click();
    }

    @FindBy(how = How.XPATH, using = WebStayInformed)
    public WebElement stayinformed;
    public void stayInformedFeature(){
        stayinformed.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = WebCommunity)
    public WebElement community;
    public void communityFeature(){
        community.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = WebHost)
    public WebElement host;
    public void hostFeature(){
        host.isDisplayed();

    }

    @FindBy(how = How.XPATH, using = WebSupport)
    public WebElement support;
    public void supportFeature(){
        support.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webImage)
    public WebElement image;
    public void imageFeature(){
        image.click();
    }

    @FindBy(how = How.XPATH, using = webAddLocation)
    public WebElement addlocation;
    public void addLocationFeature(){
        addlocation.click();
    }

    @FindBy(how = How.XPATH, using = webCheckIn)
    public WebElement checkin;
    public void checkInFeatiure(){
        checkin.click();
    }

    @FindBy(how = How.XPATH, using = webCheckInDate)
    public WebElement checkindate;
    public void checkInDateFeature(){
        checkindate.click();
    }

    @FindBy(how = How.XPATH, using = webCheckOutDate)
    public WebElement checkoutdate;
    public void checkOutDateFeature(){
        checkoutdate.click();
    }

    @FindBy(how = How.XPATH, using = webAdults)
    public WebElement adults;
    public void adultsFeature(){
        adults.click();
    }

    @FindBy(how = How.XPATH, using = webChildren)
    public WebElement children;
    public void childrenFeature(){
        children.click();
    }

    @FindBy(how = How.XPATH, using = webSearch)
    public WebElement search;
    public void searchFeature(){
        search.click();
    }







}
