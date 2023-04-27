// Kevin Maximo

package TNGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class UpperPageExtraLinks {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 8)
    void ReturnsAndOrdersTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        driver.findElement(By.cssSelector("#nav-orders > span.nav-line-2")).click();

        System.out.println(driver.getTitle());

        Assert.assertEquals("Amazon Sign-In", driver.getTitle());

        //driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    @Test(priority = 9)
    void SignInScreenTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        driver.findElement(By.cssSelector("#nav-link-accountList > span")).click();

        System.out.println(driver.getTitle());

        Assert.assertEquals("Amazon Sign-In", driver.getTitle());

        //driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    @Test(priority = 10)
    void LanguageChangeTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        driver.findElement(By.cssSelector("#icp-nav-flyout > span > span.nav-line-2 > span.nav-icon.nav-arrow")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement spanish = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#icp-language-settings > div:nth-child(6) > div > label > i")));

        spanish.click();

        driver.findElement(By.cssSelector("#icp-save-button > span > input")).click();

        System.out.println(driver.getTitle());

        Assert.assertEquals("Change Language Settings", driver.getTitle());

        //driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }

    @Test(priority = 11)
    void searchBarDropDownTest() {

        driver.get("https://www.amazon.com");

        // Find the search box element by its name attribute and type a search query
        // Find the search dropdown element by its ID
        WebElement searchDropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));

        // Create a new Select object with the search dropdown element
        Select dropdown = new Select(searchDropdown);

        // Select the 14th item in the dropdown by index
        dropdown.selectByIndex(13);

        // Find the search box element by its name attribute and type a search query
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Beatles");

        // Submit the search query by pressing Enter on the keyboard
        driver.findElement(By.cssSelector("#nav-search-submit-button")).submit();

        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        driver.close();
        driver.quit();
        Assert.assertEquals("Amazon.com : Beatles", title);

        //driver.findElement(By.cssSelector("#nav-logo-sprites")).click();

    }
}
