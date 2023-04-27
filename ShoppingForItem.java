// Elliot Marshall

package TNGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingForItem {
    public String baseurl = "https://www.amazon.com";
    public String driverpath = "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver";
    public WebDriver driver = new ChromeDriver();
    public String item = "lamp";
    // Navigate to the main Site
    @Test(priority = 0)
    public void loadPage(){
        System.out.println("Loading Main Page");
        driver.get(baseurl);
        driver.manage().window().maximize();
        Assert.assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }
    // find searchbox and populate it with item
    @Test(priority = 1)
    public void findSearchBox(){
        System.out.println("Populating searchbox with "+item);
        driver.get(baseurl);
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys(item);
        Assert.assertEquals(item,searchbox.getAttribute("value"));
    }
    // find and click the search button
    @Test(priority = 2)
    public void clickSearch(){
        System.out.println("Populating searchbox with "+item);
        driver.get(baseurl);
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys(item);
        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
        // check if we have moved to a new page
        Assert.assertNotEquals(baseurl,driver.getCurrentUrl());
    }
    // Click on the first Item for sale
    @Test(priority = 3)
    public void chooseItem(){
        System.out.println("Selecting firstItem");
        driver.get(baseurl);
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys(item);
        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
        WebElement firstItem = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a"));
        //Store current page URL for later
        String searchURL = driver.getCurrentUrl();
        firstItem.click();
        // verify that we are on a different page
        Assert.assertNotEquals(searchURL,driver.getCurrentUrl());
    }
}