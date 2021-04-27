package utilities;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener extends BaseAPI implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("ATTEMPTING TO NAVIGATE TO:>>>>> " + s );
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("SUCCESSFULLY NAVIGATED TO:>>>>> " + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("ATTEMPTING TO NAVIGATE BACK TO:>>>>> " + webDriver);
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("SUCCESSFULLY NAVIGATED BACK TO:>>>>> " + webDriver);
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("ATTEMPTING TO NAVIGATE FORWARD TO:>>>>> " + webDriver);
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("SUCCESSFULLY NAVIGATED FORWARD TO:>>>>> " + webDriver);
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("ATTEMPTING TO NAVIGATE/REFRESH :>>>>> " + webDriver);
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("SUCCESSFULLY NAVIGATED/REFRESHED :>>>>> " + webDriver);
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("ATTEMPTING TO LOCATE:>>>>> " + webElement + " " + "USING >>>>" + by );
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("SUCCESSFULLY LOCATED:>>>>> " + webElement + " " +"USING >>>>" + by);
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("ATTEMPTING TO CLICK:>>>>> " + webDriver );
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("SUCCESSFULLY CLICKED ON: >>>>> "
                + webElement );
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("ATTEMPTING TO SWITCH TO WINDOW :>>>>> " + s );
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("SUCCESSFULLY SWITCHED TO WINDOW: " + s);
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {
        System.out.println("ATTEMPTING TO GET TEXT :>>>>> " + webElement );
    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("SUCCESSFULLY GOT TEXT: >>>>>" + s);
    }
}
