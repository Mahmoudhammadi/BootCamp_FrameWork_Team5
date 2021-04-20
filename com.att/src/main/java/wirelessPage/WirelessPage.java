package wirelessPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static wirelessPage.WirelessPageLocators.*;

public class WirelessPage extends BaseAPI {

    public WirelessPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = WEB_ELEMENT_WIRELESS_BUTTON)
    public WebElement wirelessButton;
    @FindBy(xpath = WEB_ELEMENT_LEARN_HOW_EVERYONE)
    public WebElement learnHow;
    @FindBy(css = WEB_ELEMENT_IPHONE_XS)
    public  WebElement iphoneXS;
    @FindBy(className = WEB_ELEMENT_GET_TEXT)
    public WebElement grtText;
    @FindBy(xpath = WEB_ELEMENT_SAMSUNG)
    public WebElement samsung;
    @FindBy(css = WEB_ELEMENT_BLACK)
    public WebElement black;


    public void wirelessButton(){
     wirelessButton.click();
     waitForElementToBeClickable(wirelessButton);

    }
    public String getText(){
        return learnHow.getText();
    }
    public void pageDown1 () throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
       // robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }
    public void selectIphoneXS()throws Exception{
       clickElement(iphoneXS);
        //waitForElementToBeClickable(ultraS21)
        //Thread.sleep(4000);
    }
    public String getText1 (){

            return grtText.getText();
    }
    public void samsungButton() throws InterruptedException {
        clickElement(samsung);
        Thread.sleep(4000);
    }
    public void selectBlackColor(){
        waitForElementToBeSelected(black);

    }

}
