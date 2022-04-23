package Tests;

import Pages.AffiliatesPage;
import Pages.EditStoreDesignPage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditStoreDesignTest extends TestBase {

    LoginPage loginPage;
    EditStoreDesignPage editStoreDesignPage;

    @Test
    public void checkEditStoreTabOpen() throws InterruptedException {
        loginPage = new LoginPage(driver);
        editStoreDesignPage = new EditStoreDesignPage(driver);
        loginPage.loginWithValidUNandPW("jahiji7855@host1s.com","12345678");
        Thread.sleep(20000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editStoreDesignPage.editStoreTab);

        editStoreDesignPage.openEditStore();
        Assert.assertTrue(editStoreDesignPage.editStoreTxt.getText().contains("تعديل تصميم المتجر"));
        System.out.println(editStoreDesignPage.editStoreTxt.getText());
    }
}
