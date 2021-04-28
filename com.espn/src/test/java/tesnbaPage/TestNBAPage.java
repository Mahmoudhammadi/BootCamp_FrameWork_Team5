package tesnbaPage;

import common.BaseAPI;
import nba.NBAPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNBAPage extends BaseAPI {

    NBAPage home9;

    @Test(enabled = false)
    public void testNBA(){
        home9=new NBAPage();
        home9.nbaButton();
        home9.nba();
        Assert.assertTrue(isElementDisplayed(home9.nbaButton));
    }
    @Test(enabled = false)
    public void testNBAList(){
        home9=new NBAPage();
        home9.nbaList("");
        Assert.assertTrue(isElementDisplayed(home9.nbaButton));
    }

    @Test(enabled = false)
    public void testStates() {
        home9 = new NBAPage();
        home9.nbaButton();
        home9.statesButton();
        home9.states();
        Assert.assertTrue(isElementDisplayed(home9.states));
    }
    @Test(enabled = false)
    public void testNBAStatesList(){
        home9=new NBAPage();
        home9.nbaButton();
        home9.statesButton();
        home9.statesList("");
        Assert.assertTrue(isElementSelected(home9.nbaBpi));
    }
    @Test(enabled = false)
    public void testChooseDate() {
        home9 = new NBAPage();
        home9.nbaButton();
        home9.scheduleButton();
        home9.chooseDate();
       Assert.assertTrue(isElementDisplayed(home9.chooseDate));
    }
    @Test (enabled = false)
    public void testCountOfCategoryDropdownOptions() {
        home9 = new NBAPage();
        home9.nbaButton();
        List<WebElement> elementList = home9.allTeams;
        int actualCount = elementList.size();
        int expectedCount = 30;

        Assert.assertEquals(actualCount, expectedCount, "COUNT OF teams DOES NOT MATCH");
    }
    @Test()
    public void testFuturesLines(){
        home9= new NBAPage();
        home9.nbaButton();
        home9.dailyLines();
        home9.futuresLines();
        home9.nbaDaily();
        String actualResult= home9.nbaDaily();
        String expectedResult="NBA";
        Assert.assertEquals(actualResult,expectedResult,"text not match");
    }


}
