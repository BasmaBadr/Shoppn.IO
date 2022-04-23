package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditStoreDesignPage extends PageBase {
    public EditStoreDesignPage(WebDriver driver) {
        super(driver);
    }

     @FindBy(xpath = "//a[@href=\"https://webstdy-011.shoppn.io/dashboard/edit-store-design\"]")
   public WebElement editStoreTab;

    @FindBy(xpath = "//h3[@class=\"card-title text-darkBlue\"]")
   public  WebElement editStoreTxt;

    public void openEditStore(){
        clickButton(editStoreTab);
    }
}
