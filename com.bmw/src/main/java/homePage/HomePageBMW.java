package homePage;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static homePage.HomePageBMWLocators.*;

public class HomePageBMW extends BaseAPI {
   public HomePageBMW(){
       PageFactory.initElements(driver,this);
   }
   @FindBy(xpath = WEB_ELEMENT_MENU_BUTTON)
    public WebElement menu;
   @FindBy(xpath = WEB_ELEMENT_SHOPPING)
   public WebElement shopping;

    public void bmwMenu(String element){
        //clickElement(menu);
        waitForElementToBeClickable(menu);
        List<WebElement> list=driver.findElements(By.xpath(WEB_ELEMENT_MENU_BUTTON));
        for (int i =0 ;i<list.size();i++){
            if(list.get(i).getText().contains(element)){
                list.get(i).click();
                break; } }
    }
    public String getShopping(){
        return shopping.getText();
    }
    public void holdMenu(){

        Actions action=new Actions(driver);
        action.clickAndHold(menu).build().perform();
        //menu.click();
    }


}
