package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Abandoned_cartsPage extends PageBase {
    public Abandoned_cartsPage(WebDriver driver) {
        super(driver);
    }
   @FindBy(xpath = "//span[contains(text(),'السلات المهجورة')]")
    WebElement abandonedtab;
    @FindBy(xpath = "//h3[@class=\"card-title text-darkBlue mb-0\"]")
   public WebElement abandonedText;

    public void openAbandonedTab(){
        clickButton(abandonedtab);
    }
}
