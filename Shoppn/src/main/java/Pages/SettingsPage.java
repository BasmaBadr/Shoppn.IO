package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage extends PageBase {
    public SettingsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href=\"https://webstdy-011.shoppn.io/dashboard/settings\"]")
    WebElement settingsTab;

    @FindBy(xpath = "//h3[contains(text(),'الأعدادات')]")
    public WebElement settingsTxt;

    public void openSettingsTab()
    {
        clickButton(settingsTab);
    }
}
