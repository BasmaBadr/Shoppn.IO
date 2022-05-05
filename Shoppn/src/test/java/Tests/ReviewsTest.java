package Tests;

import Pages.BillsPage;
import Pages.LoginPage;
import Pages.ReviewsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewsTest extends TestBase {
    LoginPage loginPage;
    ReviewsPage reviewsPage;
    String email = "jahiji7855@host1s.com";
    String password = "12345678";

    @Test
    public void checkReviewsTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        reviewsPage = new ReviewsPage(driver);
        loginPage.loginWithValidUNandPW(email , password);
        Thread.sleep(20000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reviewsPage.reviewsTab);

        reviewsPage.openReviewTab();
        Assert.assertTrue(reviewsPage.reviewsTxt.getText().contains("تقيم المنتجات"));
        System.out.println(reviewsPage.reviewsTxt.getText());
    }

}
