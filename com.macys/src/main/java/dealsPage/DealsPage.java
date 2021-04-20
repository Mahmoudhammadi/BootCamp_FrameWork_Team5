package dealsPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static dealsPage.DealsPageLocators.*;

public class DealsPage extends BaseAPI {
    public DealsPage(){
    PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = WEB_ELEMENT_DEALS_BUTTON)
    public WebElement dealsButton;
    @FindBy(className = WEB_ELEMENT_WALLET)
    public WebElement wallet;
    @FindBy(css = WEB_ELEMENT_FIND_OUT_MORE)
    public WebElement findOut;
    @FindBy(xpath = WEB_ELEMENT_ADD_OFFERS)
    public WebElement addOffers;
    @FindBy(css = WEB_ELEMENT_MEN)
    public WebElement men;
    @FindBy(xpath = WEB_ELEMENT_DARK_BLEU)
    public WebElement darkBleu;
    @FindBy(xpath = WEB_ELEMENT_WOMEN)
    public WebElement women;
    @FindBy(xpath = WEB_ELEMENT_BLACK)
    public WebElement black;
    @FindBy(xpath = WEB_ELEMENT_KIDS)
    public WebElement kids;
    @FindBy(xpath = WEB_ELEMENT_SHORT)
    public WebElement shortForKids;
    @FindBy(xpath = WEB_ELEMENT_HOME)
    public WebElement home;
    @FindBy(xpath = WEB_ELEMENT_PEM_AMERICA)
    public WebElement pemAmerica;
    @FindBy(xpath = WEB_ELEMENT_AERO_GARDEN)
    public WebElement aeroGarden;
    @FindBy(css = WEB_ELEMENT_pink_color)
    public WebElement pinkColor;

    public void dealsButton(){
      dealsButton.click();
    }
    public String walletText(){
        return wallet.getText();
    }
    public void findOutMore()throws Exception{
        findOut.click();
        Thread.sleep(5000);

    }
    public String addOffers(){
        return addOffers.getText();
    }
    public void pageDown() throws Exception {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

    }
    public void nemSection(){
      waitForElementToBeClickable(men);

    }
    public void selectDarkBleu(){
        selectElement(darkBleu);
    }
    public void womenSection(){
        waitForElementToBeClickable(women);
    }
    public void selectBlack(){
        selectElement(black);
    }
    public void kidsSection(){
        waitForElementToBeClickable(kids);
    }
    public void selectShort(){
        selectElement(shortForKids);
    }
    public void homeSection(){
        waitForElementToBeClickable(home);
    }
    public void selectPemAmerica(){
        selectElement(pemAmerica);
    }
    public void aeroGardenItem(){
        waitForElementToBeClickable(aeroGarden);
    }
    public void selectPink(){
        selectElement(pinkColor);
    }

}
