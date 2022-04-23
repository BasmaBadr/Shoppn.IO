package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends PageBase {
    public LogOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy()
    WebElement logOut;

    public void clickLogout()
    {
        clickButton(logOut);

    }
}
