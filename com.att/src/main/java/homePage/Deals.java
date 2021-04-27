package homePage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class Deals extends BaseAPI {

    public Deals(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id=\"HEADBAND00\"]/span/a")
    public  WebElement deals;

    public void accessToDeals() throws InterruptedException {
        deals.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    //logo to home page
    @FindBy(how = How.XPATH,using = "//*[@id=\"z1-globe\"]/a")
    public WebElement homePagelogo;
    public void clickOnLogo(){
        homePagelogo.click();
    }
    @FindBy(xpath ="//*[@id='z1-pullMenu-open']")
    WebElement burgerMenu;
    public void dropBurgerMenu(){
        burgerMenu.click();
    }
//INSIDE BURGER MENU
@FindBy(xpath ="//*[@id=\"tab-desktop-menu\"]/li[2]/a")
WebElement burgerMenuWireless;
    public void wirelessMenu(){
        dropBurgerMenu();
        burgerMenuWireless.click();
    }

    //INSIDE BURGER MENU
    @FindBy(xpath ="//*[@id=\"tab-desktop-menu\"]/li[2]/ul/li[4]/a")
    WebElement whyAttWireless;
    public void wirelesswhyAtt() throws InterruptedException {
       wirelessMenu();
        Thread.sleep(2000);
       Actions actions =  new Actions(driver);
       actions.moveToElement(whyAttWireless).click();

    }

    @FindBy(xpath ="//*[@id=\"tab-desktop-menu\"]/li[5]/a")
    WebElement internetBurgerMenu;
    public void internetBurgerMenu() throws InterruptedException {
        dropBurgerMenu();
        internetBurgerMenu.click();

    }
    @FindBy(xpath ="//*[@id=\"tab-desktop-menu\"]/li[5]/ul/li[7]/a")
    WebElement equipementInternetBurgerMenu;
    public void equipementInternet() throws InterruptedException {
        internetBurgerMenu();
        equipementInternetBurgerMenu.click();

    }



    //TV
    @FindBy(xpath ="//*[@id=\"z1-tier1Nav\"]/a[4]")
    WebElement tv;
    public void tvclick() {

       tv.click();

    }

    @FindBy(xpath = "//*[@id=\"z1-searchfield\"]")
    WebElement searchBox;

    public void searchBox(){
        searchBox.sendKeys("iphone 5g");
        searchBox.submit();
    }



}
