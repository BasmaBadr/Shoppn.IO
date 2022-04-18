package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "email")
    WebElement Email;
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
//      public void checkno(){
//          System.out.println(no.getText());
//      }
}
