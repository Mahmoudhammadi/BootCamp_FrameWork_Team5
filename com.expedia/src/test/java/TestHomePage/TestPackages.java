package TestHomePage;

import common.BaseAPI;
import homePage.HomePageExpedia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static homePage.PackagesLocators.*;

public class TestPackages extends BaseAPI {

    public HomePageExpedia homePageExpedia= new HomePageExpedia();;


    @BeforeMethod
    public void init(){
        homePageExpedia = PageFactory.initElements(driver,HomePageExpedia.class);
        homePageExpedia.clickOnPackages();
    }


    @Test
    public void leavingFrom() throws Exception {
        WebElement fromzone = driver.findElement(By.xpath("//*[@id=\"location-field-origin\"]"));
     homePageExpedia.leavingFrom();
     String testresult="jfk";
        homePageExpedia.leavingFrom.sendKeys(" jfk");

     //homePageExpedia.clickOnsuggestionsElementDropDown(FromPackagesdropDownSuggestions,testresult);
     Thread.sleep(2000);
     String expectedResult ="New York (NYS - Skyports Seaplane Base)";
     String actualResult = fromzone.getAttribute("value");
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult);
     /*homePageExpedia.leavingto();
       homePageExpedia.setPackages();
        homePageExpedia.setAccomodation();
       homePageExpedia.setSearch();*/

    }
    @Test
    public void leavingTo() throws Exception {
        WebElement tozone = driver.findElement(By.xpath("//*[@id=\"location-field-destination-input\"]"));
        homePageExpedia.leavingto();
        String testresult="miami";
        homePageExpedia.leavingto.sendKeys(testresult);
        Thread.sleep(2000);
        //homePageExpedia.clickOnsuggestionsElementDropDown(toPackagesdropDownSuggestions,testresult);
        Thread.sleep(2000);
        String expectedResult ="miami";
        String actualResult = tozone.getAttribute("value");
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult);
     /*homePageExpedia.leavingto();
       homePageExpedia.setPackages();
        homePageExpedia.setAccomodation();
       homePageExpedia.setSearch();*/

    }

}
