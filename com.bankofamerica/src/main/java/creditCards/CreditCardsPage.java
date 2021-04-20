package creditCards;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.BaseAPI;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

import static creditCards.CreditCardsPageLocators.*;

public class CreditCardsPage extends BaseAPI {
    public CreditCardsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_CREDIT_CARDS_BUTTON)
    public WebElement creditCardsButton;
    @FindBy(xpath = WEB_ELEMENT_GET_TEXT)
    public WebElement getText;
    @FindBy(xpath = WEB_ELEMENT_CASH_REWARDS)
    public WebElement cashRewards;
    @FindBy(css = WEB_ELEMENT_CARD_FOR_STUDENTS)
    public WebElement cardForStudents;
    @FindBy(css = WEB_ELEMENTS_EXPECTED_CREDIT_CARDS_SELECTED)
    public List<WebElement> webElementExpected;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BOX)
    public WebElement searchBox;

    public void searchForCreditCardsFromXlsx(String name){
        sendKeysToElement(searchBox,"cards");


    }

    public void CreditCardsButton() {
        clickElement(creditCardsButton);
        waitForElementToBeClickable(creditCardsButton);
    }

    public String getText5() {
        return getTextFromElement(getText);

    }

    public void listOfCredits() {
        Actions action = new Actions(driver);
        action.click(creditCardsButton).build().perform();
        waitForElementToBeClickable(creditCardsButton);


    }

    public void listOfCredits1() {
        Actions action = new Actions(driver);
        action.clickAndHold(creditCardsButton).build().perform();
        waitForVisibilityOfElement(creditCardsButton);


    }

    public void creditCardsList5(String element) {
        creditCardsButton.click();
        List<WebElement> list = driver.findElements(By.xpath(WEB_ELEMENT_CREDIT_CARDS_BUTTON));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element)) {
                list.get(i).click();
                break;
            }
        }
    }

    public String getExpectedCreditCards() {


        return WEB_ELEMENTS_EXPECTED_CREDIT_CARDS_SELECTED;

    }

    public String path = "src/test/resources/test_data/bank of.xlsx";
    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {
        Object data1[][] = DataReader.fileReader4(path, "creditCards");
        return data1;
    }



}
