package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage extends PageBase {
    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'التقارير')]")
    WebElement reportsTab ;
    @FindBy(xpath = "//h3[contains(text(),'التقارير')]")
   public WebElement reportsText ;

    public void openReportTab(){
        clickButton(reportsTab);
    }

}
