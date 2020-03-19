package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends AbstractPage {

    private final String PAGE_URL = "http://newtours.demoaut.com/";

    @FindBy(name = "userName")
    private WebElement firstNameTxt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        this.driver.get(PAGE_URL);
        this.wait.until(visibilityOf(this.firstNameTxt));
    }

    public void login()
    {
        this.firstNameTxt.sendKeys("Omer");
    }
}
