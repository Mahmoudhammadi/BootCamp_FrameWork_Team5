package carsPage;
import common.BaseAPI;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import java.io.IOException;
import java.util.List;

import static carsPage.CarsPageLocators.*;


public class CarsPage extends BaseAPI {
    public CarsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_CARS_BUTTON)
    public WebElement carsButton;
    @FindBy(xpath = WEB_ELEMENT_RENTAL_CARS)
    public WebElement rentalCars;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;
    @FindBy(xpath = WEB_ELEMENT_BROOKLYN)
    public WebElement brooklynLocation;
    @FindBy(xpath = WEB_ELEMENT_CHECK_BOX)
    public WebElement checkBox;
    @FindBy(xpath = WEB_ELEMENT_ERROR_MESSAGE)
    public WebElement errorMessage;
    @FindBy(css = WEB_ELEMENT_GENERAL_SEARCH_BUTTON)
    public WebElement generalSearchBox;
    @FindBy(xpath = WEB_ELEMENT_LIST_OF_CARS)
    public WebElement list;
    @FindBy(xpath = WEB_ELEMENT_pick_UP_DATE)
    public WebElement pickUpDate;
    @FindBy(css = WEB_ELEMENT_DROP_OFF_DATE)
    public WebElement dropOffDate;
    @FindBy(xpath = WEB_ELEMENT_GENERAL_SEARCH_LOCATION_BUTTON)
    public WebElement GeneralLocation;

    public void carsButton1() {
        carsButton.click();
    }

    public void rentalCarsButton() {
        rentalCars.click();
    }

    public void searchPickUpButton() {
        searchButton.click();
    }

    public void searchPickUpLocation() {
        sendKeysToElement(searchButton, "brooklyn");
    }

    public void selectBrooklyn() {
        Actions action = new Actions(driver);
        action.moveToElement(brooklynLocation);

    }

    public void selectBrooklynSpot() {
        selectElement(brooklynLocation);

    }

    public void checkBox() {
        selectElement(checkBox);
    }

    public void generalSearchBox() {
        generalSearchBox.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public String getListOfCars() {

        return list.getText();
    }

    public void waitForPage() {
        waitForPageLoad("https://www.expedia.com/Hotel-Search?adults=2&d1=2021-05-02&d2=2021-05-03&destination=Brooklyn%2C%20New%20York%2C%20United%20States%20of%20America&endDate=2021-05-03&latLong=40.637446439755%2C-73.95267221233017&regionId=177851&rooms=1&semdtl=&sort=RECOMMENDED&startDate=2021-05-02&theme=&useRewards=false&userIntent=");

    }

    public String path = "src/test/resources/test_data/Expedia.xlsx";

    @DataProvider
    public Object[][] getTestData2() throws IOException, InvalidFormatException {
        Object data1[][] = DataReader.fileReader4(path, "locations");
        return data1;
    }

    public void enterData(String location) {

        searchButton.click();
    }

    public void Depart(String path, String departDate) {
        WebElement element = driver.findElement(By.xpath(path));
        element.click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','" + departDate + "')", element);
    }

    public void selectPickUpdate() throws Exception {
        Depart(WEB_ELEMENT_pick_UP_DATE, "05-01-2021");
        Thread.sleep(3000);

    }

    public void selectDropOffDate() {
        Return(WEB_ELEMENT_DROP_OFF_DATE, "05-03-2021");

    }

    public void Return(String xpath, String ReturnDate) {
        WebElement element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','" + ReturnDate + "')", element);
    }


    public void selectPickUpLocation() throws Exception{
        sendKey(WEB_ELEMENT_SEARCH_BUTTON, "Bro", WEB_ELEMENT_GENERAL_SEARCH_LOCATION_BUTTON, "Brooklyn");
        Thread.sleep(3000);


    }

    public void sendKey(String path, String key, String Gpath, String element) {
        driver.findElement(By.xpath(path)).click();
        driver.findElement(By.xpath(path)).sendKeys(key);
        List<WebElement> list = driver.findElements(By.xpath(Gpath));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(element))
                list.get(i).click();
            break;
        }
    }
}