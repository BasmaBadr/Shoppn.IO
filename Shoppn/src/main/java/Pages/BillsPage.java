package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillsPage extends PageBase {
    public BillsPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//a[@href=\"https://webstdy-011.shoppn.io/dashboard/landlord-invoices\"]")
   public WebElement billsTab;
    @FindBy(xpath = "//h3[contains(text(),'فواتيري ')]")
   public WebElement billsTxt;

    public void openBillsTab()
    {
        clickButton(billsTab);
    }
}
