package Pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TemplatesPage extends PageBase{
    public TemplatesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(text(),'القوالب')]")
   public WebElement templatesPage;
    @FindBy(xpath = "//h3[contains(text(),'القوالب')]")
  public WebElement templatesText;

    public void openTemplatesTab(){


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.executeScript("document.querySelector(body.header-fixed.header-mobile-fixed.aside-enabled.aside-fixed.aside-minimize-hoverable:nth-child(4) div.pb-35:nth-child(3) div.d-flex.flex-column.flex-root:nth-child(2) div.d-flex.flex-row.flex-column-fluid.page div.aside.aside-left.aside-fixed.d-flex.flex-column.flex-row-auto.noprint div.aside-menu-wrapper.flex-column-fluid div.aside-menu.my-4.scroll.ps.ps__rtl.ps--active-y div.ps__rail-y > div.ps__thumb-y).scrollTop=500");

        clickButton(templatesPage);

    }
//    JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", ele);
}
