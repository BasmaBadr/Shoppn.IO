package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorePage extends PageBase {
    public StorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href=\"https://webstdy-011.shoppn.io/dashboard/store\"]")
   public WebElement storeTab;

    @FindBy(xpath = "//h4[contains(text(),'القوالب')]")
   public WebElement storeTxt;

    public void openStoreTab(){
        scrollToElement(storeTab);
        clickButton(storeTab);
    }


}
