package savingPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsLocators {


    @FindBy(xpath = "//*[@id=\"navSavings\"]")
    public static WebElement saving;


    @FindBy(xpath = "//*[@id='navSavingsOnlineBanking']")
    public static WebElement onlineBanking_savings;

    //*[@id="globalNavModule"]/header/div[2]/div[2]/div[3]/a
    @FindBy(xpath = "//a[contains(@aria-label,'Related Links')]")
    public static WebElement menu;

    public static final String topFeatures = "//body/div[contains(@class,'flex-grid-nest spa-contextroot-online-banking spa-site-online-banking')]/div[contains(@class,'spa-layout-container spa-layout-container--flex-grid-nest')]/div[@id='top']/section[@id='head-row']/div[contains(@class,'row small-collapse medium-collapse large-collapse')]/div[contains(@class,'large-12 columns')]/div[@id='globalNavModule']/header[contains(@class,'header header--consumer header--open')]/nav[@id='navigation']/div[contains(@class,'row small-collapse medium-uncollapse menu-items-container')]/div[contains(@class,'column')]/div[contains(@class,'row collapse')]/div[1]/div[1]/ul[1]";
    public static final String mobileAndResources = "//body/div[@class='flex-grid-nest spa-contextroot-online-banking spa-site-online-banking']/div[@class='spa-layout-container spa-layout-container--flex-grid-nest']/div[@id='top']/section[@id='head-row']/div[@class='row small-collapse medium-collapse large-collapse']/div[@class='large-12 columns']/div[@id='globalNavModule']/header[@class='header header--consumer header--open']/nav[@id='navigation']/div[@class='row small-collapse medium-uncollapse menu-items-container']/div[@class='column']/div[@class='row collapse']/div[2]/div[1]/ul[1]";


    @FindBy(xpath = "//input[@id='nav-search-query']")
    public static WebElement searchBox;
    //a[normalize-space()='Sign in']
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    public static WebElement signin;
    //input[@id='oid']
    @FindBy(xpath = "//input[@id='oid']")
    public static WebElement onlineID;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    public static WebElement passcode;

//a[@id='social_follow_linkedin_link']
@FindBy(xpath = "//a[@id='social_follow_linkedin_link']")
public static WebElement linkedinIcon;
//*[@id="globalFooterModule"]/footer/div[2]
@FindBy(xpath = "//h3[normalize-space()='Connect with us on LinkedIn']")
public WebElement connectwithlinkedinPopup;
}
