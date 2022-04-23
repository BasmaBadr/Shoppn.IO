package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "email")
   public  WebElement Email;
    @FindBy(id = "password-field")
    WebElement Password;
    @FindBy(id = "submit-btn")
    WebElement Submit;
    @FindBy(xpath = "//h1[contains(text(),'مرحبا بك في Shoppn')]")
     public WebElement Welcommessage;

//    @FindBy(xpath = "//span[@class='hidden-xs hidden-sm hidden-md']//parent::li")
//    WebElement no;



    public void loginWithValidUNandPW(String email, String password)
    {
       setTextElmentText(Email,email);
       setTextElmentText(Password,password);
       clickButton(Submit);

   }

//   public void Waiits(  )
//
//   {
//       WebDriverWait wait = new WebDriverWait(driver, 20);
//       wait.until(ExpectedConditions.visibilityOf(Welcommessage));
//   }
//      public void checkno(){
//          System.out.println(no.getText());
//      }
}
