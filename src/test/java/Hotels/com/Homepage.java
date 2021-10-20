package Hotels.com;

//import Pages.WebCommands;
import Pages.WebCommands;
import org.openqa.selenium.By;



public class Homepage extends WebCommands {

    /*
    1. Create object of WebCommands
    2. extend WebCommands to every PageObject Model
     */
    // WebCommands webCommands = new WebCommands();



    // Locator for element on Homepage
    By loginButtonLocator = By.tagName("button");
    By emailBoxLocator = By.id("email");
    By pwdBoxLocator = By.id("pass");
    By createNewAccountButtonLocator = By.linkText("Create New Account");



    // Method to interaction with Elements on Homepage (should use Custom method from WebCommands)

    public void clickLoginButton() {
        // webCommands.clickThis(loginButtonLocator);
        clickThis(loginButtonLocator);
    }

    // Generic method to type login email
    public void typeLoginEmail(String email) {
        type(email, emailBoxLocator);
    }

    // Generic method to type login password
    public void typeLoginPwd(String pwd) {
        type(pwd, pwdBoxLocator);
    }

    public boolean isLoginEnabled() {
        return isWebElementEnabled(loginButtonLocator);
    }

    public void clickCreateNewAccount() {
        clickThis(createNewAccountButtonLocator);
    }

    public boolean isCreateNewAccountEnabled() {
        return isWebElementEnabled(createNewAccountButtonLocator);
    }
}