package savingPage;

import  static savingPage.SavingsLocators.*;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utilities.DataReader;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Savings extends BaseAPI {
DataReader dataReader = new DataReader();



    public Savings(){
   PageFactory.initElements(driver, SavingsLocators.class);
}


public void clickOnSavings(){
        waitForVisibilityOfElement(saving);
        saving.click();
}

public void clickonOnlineBanking(){
        waitForVisibilityOfElement(onlineBanking_savings);
        onlineBanking_savings.click();
}
public void dropDownMenu(){
        menu.click();
}
public List<String> getTopFeatures(){
        clickonOnlineBanking();
        dropDownMenu();
    List<String> list = getElements(topFeatures);

    return  list;
}
public void getMobileAndOnlineResources(){
    clickonOnlineBanking();
    dropDownMenu();
    List<String> list = getElements(mobileAndResources);
    System.out.println(list);
}

public void searchBoxData(){
        String[] data = new String[0];
    try {
        data =dataReader.fileReaderStringXSSF("src/main/java/TestData/bankOfAmerica.xlsx", "Sheet1");
    }
    catch (Exception e){}

    searchBox.sendKeys(data[0]);
}
public void clickSignIN(){
        clickonOnlineBanking();
        signin.click();
}
public void sendSignInCredentials(){
        clickSignIN();
        waitForVisibilityOfElement(onlineID);
        onlineID.sendKeys("hello");
    waitForVisibilityOfElement(passcode);
    passcode.click();
    waitForElementToBeClickable(passcode);
        passcode.sendKeys("world");
}
public void verifyBrokenLinksSavings(){
       try{get_ALL_PageLinks();}
       catch (Exception e ){}
}
public void clickOnlinedInIcon(){
Set<String> set = new HashSet();
        scrollToElementJScript(linkedinIcon);
    waitForVisibilityOfElement(linkedinIcon);
    waitForElementToBeClickable(linkedinIcon);
//set =driver.getWindowHandles();
//    Iterator<String> it = set.iterator();
//String parent = it.next();
//String child = it.next();

driver.switchTo().frame(0);


}
}
