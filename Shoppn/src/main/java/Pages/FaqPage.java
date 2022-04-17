package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaqPage extends PageBase {
    public FaqPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'الاسئلة الشائعة')]")
    WebElement faqTab;
    @FindBy(xpath = "//h3[contains(text(),'الاسئلة الشائعة')]")
    public WebElement faqText;

    public void openFaqTab(){
        clickButton(faqTab);
    }

}
