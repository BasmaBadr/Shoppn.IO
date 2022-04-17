package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends PageBase {
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'الاقسام')]")
    WebElement categoriesTab;
    @FindBy(xpath = "//h3[contains(text(),'الاقسام')]")
    public WebElement categoriesText;

    public void openCategoriesTab(){
        clickButton(categoriesTab);
    }
}
