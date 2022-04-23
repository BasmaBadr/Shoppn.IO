package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileDetailsPage extends PageBase {
    public ProfileDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//p[contains(text(),'الملف الشخصي')]")
    //a[@href="https://webstdy-011.shoppn.io/dashboard/profile/profile-details"]
    WebElement profileDetailsTab;

    @FindBy(xpath = "//button[contains(text(),' حفظ التغييرات')]")
    public WebElement saveBtn;

    public void openProfileDetailsTab()
    {
        clickButton(profileDetailsTab);
    }
}
