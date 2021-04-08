import common.BaseAPI;
import homePage.HomePageExpedia;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestPackages extends BaseAPI {

    HomePageExpedia homePageExpedia;

    @Test ()
    public void Packages() throws Exception {
     homePageExpedia = new HomePageExpedia();
     driver.wait(9000);
     homePageExpedia.leavingFrom();
     homePageExpedia.leavingto();
       homePageExpedia.setPackages();
        homePageExpedia.setAccomodation();
       homePageExpedia.setSearch();

    }

}
