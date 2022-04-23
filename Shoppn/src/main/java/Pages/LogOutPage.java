package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends PageBase {
    public LogOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class=\"svg-icon menu-icon\"]")
    public WebElement logOut;

    public void clickLogout()
    {
        clickButton(logOut);

    }
}
