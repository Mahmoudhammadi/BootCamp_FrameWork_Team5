package nba;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.XMLFormatter;

import static nba.NBAPageLocators.*;


public class NBAPage extends BaseAPI {
    public NBAPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_NBA_BUTTON)
    public WebElement nbaButton;
    @FindBy(xpath = WEB_ELEMENT_SOCCER_BUTTON)
    public WebElement soccer;
    @FindBy(xpath = WEB_ELEMENT_STATES)
    public WebElement states;
    @FindBy(xpath = WEB_ELEMENT_NBA_BPI)
    public WebElement nbaBpi;
    @FindBy(css = WEB_ELEMENT_SCHEDULE)
    public WebElement schedule;
    @FindBy(xpath = WEB_ELEMENT_DATE_27)
    public WebElement date;
    @FindBy(className = WEB_ELEMENT_CHOOSE_DATE)
    public WebElement chooseDate;
    @FindBy(xpath = WEB_ELEMENT_LIST_OF_TEAMS)
    public List<WebElement> allTeams;
    @FindBy(xpath = WEB_ELEMENT_DAILY_LINES)
    public WebElement dailyLines;
    @FindBy(xpath = WEB_ELEMENT_FUTURES)
    public WebElement futures;
    @FindBy(xpath = WEB_ELEMENT_NBA_DAILY_LINES)
    public WebElement nbaDaily;

    public void dailyLines(){
       // dailyLines.click();
        waitForElementToBeClickable(dailyLines);
    }
    public void futuresLines(){
       // futures.click();
        waitForElementToBeClickable(futures);
    }
    public String nbaDaily(){
        return nbaButton.getText();
    }



    public void nbaButton(){
        nbaButton.click();
    }
    public void nba() {
        Actions fan = new Actions(driver);
        fan.moveToElement(nbaButton).build().perform();
    }
    public void nbaList(String element) {
        nbaButton.click();
        List<WebElement> list = driver.findElements(By.xpath(WEB_ELEMENT_NBA_BUTTON));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element)) {
                list.get(i).click();
                break;
            }
        }
    }
    public void statesButton(){
        waitForElementToBeClickable(states);
        //states.click();
    }
    public void states() {
        Actions fan = new Actions(driver);
        fan.clickAndHold(states).build().perform();
    }
    public void statesList(String element) {
        states.click();
        List<WebElement> list = driver.findElements(By.xpath(WEB_ELEMENT_STATES));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element)) {
                list.get(i).click();
                break;

            }
        }
    }
    public void scheduleButton(){
        waitForElementToBeClickable(schedule);
        //schedule.click();
    }
    public void dateButton(){
        date.click();
    }
    public void chooseDate() {
        Actions fan = new Actions(driver);
        fan.moveToElement(date).build();

    }


}
