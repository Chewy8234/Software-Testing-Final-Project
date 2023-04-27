// Elliot Marshall

package TNGS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageLoads {
    public String baseurl = "https://www.amazon.com";
    public String driverpath = "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver";
    public WebDriver driver = new ChromeDriver();

    // list

    @Test
    public void verifySiteLoads() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver.get(baseurl);
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }
}
