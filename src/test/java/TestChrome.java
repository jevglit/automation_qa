import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestChrome {

    ChromeDriver driver = new ChromeDriver();


    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();

    }

    @Test
    public void chromneTest() {
        driver.get("https://google.lv/?hl=en");

        WebElement acceptButton = driver.findElement(By.xpath("//button//div[contains(text(), 'Accept all')]"));
        acceptButton.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("acodemy");

        searchField.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), "acodemy - Google Search");

        System.out.println();

        driver.close();
        driver.quit();



    }
}
