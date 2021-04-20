package becomeAHostPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static becomeAHostPage.BecomeAHostPageLocators.*;

public class BecomeAHostPage extends BaseAPI {

    public BecomeAHostPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_BECOME_A_HOST)
    public  WebElement becomeAHost;
    @FindBy(xpath = WEB_ELEMENT_TEXT_BECOME)
    public WebElement textBecome;
    //get start to become a host
    @FindBy(xpath = WEB_ELEMENT_GET_START)
    public WebElement getStart;
    @FindBy(xpath = WEB_ELEMENT_ENTER_PHONE_NUMBER)
    public WebElement enterPhoneNumber;
    @FindBy(className = WEB_ELEMENT_CONTINUE_BUTTON)
    public WebElement continueButton;
   // @FindBy(css = WEB_ELEMENT_ENTER_PHONE_NUM)
    //public WebElement EnterPhoneNumber;
    @FindBy(xpath = WEB_ELEMENT_CONFIRM_YOUR_PHONE)
    public WebElement confirmPhoneNumber;
    //////
    @FindBy(xpath = WEB_ELEMENT_TEXT)
    public WebElement image;
    //////
    @FindBy(xpath = WEB_ELEMENT_HOW_WE_SUPPORT)
    public WebElement howWeSupport;
    @FindBy(css = WEB_ELEMENT_HOW_AIRBNB)
    public WebElement howAirBnB;
    /////
    @FindBy(xpath = WEB_ELEMENT_BECOME_A_HOST_EMAIL)
    public WebElement email;
//    @FindBy(xpath = WEB_ELEMENT_BECOME_A_HOST_Phone)
//    public WebElement phone;
    @FindBy(xpath = WEB_ELEMENT_CHECK_BUTTON)
    public WebElement checkButton;
    @FindBy(xpath = WEB_ELEMENT_SIGN_UP_BUTTON)
    public WebElement signUpButton;
    @FindBy(xpath = WEB_ELEMENT_CONFIRM_TEXT)
    public WebElement confirmText;





    public void becomeAHostButton() throws InterruptedException {
        becomeAHost.click();
       //Thread.sleep(4000);
       waitForElementToBeClickable(becomeAHost);
    }
    public String getBecomeAHostText(){

        return textBecome.getText();
    }
    public void getStart(){
        clickElement(getStart);

    }
    public void enterPhoneNumber(){
        sendKeysToElement(enterPhoneNumber,"9178616913");
    }
    public void continueButton(){

        waitForElementToBeClickable(continueButton);


    }
    public String getConfirmText(){
        //return confirmPhoneNumber.getText();


        return getTextFromElement(confirmPhoneNumber);
    }
    public void pageDown () throws AWTException, InterruptedException {
        Robot nam = new Robot();
        nam.keyPress(KeyEvent.VK_PAGE_DOWN);
        nam.keyRelease(KeyEvent.VK_PAGE_DOWN);

    }

    public String getText(){
       return image.getText();
    }

    public void openNewTabAndSwitchToIt() {
        clickElement(howWeSupport);
        switchToNewTab(1);
    }

    public String signUpToBecomeAHost() throws AWTException {
        sendKeysToElement(email,"mahmoudhammadi1992@gmail.com");
        //sendKeysToElement(phone,"9178616913");
        checkButton.click();
        signUpButton.click();
        return confirmText.getText();


    }



}
