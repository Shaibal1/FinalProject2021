package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class ErrorPage extends WebCommands {

    By somethingWrongLocator = By.xpath("//h1[text() = 'Sorry, something went wrong.']");
    By invalidLoginError = By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']");


    // Method to interaction with Errorpage WebElement (using WebCommands methods)

    public boolean isSomethingWrongErrorDisplayed() {
        return isWebElementDisplayed(somethingWrongLocator);
    }

    public boolean isInvalidLoginErrorDisplayed() {
        return isWebElementDisplayed(invalidLoginError);
    }
}