// Jie Zhou

package TNGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BottomLinks {
    //public System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");

    ChromeDriver Cdriver = new ChromeDriver();
    @Test
    void testOne() throws InterruptedException {
        System.out.println("Verifying Amazon Music Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");

        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Music")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon Music Unlimited | Stream 100 Million Songs & Podcasts",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 2)
    void testTwo() throws InterruptedException {
        System.out.println("Verifying Amazon Business Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Business")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon.com: Amazon Business American Express Card",Cdriver.getTitle(),"Title not matched");


    }
    @Test(priority = 3)
    void testThree() throws InterruptedException {
        System.out.println("Verifying Audible Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Audible")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Audible Membership Trial - Sign up | Amazon.com",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 4)
    void testFour() throws InterruptedException {
        System.out.println("Verifying Goodreads Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Goodreads")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Goodreads | Meet your next favorite book",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 5)
    void testFive() throws InterruptedException {
        System.out.println("Verifying Shopbop Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Shopbop")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon.com: The Shop by Shopbop",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 6)
    void testSix() throws InterruptedException {
        System.out.println("Verifying eero WiFi Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("eero WiFi")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("eero - Finally, wifi that works",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 7)
    void testSeven() throws InterruptedException {
        System.out.println("Verifying Amazon Advertising Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Advertising")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon Ads: Online advertising for businesses of all sizes",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 8)
    void testEight() throws InterruptedException {
        System.out.println("Verifying Amazon Fresh Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Fresh")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon Fresh Groceries",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 9)
    void testNine() throws InterruptedException {
        System.out.println("Verifying Book Depository Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Book Depository")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Book Depository: Free delivery worldwide on over 20 million books",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 10)
    void testTen() throws InterruptedException {
        System.out.println("Verifying IMDb Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("IMDb")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 11)
    void testEleven() throws InterruptedException {
        System.out.println("Verifying Amazon Warehouse Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Warehouse")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon Warehouse | Great deals on quality used products",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 12)
    void testTwelve() throws InterruptedException {
        System.out.println("Verifying Blink Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Blink")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Blink Smart Security",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 13)
    void testThirteen() throws InterruptedException {
        System.out.println("Verifying 6pm Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("6pm")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Discount Shoes, Clothing & Accessories | 6pm",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 14)
    void testFourteen() throws InterruptedException {
        System.out.println("Verifying AmazonGlobal Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("AmazonGlobal")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon International shopping and shipping made easy",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 15)
    void testFifteen() throws InterruptedException {
        System.out.println("Verifying Box Office Mojo Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Box Office Mojo")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Home - Box Office Mojo",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 16)
    void testSixteen() throws InterruptedException {
        System.out.println("Verifying IMDbPro Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("IMDbPro")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("IMDbPro Official Site | Start Your Free Trial",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 17)
    void testSeventeen() throws InterruptedException {
        System.out.println("Verifying Whole Foods Market Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Whole Foods Market")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Whole Foods Market | Whatever Makes You Whole",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 18)
    void testEighteen() throws InterruptedException {
        System.out.println("Verifying Neighbors App Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Neighbors App")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Neighbors App by Ring | Real-Time Crime & Safety Alerts | Ring",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 19)
    void testNineteen() throws InterruptedException {
        System.out.println("Verifying AbeBooksp Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("AbeBooks")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("AbeBooks | Shop for Books, Art & Collectibles",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 20)
    void testTwenty() throws InterruptedException {
        System.out.println("Verifying Home Services Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Home Services")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Amazon.com: Home & Business Services",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 21)
    void testTwentyOne() throws InterruptedException {
        System.out.println("Verifying ComiXology Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("ComiXology")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Read Comics, Graphic Novels, Manga and More",Cdriver.getTitle(),"Title not matched");
    }
    @Test(priority = 22)
    void testTwentyTwo() throws InterruptedException {
        System.out.println("Verifying Kindle Direct Publishing Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Kindle Direct Publishing")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Self Publishing | Amazon Kindle Direct Publishing",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 23)
    void testTwentyThree() throws InterruptedException {
        System.out.println("Verifying Woot! Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Woot!")).click();
        System.out.println(Cdriver.getTitle());
        Assert.assertEquals("Woot",Cdriver.getTitle(),"Title not matched");
    }

    @Test(priority = 24)
    void testTwentyFour() throws InterruptedException {
        System.out.println("Verifying Amazon Subscription Boxes Link");
        System.setProperty("webdriver.chrome.driver","/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");


        Cdriver.get("https://www.amazon.com/ref=nav_logo");
        Cdriver.manage().window().maximize();

        Cdriver.executeScript("window.scrollBy(0,6300)", "");
        Cdriver.findElement(By.partialLinkText("Amazon Subscription Boxes")).click();
        System.out.println(Cdriver.getTitle());
        String title = Cdriver.getTitle();
        Cdriver.close();
        Cdriver.quit();
        Assert.assertEquals("Amazon Subscription Boxes – Choose from hundreds of boxes",title,"Title not matched");
    }
}
