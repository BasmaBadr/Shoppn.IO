package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPartyPage extends PageBase {
    public ThirdPartyPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'المنتجات')]")
    WebElement productsTab;
    @FindBy(xpath = "//span[contains(text(),'الربط مع طرف ثالث')]")
    WebElement thirdPartTab;
    @FindBy(xpath = "//h3[@class=\"card-title text-darkBlue\"]")
   public WebElement thirdPartyText;

    public void openThirdPartyTab(){
        clickButton(productsTab);
        clickButton(thirdPartTab);
    }
}
