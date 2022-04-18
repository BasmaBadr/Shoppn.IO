package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends PageBase{
    public OrdersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[text()='الطلبات']")
    WebElement OrdersTab;

    @FindBy(xpath = "//span[text()='لا يوجد محفوظات']")
     public WebElement MessageText;

    public void checkIfOrderTabOpen(){
        clickButton(OrdersTab);
    }

}
