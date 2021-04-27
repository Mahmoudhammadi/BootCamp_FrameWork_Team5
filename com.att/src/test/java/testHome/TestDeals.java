package testHome;

import common.BaseAPI;
import homePage.Deals;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDeals extends BaseAPI {
    public Deals deals = new Deals();

    @BeforeMethod
    public void init() throws InterruptedException {
        deals = PageFactory.initElements(driver,Deals.class);
        deals.accessToDeals();
    }

    @Test(enabled = false)
    public void homePageLogoTest(){
        deals.clickOnLogo();
        String expectedUrl ="https://www.att.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"not matched url");
    }

    @Test(enabled = false)
    public void whyAttBurgerMenuWireless(){
        deals.wirelessMenu();
        String expectedResult="https://www.att.com/why-att/";
        String actualResult =driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL not match");
    }
    @Test(enabled = false)
    public void equipementBurgerMenuTest() throws InterruptedException {
        deals.internetBurgerMenu();
        String expectedResult="https://www.att.com/wi-fi/";
        String actualResult =driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult,"URL not match");
    }

    @Test(enabled = false)
    public void tvTest() throws InterruptedException {
        deals.tvclick();
        boolean expectedResult = true;
        //Direct Tv is visible only if we have access to tv page
        boolean actualResult = driver.findElement(By.xpath("//*[@id=\"HEADBAND06\"]/span/a")).isDisplayed();
        Assert.assertEquals(actualResult,expectedResult,"Direct TV is not visible");
    }

    @Test
    public void searchBoxTest(){
        deals.searchBox();
        boolean  expectedResult= true ;
        String result = driver.findElement(By.xpath("//*[@id=\"Tab-tab-0\"]/div/div/div/div/div[1]/div")).getText();
        boolean actualResult = result.contains("iphone 5g");

        Assert.assertEquals(actualResult,expectedResult,"Iphone 5g");
    }
}
