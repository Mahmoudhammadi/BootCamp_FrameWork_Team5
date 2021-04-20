package fantasyPageTest;

import common.BaseAPI;
import fantasyPage.FantasyPage;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Queue;

import static fantasyPage.FantasyPageLocators.*;

public class FantasyPageTest extends BaseAPI {
    FantasyPage home6;
    @Test(enabled = false)
    public void testFantasy(){
        home6=new FantasyPage();
        home6.fantasy();
        Assert.assertTrue(isElementDisplayed(home6.baseBall));
    }

    @Test(enabled = false)
    public void testFantasyList(){
        home6=new FantasyPage();
        home6.fantasyList("FOOTBALL");
        Assert.assertTrue(isElementDisplayed(home6.baseBall));
    }

    @Test(enabled = false)
    public void testFantasyButton(){
        home6 = new FantasyPage();
        home6.fantasyButton1();
        home6.baseBallText();
        String actual= home6.baseBallText();
        String expected="Baseball";
        Assert.assertEquals(actual,expected,"text not match");
    }
    @Test(enabled = false)
    public void testRostersHold(){
        home6 = new FantasyPage();
        home6.fantasyButton1();
        home6.baseBall.click();
        home6.baseBallHold();
        Assert.assertTrue(isElementDisplayed(home6.baseBall));
    }
    @Test(enabled = false)
    public void tstFootballList(){
        home6=new FantasyPage();
        home6.fantasyButton1();
        home6.footList("Fantasy Hub");
        Assert.assertTrue(isElementDisplayed(home6.footBall));
    }
    @Test(enabled = false)
    public void testFantasyHub(){
        home6 = new FantasyPage();
        home6.fantasyButton1();
        home6.footBallButton();
        home6.footBallMove();
    Assert.assertTrue(isElementDisplayed(home6.fantasyHub));
    }
    @Test()
    public void testHubButton(){
        home6=new FantasyPage();
        home6.fantasyButton1();
        home6.footBallButton();
        home6.fantasyHubButton();
        String actualResult=home6.getHubText();
        String expectedResult="NFL SEASON LONG FANTASY HUB";
        Assert.assertEquals(actualResult,expectedResult,"text not match");
    }
}
