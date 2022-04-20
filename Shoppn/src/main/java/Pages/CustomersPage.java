package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends PageBase{
    public CustomersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'العملاء')]")
    WebElement CustomersTab;
    @FindBy(xpath = "//h3[contains(text(),'العملاء')]")
    public WebElement MessageText;

    public void openCustomersTab(){
        clickButton(CustomersTab);
    }
}
