package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleProductPage extends PageBase {
    public SimpleProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'المنتجات')]")
    WebElement productsTab;
    @FindBy(xpath = "//span[contains(text(),'اضافة منتج بسيط')]")
    WebElement simpleproducttab;
    @FindBy(xpath ="//h3[@class=\"mb-5 text-darkBlue\"]")
    public WebElement simpleProductText;

    public void openSimpleProductTab(){
        clickButton(productsTab);
        clickButton(simpleproducttab);
    }


}
