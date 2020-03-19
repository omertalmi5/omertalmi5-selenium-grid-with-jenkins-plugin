import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.setProperty;
import static org.openqa.selenium.remote.DesiredCapabilities.chrome;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver() throws MalformedURLException {
        String host = "localhost";
        DesiredCapabilities desiredCapabilities = chrome();

        if(System.getProperty("HUB_HOST") != null)
        {
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";

        this.driver = new RemoteWebDriver(new URL(completeUrl), desiredCapabilities);
    }

    @AfterTest
    public void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
