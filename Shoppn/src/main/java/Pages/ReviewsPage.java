package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewsPage extends PageBase {
    public ReviewsPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "https://webstdy-011.shoppn.io/dashboard/reviews")
   public WebElement reviewsTab;

    @FindBy(xpath = "//h3[contains(text(),'تقيم المنتجات')]")
   public WebElement reviewsTxt;

    public void openReviewTab()
    {
        scrollToElement(reviewsTab);
        clickButton(reviewsTab);
    }

}
