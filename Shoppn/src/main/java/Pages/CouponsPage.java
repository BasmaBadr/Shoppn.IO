package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CouponsPage extends PageBase {

    public CouponsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//span[contains(text(),'اكواد الخصم')]")
    WebElement couponsTab;
    @FindBy(xpath ="//h3[contains(text(),'قائمة اكواد الخصم')]")
   public WebElement couponsText;

    public void openCouponsTab(){
        clickButton(couponsTab);
    }

}
