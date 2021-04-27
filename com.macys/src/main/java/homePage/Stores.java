package homePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homePage.StoresLocators.*;

public class Stores extends BaseAPI {
    public Stores(){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = WebElementStores)
    public static WebElement Stores;
    @FindBy(xpath = WebElementValidateStoresPage)
    public static WebElement ValidateStoresPage;
    //////
    @FindBy(xpath = WebElementMyAccount)
    public static WebElement MyAccount;
    @FindBy(xpath = WebElementWallet)
    public static WebElement Wallet;


 public void clickStores(){
     Stores.click();
 }
 public String ValidateStoresPage(){
    return  ValidateStoresPage.getText();
 }
 public void MyAccount(){
     Actions actions = new Actions(driver);
     actions.moveToElement(MyAccount).build().perform();
     Wallet.click();
 }
 @FindBy(xpath = WebElementValidateWallet)
    public static WebElement ValidateWallet;
 public String ValidateWallet(){
   return ValidateWallet.getText();
 }


}
