package creditCards;

import common.BaseAPI;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static creditCards.CreditCardsPageLocators.*;

public class CreditCardsPageTest extends BaseAPI {
    CreditCardsPage home3;

    @Test(enabled = false)
    public void testCreditCardsButton(){
        home3 =new CreditCardsPage();
        home3.CreditCardsButton();
        home3.getText5();
        String actualResult=home3.getText5();
        String expectedResult="Find the perfect credit card from among our most popular options";
        Assert.assertEquals(actualResult,expectedResult,"text mot match");
}
    @Test(enabled = false)
    public void testCreditCardsList(){
        home3 = new CreditCardsPage();
        home3.listOfCredits();
     Assert.assertTrue(isElementDisplayed(home3.cashRewards),"displayed not match");
    }

    @Test(enabled = false)
    public void testCreditForStudents(){
        home3 =new CreditCardsPage();
        home3.listOfCredits1();
        Assert.assertTrue(home3.isElementDisplayed(home3.creditCardsButton),"not as expected");
    }
    @Test(enabled = false)
    public void testGetAllListOfCreditCards(){
        home3=new CreditCardsPage();
        home3.CreditCardsButton();
        home3.creditCardsList5(WEB_ELEMENT_CASH_REWARDS);
    }
    @Test ()
    public void testExpectedCreditCards() {
        home3 = new CreditCardsPage();

        List<WebElement> elementList = home3.webElementExpected;

        int actualCount = elementList.size();
        int expectedCount = 1;

        Assert.assertEquals(actualCount, expectedCount, "expected credit cards DOES NOT MATCH");
    }

    @Test (enabled = false)
    public void testNamesOfCreditCards() throws Exception {
        home3 = new CreditCardsPage();

        String sheetPath = System.getProperty("user.dir") + "src/test/resources/test_data/bank of.xlsx";

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(home3.getExpectedCreditCards()),
                "bank of", sheetPath, "creditCards"));
    }

    @Test(dataProviderClass = CreditCardsPage.class, dataProvider = "getTestData2")
    public void testSearchBox(String cards) throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        home3 = new CreditCardsPage();
        home3.searchForCreditCardsFromXlsx(cards);

    }




}
