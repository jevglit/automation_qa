package lv.acodemy.step_definition;

import com.google.j2objc.annotations.Weak;
import io.cucumber.java.en.Given;
import lv.acodemy.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

public class CommonStepDefs {

    private final WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void userOpenUrl(String url) {
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

    }
}
