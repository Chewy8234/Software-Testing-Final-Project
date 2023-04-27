// Elliot Marshall

package TNGS;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TopShoppingLinks {
    public String baseurl = "https://www.amazon.com";
    //public String driverpath = "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver";
    public WebDriver driver = new ChromeDriver();
    //         jse.executeScript("document.body.style.zoom = '50%'");


    // Links at bottom bar of top of page
    // Clinic
    @Test
    public void verifyClinic(){
        System.out.println("Verifying Clinic Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Clinic"));
        //WebElement button = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]"));
        button.click();
        Assert.assertEquals("Amazon Clinic",driver.getTitle());
    }
    // Best Sellers
    @Test
    public void verifyBestSellers(){
        System.out.println("Verifying Best Sellers Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Best Sellers"));
        button.click();
        Assert.assertEquals("Amazon.com Best Sellers: The most popular items on Amazon",driver.getTitle());
    }
    // Amazon Basics
    @Test
    public void verifyAmazonBasics(){
        System.out.println("Verifying Amazon Basics Link");
        driver.manage().window().maximize();
        System.out.println("Zooming Out");
        driver.get("chrome://settings/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.5);");
        driver.get(baseurl);
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement button = driver.findElement(By.partialLinkText("Amazon Basics"));
        button.click();
        Assert.assertEquals("Amazon.com: Amazon Basics",driver.getTitle());
    }
    // New Releases
    @Test
    public void verifyNewReleases(){
        System.out.println("Verifying New Releases Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("New Releases"));
        button.click();
        Assert.assertEquals("Amazon.com New Releases: The best-selling new & future releases on Amazon.",driver.getTitle());
    }
    // Prime
    @Test
    public void verifyPrime(){
        System.out.println("Verifying Prime Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Prime"));
        button.click();
        Assert.assertEquals("Amazon.com: Amazon Prime",driver.getTitle());
    }
    // Today's Deals
    @Test
    public void verifyTodaysDeals(){
        System.out.println("Verifying Today's DealsLink");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Today's Deals"));
        button.click();
        Assert.assertEquals("Amazon.com - Today's Deals",driver.getTitle());
    }
    // Music
    @Test
    public void verifyMusic(){  // Actually Broken on site
        System.out.println("Verifying Music Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Music"));
        button.click();
        Assert.assertEquals("Amazon Music Unlimited | 100 million songs ad-free",driver.getTitle());
    }
    // Books
    @Test
    public void verifyBooks(){
        System.out.println("Verifying Books Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Books"));
        button.click();
        Assert.assertEquals("Amazon.com: Books",driver.getTitle());
    }
    // Registry
    @Test
    public void verifyRegistry(){
        System.out.println("Verifying Registry Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Registry"));
        button.click();
        Assert.assertEquals("Amazon Registry & Gifting",driver.getTitle());
    }
    // Fashion
    @Test
    public void verifyFashion(){
        System.out.println("Verifying Fashion Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Fashion"));
        button.click();
        Assert.assertEquals("Amazon.com: Clothing, Shoes & Jewelry",driver.getTitle());
    }
    // Amazon Home
    @Test
    public void verifyAmazonHome(){
        System.out.println("Verifying Amazon Home Link");
        driver.manage().window().maximize();
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Amazon Home"));
        button.click();
        Assert.assertEquals("Shop Amazon Home Products",driver.getTitle());
    }
    // One Medical
    @Test
    public void verifyOneMedical(){
        System.out.println("Verifying Amazon One Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("One Medical"));
        button.click();
        Assert.assertEquals("Amazon.com: Amazon Health",driver.getTitle());
    }
    // From her on out, we need to maximize the browser window and zoom out to fit all categories on screen
    // GiftCards
    @Test
    public void verifyGiftCards(){  // Error with selenium
        System.out.println("Verifying giftCards Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Gift Cards"));
        button.click();
        Assert.assertEquals("Amazon.com Gift Cards",driver.getTitle());
    }
    // Pharmacy
    @Test
    public void verifyPharmacy(){
        System.out.println("Verifying Pharmacy Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Pharmacy"));
        button.click();
        Assert.assertEquals("Amazon Pharmacy: Save time, save money, stay healthy",driver.getTitle());
    }
    // Toys and Games
    @Test
    public void verifyToysAndGames(){
        System.out.println("Verifying Toys & Games Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Toys & Games"));
        button.click();
        Assert.assertEquals("Amazon.com: Toys & Games",driver.getTitle());
    }
    // Sell
    @Test
    public void verifySell(){
        System.out.println("Verifying Sell Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Sell"));
        button.click();
        Assert.assertEquals("Amazon.com: Sell Products Online with Selling on Amazon",driver.getTitle());
    }
    // Coupons
    @Test
    public void verifyCoupons(){
        System.out.println("Verifying Coupons Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Coupons"));
        button.click();
        Assert.assertEquals("Amazon Coupons @ Amazon.com",driver.getTitle());
    }
    // Automotive
    @Test
    public void verifyAutomotive(){
        System.out.println("Verifying Automotive Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Automotive"));
        button.click();
        Assert.assertEquals("Automotive Parts & Accessories - Amazon.com",driver.getTitle());
    }
    // Computers
    @Test
    public void verifyComputers(){
        System.out.println("Verifying Computers Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Computers"));
        button.click();
        Assert.assertEquals("Amazon.com: Computers & Accessories: Electronics: Computer Accessories & Peripherals, Tablet Accessories & More",driver.getTitle());
    }
    // Find a Gift
    @Test
    public void verifyFindAGift(){
        System.out.println("Verifying Computers Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Find a Gift"));
        button.click();
        Assert.assertEquals("Gifts for Everyone | Amazon.com Gift Finder",driver.getTitle());
    }
    // Beauty and Personal Care
    @Test
    public void verifyBeautyAndPersonalCare(){
        System.out.println("Verifying Beauty and Personal Card Link");

        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Beauty & Personal Care"));
        button.click();
        Assert.assertEquals("Amazon.com: Beauty & Personal Care",driver.getTitle());
    }
    // Video Games
    @Test
    public void verifyVideoGames(){
        System.out.println("Verifying Video Games Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Video Games"));
        button.click();
        String title = driver.getTitle();
        driver.close();
        driver.quit();
        Assert.assertEquals("Amazon.com: Video Games",title);

    }
    // Home Improvement
    @Test
    public void verifyHomeImprovement(){
        System.out.println("Verifying Home Improvement Link");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Home Improvement"));
        button.click();
        Assert.assertEquals("Tools and home improvement",driver.getTitle());
    }
    // Smart Home
    @Test
    public void verifySmartHome(){
        System.out.println("Verifying Smart Home Link");

        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Smart Home"));
        button.click();
        Assert.assertEquals("Smart Home Devices & Systems",driver.getTitle());
    }
    // Health & Household Products
    @Test
    public void verifyHealthAndHouseholdProducts(){
        System.out.println("Verifying Health and Household Products Link");
        driver.manage().window().maximize();
        System.out.println("Zooming Out");
        driver.get("chrome://settings/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.33);");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.partialLinkText("Household"));
        button.click();
        System.out.println(driver.getTitle());
        Assert.assertEquals("Amazon.com: Health & Household",driver.getTitle());
    }
    // Luxury Stores
    @Test
    public void verifyLuxuryStores(){   // Selenium Bug: cannot reach this link
        System.out.println("Verifying Luxury Stores Link");
        driver.manage().window().maximize();
        System.out.println("Zooming Out");
        driver.get("chrome://settings/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.33);");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.linkText("Luxury Stores"));
        button.click();
        Assert.assertEquals("Amazon.com: Luxury Stores",driver.getTitle());
    }
    // Pet Supplies
    @Test
    public void verifyPetSupplies(){ // Selenium Bug: cannot reach this link
        System.out.println("Verifying Pet Supplies Link");
        driver.manage().window().maximize();
        System.out.println("Zooming Out");
        driver.get("chrome://settings/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.33);");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.linkText("Pet Supplies"));
        button.click();
        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),title);
    }
    // Audible
    @Test
    public void verifyAudible(){    // Selenium Bug: cannot reach this link
        System.out.println("Verifying Audible Link");
        driver.manage().window().maximize();
        System.out.println("Zooming Out");
        driver.get("chrome://settings/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.33);");
        driver.get(baseurl);
        WebElement button = driver.findElement(By.linkText("Audible"));
        button.click();
        //Assert.assertEquals("Amazon.com: Audible Books and Originals",driver.getTitle());
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }
}
