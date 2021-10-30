package Pages.Hotels;

import DriverWrapper.Web;
import Pages.Hotels.AllWebCommands;
import org.openqa.selenium.By;



public class SignInPage extends AllWebCommands {
    Web web = new Web();

    By signInLocator = By.xpath("//span[text()='Sign in']");
    By emailLogInLocator = By.xpath("//input[@name='email']");
    By passwordLogInLocator = By.xpath("//input[@name='password']");
    By signInButtonLocator = By.xpath("//button[@id='sign-in-button']");
    By errorMessageForInvalidEmailAndPsw = By.xpath("//div[contains(text(),'the email and password')]");

    public void clickSignInLocator (){
        clickUsingActionsClass(signInLocator);
    }
    public void enterEmail (String data){
        type(data,emailLogInLocator);
    }
    public void enterPassword(String data){
        type(data,passwordLogInLocator);
    }
    public void clickSignIn (){
        clickUsingActionsClass(signInButtonLocator);
    }
    public boolean getErrorMessage(){
        return isWebElementDisplayed(errorMessageForInvalidEmailAndPsw);
    }



}
