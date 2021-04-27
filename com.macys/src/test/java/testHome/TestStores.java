package testHome;

import common.BaseAPI;
import homePage.Stores;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStores extends BaseAPI {
//Stores stores1;
@Test(enabled = false)
    public void TestclickStores(){
   Stores stores1= new Stores();
    stores1.clickStores();
    String expectedResult="Find a Macy's Store";
    String actualResult=stores1.ValidateStoresPage();
    Assert.assertEquals(expectedResult,actualResult);


}
@Test
    public void TestMyAccount(){
    Stores stores1= new Stores();
    stores1.clickStores();
    stores1.MyAccount();
    String Expected="Secure Sign In";
    String actual=stores1.ValidateWallet();
    Assert.assertEquals(Expected,actual);

}



}
