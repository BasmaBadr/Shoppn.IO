package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class AdvancedProductPage extends PageBase {
    public AdvancedProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'المنتجات')]")
    WebElement productsTab;
    @FindBy(xpath = "//span[contains(text(),'اضافة منتج متقدم')]")
    WebElement advancedProductTab;
    @FindBy(xpath = "//h3[@class=\"mb-5 text-darkBlue\"]")
   public WebElement advancedProductText;

    public void openAdvancedProductTab(){
        clickButton(productsTab);
        clickButton(advancedProductTab);
    }

}
