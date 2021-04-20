package carsPage;
import common.BaseAPI;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import java.io.IOException;

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








}
