package homePage;

import common.BaseAPI;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import static homePage.EbayHomePageLocators.*;

import java.io.IOException;
import java.util.List;

    public class EbayHomePage extends BaseAPI {


        public  EbayHomePage(){
            PageFactory.initElements(driver,this);

        }

        @FindBy(how = How.XPATH,using = webElementAllCate)
        public static WebElement allCat;
        @FindBy(how = How.XPATH,using = getWebElementActualBooks)
        public static WebElement Books;
        //testing search box functionality
        @FindBy(how = How.XPATH,using = webElementSearchBox )
        public static WebElement box;
        @FindBy(how = How.XPATH,using = webElementSearchButton)
        public static WebElement button;
        @FindBy(how = How.XPATH,using =webElementActualMac )
        public static WebElement actual;
        //Sign In Web Elements
        @FindBy (xpath = WEB_ELEMENT_INPUT_EMAIL)
        public WebElement inputEmail;

        @FindBy (id = WEB_ELEMENT_BUTTON_CONTINUE)
        public WebElement buttonContinue;

        @FindBy (id = WEB_ELEMENT_TEXT_ERROR_MESSAGE)
        public WebElement textErrorMessage;



        //My Ebay elements
        @FindBy(how = How.XPATH,using = webElementMyEbay)
        public static WebElement  myEbay;
        @FindBy(how = How.XPATH,using = webElementLinkWatchList)
        public static WebElement watchList;

        //search box
        //@FindBy(xpath = WEB_ELEMENT_SHOP_CATEGORY)
        //public WebElement shopCategory;

        @FindBy(xpath= WEB_ELEMENT_SEARCH_BOX)
        public WebElement SEARCH_BOX;

        public void searBox() throws InterruptedException {

            clickElement(SEARCH_BOX);
            //SEARCH_BOX.sendKeys();

            sendKeysToElement(SEARCH_BOX,"product");
            Thread.sleep(4000);
        }
        public void enterDataToSearchBox(String product) throws InterruptedException {
            SEARCH_BOX.click();
            SEARCH_BOX.sendKeys(product);
        }
        //handle boots tarp
        public void allCategory(String element){
            allCat.click();
            List<WebElement> list=driver.findElements(By.xpath(getWebElementGAllCate));
            for (int i =0 ;i<list.size();i++){
                if(list.get(i).getText().contains(element)){
                    list.get(i).click();
                    break; } }
        }
        public String validation(){
            Books.getText();
            return Books.getText();
        }
        // Search Box Method
        public void searchBox() {
            box.sendKeys("macbook Pro");
            button.click();
        }


        public String searchValidation(String actual)  {

            return actual;
        }
        //Sign In Method
        public void enterEmailOrUsername() {
            sendKeysToElement(inputEmail, "mahmoudhammadi@gmail.com");
        }

        public void clickContinueButton() {
            clickElement(buttonContinue);
        }

        public void doLoginUsername() {
            enterEmailOrUsername();
            clickContinueButton();
        }

        // My Ebay
        public String myEbay(){
            Actions action=new Actions(driver);
            action.moveToElement(myEbay).build().perform();
            watchList.click();

            return null;

        }
        public  String path="src/test/resources/mahmoud5.xlsx";
        @DataProvider
        public  Object[][] getTestData2() throws IOException, InvalidFormatException {
            Object data1 [][]= DataReader.fileReader4(path, "team5");
            return data1;
        }
        @FindBy(xpath = WEB_ELEMENT_IFRAME)
        public WebElement iframe;
        @FindBy (xpath = WEB_ELEMENT_IFRAME_COURSES)
        public WebElement IFRAME_COURSES;

//        public void jScript() {
////        Robot robot=new Robot();
////        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//
//            switchToIFrameUsingElement(iframe);
//            scrollToElementJScript(IFRAME_COURSES);
//

       // }
}
