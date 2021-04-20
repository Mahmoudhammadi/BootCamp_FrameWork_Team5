package testCarsPage;
import carsPage.CarsPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testHome.TestHomePage;

import java.io.IOException;
import java.sql.SQLException;

import static carsPage.CarsPageLocators.*;

public class TestCarsPage extends BaseAPI {
    CarsPage home7;

    @Test(enabled = false)
    public void testSelectLocation(){
        home7 = new CarsPage();
        home7.carsButton1();
        home7.rentalCarsButton();
        home7.rentalCarsButton();
        home7.searchPickUpLocation();
        home7.selectBrooklyn();
        Assert.assertTrue(isElementDisplayed(home7.brooklynLocation));
    }
    @Test(enabled = false)
    public void testCheckBox(){
        home7=new CarsPage();
        home7.carsButton1();
        home7.rentalCarsButton();
        home7.rentalCarsButton();
        home7.searchPickUpLocation();
        home7.selectBrooklyn();
        home7.selectBrooklynSpot();
        home7.checkBox();
       Assert.assertTrue(isElementSelected(home7.checkBox));
    }
    @Test(enabled = false)
    public void testErrorMessage(){
        home7=new CarsPage();
        home7.carsButton1();
        home7.rentalCarsButton();
        home7.rentalCarsButton();
        home7.generalSearchBox();
        home7.getErrorMessage();
        String actualResult= home7.getErrorMessage();
        String expectedResult="To continue, please correct the 2 errors below.";

        Assert.assertEquals(actualResult,expectedResult,"text not match");

    }
    @Test(enabled = false)
    public void testListOfCars(){
        home7=new CarsPage();
        home7.carsButton1();
        home7.rentalCarsButton();
        home7.searchPickUpLocation();
        home7.selectBrooklyn();
        home7.selectBrooklynSpot();
        home7.generalSearchBox();
        home7.waitForPageLoad("https://www.expedia.com/carsearch?locn=Brooklyn&loc2=&date1=5%2F2%2F2021&date2=5%2F3%2F2021&d1=2021-05-02&d2=2021-05-03&aarpcr=off&vend=&pickupIATACode=NYC&dpln=177851&returnIATACode=&drid1=&time1=1030AM&time2=1030AM&dagv=1&subm=1&fdrp=0&ttyp=2&acop=2&rdus=10&rdct=1&styp=4");
        home7.getListOfCars();
        String actualResult= home7.getListOfCars();
        String expectedResult="Filter by";

        Assert.assertEquals(actualResult,expectedResult,"text not match");

    }
    @Test(dataProviderClass = CarsPage.class, dataProvider = "getTestData2")
    public void testSearchBox(String location) throws SQLException, IOException, ClassNotFoundException, InterruptedException {

        home7 = new CarsPage();
        home7.carsButton1();
        home7.rentalCarsButton();
        home7.enterData(location);

    }




}
