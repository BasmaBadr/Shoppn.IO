package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends PageBase{
    public CustomersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[text()='العملاء'")
    WebElement CustomersTab;
    @FindBy(xpath = "//span[text()='لا يوجد محفوظات']")
    public WebElement MessageText;

    public void openCustomersTab(){
        clickButton(CustomersTab);
    }
}
