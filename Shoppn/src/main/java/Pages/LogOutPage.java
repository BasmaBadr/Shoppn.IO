package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends PageBase {
    public LogOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[26]/a/span[1]/span")
    public WebElement logOut;

    public void logoutfromshoppn()
    {
        scrollToElement(logOut);
        clickButton(logOut);

    }
}
