package homePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class DealsLocators extends BaseAPI {


    //deals on home page
    @FindBy(xpath = "//*[@id=\"HEADBAND00\"]/span/a")
    public  WebElement deals;

    //logo to home page
    @FindBy(how = How.XPATH,using = "//*[@id=\"z1-globe\"]/a")
    public WebElement homePagelogo;

}
