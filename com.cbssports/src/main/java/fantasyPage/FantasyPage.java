package fantasyPage;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import static fantasyPage.FantasyPageLocators.*;

public class FantasyPage extends BaseAPI {
    public FantasyPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_FANTASY_BUTTON)
    public WebElement fantasyButton;
    @FindBy(xpath = WEB_ELEMENT_BASEBALL_BUTTON)
    public WebElement baseBall;
    @FindBy(xpath = WEB_ELEMENT_BASEBALL_TEXT)
    public WebElement baseText;
    @FindBy(xpath = WEB_ELEMENT_Roster_Trends)
    public WebElement rosters;
    @FindBy(xpath = WEB_ELEMENT_FOOTBALL_BUTTON)
    public WebElement footBall;
    @FindBy(xpath = WEB_ELEMENT_FANTASY_HUB)
    public WebElement fantasyHub;
    @FindBy(css = WEB_ELEMENT_NFL_TEXT)
    public WebElement nflText;
    @FindBy(xpath = WEB_ELEMENT_BASKETBALL)
    public WebElement basketball;

    public void fantasyButton1() {
        fantasyButton.click();
    }

    public void fantasy() {
        Actions fan = new Actions(driver);
        fan.moveToElement(fantasyButton).build().perform();
        baseBall.click();
    }

    public void fantasyList(String element) {
        fantasyButton.click();
        List<WebElement> list = driver.findElements(By.xpath(WEB_ELEMENT_FANTASY_BUTTON));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element)) {
                list.get(i).click();
                break;
            }
        }
    }


    public String baseBallText() {
        getTextFromElement(baseText);
        return baseText.getText();

    }

    public void baseBallHold() {
        Actions action = new Actions(driver);
        action.clickAndHold(baseBall).build().perform();
        rosters.click();
    }

    public void footList(String element) {
        footBall.click();
        //fantasyHub.click();
        List<WebElement> list = driver.findElements(By.xpath(WEB_ELEMENT_FOOTBALL_BUTTON));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element)) {
                list.get(i).click();
                break;
            }
        }
    }

    public void footBallButton() {
        footBall.click();
    }

    public void footBallMove() {
        Actions action = new Actions(driver);
        action.moveToElement(footBall).build().perform();

    }

    public void fantasyHubButton() {
        Actions action = new Actions(driver);
        action.moveToElement(footBall).build().perform();
        fantasyHub.click();
    }

    public String getHubText() {
        return nflText.getText();
    }




}
