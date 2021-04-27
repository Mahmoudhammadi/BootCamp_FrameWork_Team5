package testHome;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestHomePage {
    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/apple/IdeaProjects/SeleniumPractice_first/src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Ebay.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gloves");
        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement element=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]"));
        String actual=element.getText();
        Assert.assertEquals(actual,"\"gloves\"");
        Thread.sleep(3000);
        driver.close();
    }
    public static void main(String[] args)throws InterruptedException {
        setup();
    }

}
