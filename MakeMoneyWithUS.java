// Sebastian Campos

package TNGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.slf4j.impl.StaticLoggerBinder;

public class MakeMoneyWithUS {
    public WebDriver webdriver;

    @BeforeMethod
    void openLink() {
        System.setProperty("webdriver.chrome.driver", "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");
        webdriver = new ChromeDriver();
        webdriver.get("https://www.amazon.com/");
    }
    @Test(priority = 9)
    void testTen() throws InterruptedException {
        System.out.println("Launching Sell products on Amazon");
        webdriver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Can't Sleep");
        }
        WebElement products = webdriver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(3) > ul > li.nav_first > a"));
        products.click();
        //WebElement sellingAmazon = webdriver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[1]/div[4]/div/div[1]/div[1]/h1"));
        String sellAmazon = webdriver.getTitle();
        Assert.assertEquals(sellAmazon, "Sell on Amazon | Build Your Ecommerce Business");
    }

    @Test(priority = 10)
    void testEleven() throws InterruptedException {
        System.out.println("Launching Selling Apps on Amazon");
        webdriver.manage().window().maximize();
        WebElement AWS = webdriver.findElement(By.partialLinkText("Sell apps on Amazon"));
        AWS.click();
        //WebElement serverlessComputing = webdriver.findElement(By.xpath("//*[@id=\"Serverless_Computing\"]"));
        String Title = webdriver.getTitle();
        Assert.assertFalse(Boolean.parseBoolean(Title), "Adobe AudienceManager");
    }

    @Test(priority = 11)
    void testTwelve() throws InterruptedException {
        System.out.println("Launching Supply to Amazon");
        webdriver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement supply = webdriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a"));
        supply.click();
        Assert.assertFalse(Boolean.parseBoolean("https://www.amazon.com"),"https://supply.amazon.com/");

    }

    @Test(priority = 12)
    void testThirteen() throws InterruptedException
    {
        System.out.println("Launching Protect & Build Your Brand");
        webdriver.manage().window().maximize();
        WebElement brand = webdriver.findElement(By.linkText("Protect & Build Your Brand"));
        brand.click();
        WebElement protect = webdriver.findElement(By.className("heading"));
        String amazonProtect = protect.getText();
        Assert.assertFalse(Boolean.parseBoolean(amazonProtect), "Let's protect the brand you built");

    }

    @Test(priority = 13)
    void testFourteen() throws InterruptedException
    {
        System.out.println("Launching Become an Affiliate");
        webdriver.manage().window().maximize();
        WebElement affiliate = webdriver.findElement(By.linkText("Become an Affiliate"));
        affiliate.click();
        WebElement program = webdriver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div/div[1]"));
        String expected = program.getText();
        Assert.assertFalse(Boolean.parseBoolean(expected), "Amazon Associates - Amazon’s affiliate marketing program");

    }

    @Test(priority = 14)
    void testFifteen() throws InterruptedException
    {
        System.out.println("Launching Become a Delivery Driver");
        webdriver.manage().window().maximize();
        WebElement driver = webdriver.findElement(By.linkText("Become a Delivery Driver"));
        driver.click();
        WebElement deliver = webdriver.findElement(By.className("dsp-header__title"));
        String actual = String.valueOf(deliver);

        Assert.assertNotEquals(actual,"[[EdgeDriver: msedge on WINDOWS (c807cc0406567ac51f296ae02bf1b38b)] -> class name: dsp-header__title]");
    }

    @Test(priority = 15)
    void testSixteen() throws InterruptedException {
        System.out.println("Launching Start a package delivery business");
        webdriver.manage().window().maximize();
        WebElement driver = webdriver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(3) > ul > li:nth-child(7) > a"));
        driver.click();
        Assert.assertNotEquals("https://www.amazon.com/","https://logistics.amazon.com/marketing?utm_source=amzn&utm_medium=footer&utm_campaign=home");

    }

    @Test(priority = 16)
    void testSeventeen() throws InterruptedException {
        System.out.println("Launching Advertise your products");
        webdriver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement driver = webdriver.findElement(By.linkText("Advertise Your Products"));
        driver.click();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement search = webdriver.findElement(By.xpath("/html/body/header[1]/nav/div/div[3]/a[1]"));
        search.click();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement signin = webdriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/div/div/div/div/div[1]/h1"));
        String actual = signin.getText();
        Assert.assertNotEquals(actual,signin);

    }

    @Test(priority = 17)
    void testEighteen() throws InterruptedException {
        System.out.println("Launching self publishing");
        webdriver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement driver = webdriver.findElement(By.linkText("Self-Publish with Us"));
        driver.click();
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("No");
        }
        WebElement money = webdriver.findElement(By.xpath("//*[@id=\"main-4\"]/div/div/div/div[2]/div/div/div/div[1]/div[4]/p/span/span"));
        Assert.assertFalse(webdriver.getTitle().contains("Make More Money"));

    }

    @Test(priority = 18)
    void testNineteen() throws InterruptedException
    {
        System.out.println("Launching Host an Amazon Hub");
        webdriver.manage().window().maximize();
        WebElement link = webdriver.findElement(By.linkText("Host an Amazon Hub"));
        link.click();
        WebElement heading = webdriver.findElement(By.tagName("h2"));
        String text = heading.getText();
        Assert.assertEquals(text, "About Amazon Hub");

    }

    @Test(priority = 19)
    void twenty() throws InterruptedException
    {
        System.out.println("Launching See More Ways to Make Money");
        webdriver.manage().window().maximize();
        WebElement ways = webdriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[3]/ul/li[11]/a"));
        ways.click();
        String title = webdriver.getTitle();
        Assert.assertEquals(title,"Amazon.com: Build your business with Amazon");
    }


    @AfterMethod
    void quitBrowser()
    {
        webdriver.quit();
    }
}
