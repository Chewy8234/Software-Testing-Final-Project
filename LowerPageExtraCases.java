// Kevin Maximo

package TNGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class LowerPageExtraCases {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    void searchBarTest() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        // Find the search box element by its name attribute and type a search query
        WebElement elem = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        elem.sendKeys("Inflatable Chicken");

        // Submit the search query by pressing Enter on the keyboard
        driver.findElement(By.cssSelector("#nav-search-submit-button")).submit();

        Assert.assertEquals("Amazon.com : Inflatable Chicken", driver.getTitle());

        driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    // Conditions of Use
    @Test(priority = 2)
    void ConditionsOfUseTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        WebElement elem = driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li.nav_first > a"));
        elem.click();
        System.out.println(driver.getTitle());

        Assert.assertEquals("Conditions of Use - Amazon Customer Service", driver.getTitle());

        driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    // Privacy Notice
    @Test(priority = 3)
    void PrivacyNoticeTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        WebElement elem = driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li:nth-child(2) > a"));
        elem.click();

        System.out.println(driver.getTitle());

        Assert.assertEquals("Amazon.com Privacy Notice - Amazon Customer Service", driver.getTitle());

        driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    // Your Ads Privacy Notice
    @Test(priority = 4)
    void YourAdsTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        WebElement elem = driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li.nav_last > a"));
        elem.click();

        System.out.println(driver.getTitle());

        Assert.assertEquals("Your Ads Privacy Choices", driver.getTitle());

        driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    @Test(priority = 5)
    void AllMenuTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(2) > a")));

        menu.click();

        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        driver.close();
        driver.quit();

        Assert.assertEquals("Amazon.com Best Sellers: The most popular items on Amazon", title);
        //driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }
}
