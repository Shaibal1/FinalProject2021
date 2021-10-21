package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class SignUpPage extends WebCommands {

    // Locator for element on SignUpPage
    By signUpHeadingLocator = By.xpath("//div[text()='Sign Up']");
    By quickEasySubHeadingLocator = By.xpath("//div[text()='It’s quick and easy.']");
    By fNameLocator = By.name("firstname");
    By lNameLocator = By.name("lastname");
    By mobileEmailLocator = By.name("reg_email__");
    By newPasswordLocator = By.id("password_step_input");
    By monthDropdownLocator = By.id("month");
    By dayDropdownLocator = By.id("day");
    By yearDropdownLocator = By.id("year");
    By femaleButtonLocator = By.xpath("//label[text()='Female']/following-sibling::input");
    By maleButtonLocator = By.xpath("//label[text()='Male']/following-sibling::input");
    By customButtonLocator = By.xpath("//label[text()='Custom']/following-sibling::input");
    By signUpButtonLocator = By.xpath("//button[text()='Sign Up' and @name='websubmit']");
    By genderNotSelectedErrorLocator = By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']");


    // Method to interaction with Elements on SignUpPage (should use Custom method from WebCommands)
    public boolean isSignUpHeadingDisplayed() {
        return isWebElementDisplayed(signUpHeadingLocator);
    }


    public boolean isQuickEasySubHeadingDisplayed() {
        return isWebElementDisplayed(quickEasySubHeadingLocator);
    }

    public void enterFirstName(String fname) {
        type(fname, fNameLocator);
    }

    public void enterLastName(String lname) {
        type(lname, lNameLocator);
    }

    public void enterMobileNumberOrEmail(String mobileOrEmail) {
        type(mobileOrEmail, mobileEmailLocator);
    }

    public void enterNewPassword(String newPwd) {
        type(newPwd, newPasswordLocator);
    }

    public void selectMonth(String month) {
        selectFromDropdown(month, monthDropdownLocator);
    }

    public void selectDay(String day) {
        selectFromDropdown(day, dayDropdownLocator);
    }

    public void selectYear(String year) {
        selectFromDropdown(year, yearDropdownLocator);
    }

    public void selectGender(String gender) {
        switch (gender.toLowerCase()) {
            case "female":
                clickThis(femaleButtonLocator);
                break;
            case "male":
                clickThis(maleButtonLocator);
                break;
            case "custom":
                clickThis(customButtonLocator);
                break;
            default:
                System.out.println("Incorrect gender supplied - " + gender);
        }
    }

    public void clickSignUpButton() {
        clickThis(signUpButtonLocator);
    }

    public boolean isGenderNotSelectedErrorDisplayed() {
        return isWebElementDisplayed(genderNotSelectedErrorLocator);
    }

    public boolean isFemaleGenderSelected() {
        return isWebElementSelected(femaleButtonLocator);
    }

    public boolean isMaleGenderSelected() {
        return isWebElementSelected(maleButtonLocator);
    }

    public boolean isCustomGenderSelected() {
        return isWebElementSelected(customButtonLocator);
    }

}
