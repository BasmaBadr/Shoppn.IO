package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttributeCategoriesPage extends PageBase {
    public AttributeCategoriesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'فئات الخصائص')]")
    WebElement attributeTab;
    @FindBy(xpath = "//h3[contains(text(),'الخصائص')]")
    public WebElement attributeText;

    public void openAttributeTab(){
        clickButton(attributeTab);
    }
}

