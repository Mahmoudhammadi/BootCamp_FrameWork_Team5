package homePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

import static homePage.PackagesLocators.*;

public class HomePageExpedia extends BaseAPI {

    @FindBy(xpath = packagesXpath)
    public WebElement packages;
    @FindBy(xpath =leavingFromXpath)
    public WebElement leavingFrom;
    @FindBy(xpath =leavingtoXpath)
    public WebElement leavingto;
    @FindBy(xpath =accomodationXpath)
    public WebElement accomodation;
    @FindBy(xpath = SearchXpath)
    public WebElement Search;


    public HomePageExpedia() {
        PageFactory.initElements(driver, this);
    }
    public void setPackages() {
        packages.click(); }

    public void setAccomodation() {
        accomodation.click();
    }

    public void setSearch() {
        Search.click();
    }

    public void leavingto() {
        leavingto.click();
    }

    public void leavingFrom() {
        leavingFrom.click();
    }


}
