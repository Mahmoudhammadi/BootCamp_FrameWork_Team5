package VerizonHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static VerizonHomePage.HomePageLocators.WEB_ELEMENT_PERSONAL;
import static VerizonHomePage.HomePageLocators.WEB_ELEMENT_SHOP;

public class HomePage extends BaseAPI {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = WEB_ELEMENT_SHOP)
    public WebElement SHOP;

    public void selectSHOP(){
        selectElement(SHOP);
    }
    @FindBy(className = WEB_ELEMENT_PERSONAL)
    public WebElement PERSONAL;

    public void setPERSONAL(WebElement PERSONAL) {
        this.PERSONAL = PERSONAL;
    }
}

