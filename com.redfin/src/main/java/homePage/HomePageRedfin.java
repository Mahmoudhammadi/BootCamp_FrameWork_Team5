package homePage;
import common.BaseAPI;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import static homePage.HomePageRedfinLocators.*;

public class HomePageRedfin extends BaseAPI {
    public HomePageRedfin() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_MORTGAGE_BUTTON)
    public List<WebElement> mortgageButton;

    @FindBy(xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement sign_up;
    @FindBy(xpath = WEB_ELEMENT_EMAIL)
    public WebElement email;
    @FindBy(xpath = WEB_ELEMENT_CLICK_EMAIL)
    public WebElement click_email;
    @FindBy(xpath = WEB_ELEMENT_ERROR_MESSAGE)
    public WebElement ERROR_MESSAGE;
    ////////////logIn
    @FindBy(css = WEB_ELEMENT_LOG_IN_BUTTON)
    public WebElement logInButton;
    @FindBy(css = WEB_ELEMENT_EMAIL_BOX)
    public WebElement emailBox;
    @FindBy(css = WEB_ELEMENT_CONTINUE_BUTTON1)
    public WebElement continueButton1;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_BOX)
    public WebElement passwordBox;
    @FindBy(css = WEB_ELEMENT_CONTINUE_BUTTON2)
    public WebElement getContinueButton2;
    @FindBy(xpath = WEB_ELEMENT_ERROR_LOG_IN_MESSAGE)
    public WebElement errorLogInMessage;
    @FindBy(xpath = WEB_ELEMENT_PHONE_NUMBER)
    public WebElement phone_number_call;
    @FindBy(xpath = WEB_ELEMENT_BUY_MENU)
    public WebElement buy_Menu;
    @FindBy(xpath = WEB_ELEMENT_AFFORDABILITY_CALCULATOR)
    public WebElement affordabilityCalculator;
    @FindBy(xpath = WEB_ELEMENT_BUYING_GUIDE)
    public WebElement buyingGuide;
    @FindBy(xpath = WEB_ELEMENT_COMPLETE_YOUR_GUIDE)
    public WebElement completeYourGuide;
    @FindBy(xpath = WEB_ELEMENT_FIND_LENDERS)
    public WebElement findLenders;
    @FindBy(xpath = WEB_ELEMENT_BUYING_CLASSES)
    public WebElement buyingClasses;
    @FindBy(xpath = WEB_ELEMENT_HOUSING_MARKET)
    public WebElement housingMarket;
    @FindBy(xpath = WEB_ELEMENT_BUY_REDFIN)
    public WebElement buyRedfin;
    //sell drop down My HOME
    @FindBy(xpath = WEB_ELEMENT_SELL)
    public WebElement sell;
    @FindBy(xpath = WEB_ELEMENT_WHATS_MY_HOME_WORTH)
    public WebElement whatsMyHomeWorth;
    @FindBy(xpath = WEB_ELEMENT_MY_HOME_DASHBOARD)
    public WebElement myHomedashBoard;
    @FindBy(xpath = WEB_ELEMENT_MY_HOME_REdfinFullService)
    public WebElement redfinFullService;
    @FindBy(xpath =  WEB_ELEMENT_REDFINOW_CASHOFFER)
    public WebElement redfinowCashOffer;
    @FindBy(xpath =  WEB_ELEMENT_MY_HOME_REdfinConcierge)
    public WebElement RedfinConcierge;
    @FindBy(xpath =  WEB_ELEMENT_REDFIN_PREMIER)
    public WebElement redfinPremier;
    public void sign_up() {
        sign_up.click();
    }

    public void enterEmailBox() {
        waitForElementToBeClickable(emailBox);
        emailBox.sendKeys("mahmoud@gmail.com");
    }

    public void clickEmail() {//sell drop down My HOME
        click_email.click();
    }

    public String errorMessage() {
        return ERROR_MESSAGE.getText();
    }

    public void checkSignUp() {
        sign_up();
        enterEmailBox();
        clickEmail();
    }

    //////LOGIN METHODS
    public void clickOnLogIn() {
        logInButton.click();
    }

    public void enterEmail2() {
        waitForElementToBeClickable(emailBox);
        sendKeysToElement(emailBox, "mahmoud@gmail.com");
    }

    public void clickOnContinue1() {
        continueButton1.click();
    }

    public void senPassword() {
        waitForElementToBeClickable(passwordBox);
        sendKeysToElement(passwordBox, "12342");
    }

    public void clickOnContinue2() {
        getContinueButton2.click();
    }

    public String errorLogInMessage() {
        return getTextFromElement(errorLogInMessage);
    }

    public void logIn() {
        clickOnLogIn();
        enterEmail2();
        clickOnContinue1();
        senPassword();
        clickOnContinue2();
    }

    public String path = "src/test/resources/test_data/redfin.xlsx";

    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {
        Object data1[][] = DataReader.fileReader4(path, "logIn");
        return data1;
    }
    public void doLogin(String email, String password){
        sendKeysToElement(emailBox, email);
        clickElement(continueButton1);
        sendKeysToElement(passwordBox, password);
        clickElement(getContinueButton2);
    }
    public void callPhoneNumberDisplayed(){
        clickElement(phone_number_call);
        //ChromeOptions extends MutableCapabilities
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");
        //ASSERTION would be more tricky
    }
    public void buy_Menu_DropDown(){
        hoverOverElement(buy_Menu);
    }
    public void  affordabilityCalculator(){
buy_Menu_DropDown();
affordabilityCalculator.click();
    }
    public void buyingGuide(){
        buy_Menu_DropDown();
        buyingGuide.click();
    }
    public void buyingFindLenders(){
        buy_Menu_DropDown();
        findLenders.click();
    }
    public void buyingClasses(){
        buy_Menu_DropDown();
        buyingClasses.click();
    }
    public void buyingHousingMarket(){
        buy_Menu_DropDown();
        housingMarket.click();
    }
    public void buyingBuyRedfin(){
        buy_Menu_DropDown();
        buyRedfin.click();
    }
//sell drop down My HOME
    public void hoverSell(){
        hoverOverElement(sell);
    }
    public void whatsMyHomeWorthSell(){
        hoverSell();
        whatsMyHomeWorth.click();
    }
    public void myHomedashBoardSell(){
        hoverSell();
        myHomedashBoard.click();
    }
    public void redfinFullServiceSEll(){
        hoverSell();
        redfinFullService.click();
    }
    public void redfinOwCashOfferSEll(){
        hoverSell();
        redfinowCashOffer.click();
    }
    public void RedfinConciergeSEll(){
        hoverSell();
        RedfinConcierge.click();
    }
    public void redfinPremierSEll(){
        hoverSell();
        redfinPremier.click();
    }
}
