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


public class getToKnowUS {
    public WebDriver webdriver;

    @BeforeMethod
    void openLink() {
        System.setProperty("webdriver.chrome.driver", "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");
        webdriver = new ChromeDriver();
        webdriver.get("https://www.amazon.com/");
    }
    @Test(priority = 0)
    void testOne() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ellgramar/Documents/TestNGSelenium/chromedriver_mac_arm64/chromedriver");
        webdriver = new ChromeDriver();
        webdriver.get("https://www.amazon.com/");
        System.out.println("Launching Amazon Careers");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement career = webdriver.findElement((By.linkText("Careers")));
        career.click();

        WebElement pageTitle = webdriver.findElement(By.tagName("h1"));
        String actualTitle = pageTitle.getText();
        String expectedTitle = "Find jobs";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority = 1)
    void testTwo () throws InterruptedException
    {
        System.out.println("Launching Amazon NewsLetter");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement news = webdriver.findElement((By.linkText("Amazon Newsletter")));
        news.click();

        WebElement title = webdriver.findElement(By.tagName("h2"));
        String titleActual = title.getText();
        String expectedTitle2 = "Amazon News";

        Assert.assertEquals(titleActual,expectedTitle2);
    }

    @Test(priority = 2)
    void testThree() throws InterruptedException
    {
        System.out.println("Launching About Amazon");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        try{
            Thread.sleep(2000);
        } catch (Exception E){
            System.out.println("No");
        }
        WebElement about = webdriver.findElement(By.partialLinkText("About Amazon"));
        about.click();
        WebElement newsfeedTitle = webdriver.findElement(By.className("HubListCarousel-title"));
        String titleActual = newsfeedTitle.getText();
        String expectedTitle = "NEWSFEED";
        Assert.assertEquals(titleActual, expectedTitle);
    }
    @Test(priority = 3)
    void testFour() throws InterruptedException
    {
        System.out.println("Launching Accessibility");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement access = webdriver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li:nth-child(4) > a"));
        access.click();
        WebElement searchAmazon = webdriver.findElement(By.id("twotabsearchtextbox"));
        searchAmazon.sendKeys("Amazon");
        searchAmazon.submit();
        
        String expectedTitle = "Amazon - Search Results";
        String actualTitle = webdriver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedTitle));
    }

    @Test(priority = 4)
    void testFive() throws InterruptedException
    {
        System.out.println("Launching Sustainability");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement sustainability = webdriver.findElement(By.cssSelector("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li:nth-child(5) > a"));
        sustainability.click();
        WebElement sustainabilityTitle = webdriver.findElement(By.cssSelector(".Page-header-complimentary-text"));
        String actualTitle = sustainabilityTitle.getText();
        String expectedTitle = "Sustainability";
        Assert.assertEquals(actualTitle, expectedTitle);
        
    }
    @Test(priority = 5)
    void testSix() throws InterruptedException
    {
        System.out.println("Launching Press Center");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement pressCenter = webdriver.findElement((By.linkText("Press Center")));
        pressCenter.click();
        WebElement pressRelease = webdriver.findElement(By.xpath("/html/body/div/div[1]/div/h1"));
        String actualTitle = pressRelease.getText();
        String expectedTitle = "Press release archive";
        Assert.assertEquals(actualTitle,expectedTitle, "It Matches!");
        
    }

    @Test(priority = 6)
    void testSeven() throws InterruptedException
    {
        System.out.println("Launching Investor Relations");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement investor = webdriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a"));
        investor.click();
        WebElement title = webdriver.findElement(By.xpath("//*[@id=\"_ctrl0_ctl51_divModuleContainer\"]/div/div[1]/div[1]"));
        String titleActual = title.getText();
        Assert.assertEquals(titleActual, "NASDAQ: AMZN");
        
    }

    @Test(priority = 7)
    void testEight() throws InterruptedException
    {
        System.out.println("Launching Amazon Devices");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement device = webdriver.findElement(By.linkText("Amazon Devices"));
        device.click();
        WebElement search = webdriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Alexa");
        search.submit();
        
        WebElement searchResult = webdriver.findElement(By.linkText("All-New Echo Dot (5th Gen, 2022 release) | Smart speaker with Alexa | Charcoal"));
        Assert.assertTrue(searchResult.isDisplayed());
    }
    @Test(priority = 8)
    void testNine() throws InterruptedException
    {
        System.out.println("Launching Amazon Science");
        webdriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("No");
        }
        WebElement science = webdriver.findElement(By.linkText("Amazon Science"));
        science.click();
        WebElement customerScience = webdriver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div[1]/h1"));
        String customer = customerScience.getText();
        String expected = "Customer-obsessed science";
        Assert.assertEquals(customer,expected);
        

    }
    @AfterMethod
    void quitBrowser()
    {
        webdriver.quit();
    }
}
