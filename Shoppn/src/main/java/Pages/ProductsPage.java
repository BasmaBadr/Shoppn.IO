package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'المنتجات')]")
    WebElement productsTab;
    @FindBy(xpath = "//span[contains(text(),'قائمة المنتجات')]")
    WebElement productsList;
    @FindBy(xpath = "//h3[contains(text(),'المنتجات')]")
   public WebElement productsText;


    public void openProductsTab(){
        clickButton(productsTab);
        clickButton(productsList);
    }
}
