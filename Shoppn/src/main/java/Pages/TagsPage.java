package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagsPage extends PageBase {
    public TagsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'وسوم المنتجات')]")
    WebElement tagsTab;
    @FindBy(xpath = "//h3[contains(text(),'قائمة وسوم المنتجات')]")
   public WebElement tagsText;

    public void openTagsTab(){
        clickButton(tagsTab);
    }
}
