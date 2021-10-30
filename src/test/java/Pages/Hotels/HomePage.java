//package Pages.Hotels;
//
//import org.openqa.selenium.By;
//
//public class HomePage extends WebCommands {
//
//    //all xpaths should come here
//    By signInLink = By.xpath("//span[text()='Sign in']");
//    By emailBoxLocator = By.id("email");
//    By pwdBoxLocator = By.id("pass");
//    By submit = By.xpath("");
//    By verificationMessage = By.xpath("");
//
//    private static org.openqa.selenium.WebDriver driver;
//
//    public void clickSignInLink(){
//        driver.findElement(signInLink).click();
//    }
//
//    public void typeLoginEmail(String email) {
//        type(email, emailBoxLocator);
//
//    }
//
//    public void typeLoginPwd(String pwd) {
//        type(pwd, pwdBoxLocator);
//    }
//
//
//    public void  clickSigninButton(){
//        driver.findElement(submit).click();
//    }
//
//    public String verifyErrorMessage(){
//        String msg = driver.findElement(verificationMessage).getText();
//        return msg;
//    }
//
//
//}
