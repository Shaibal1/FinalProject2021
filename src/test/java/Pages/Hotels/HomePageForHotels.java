package Pages.Hotels;

import DriverWrapper.Web;
import Pages.Hotels.AllWebCommands;
import Utils.DropDowns;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageForHotels extends AllWebCommands {
    Web web = new Web();



    By checkInLocator = By.xpath("//span[text()='Check in']");
    By disabledDatesLocator = By.xpath("//h2[text()='October 2021']/following-sibling::table//button[@disabled]");
    By disabledBackButtonLocator = By.xpath("//button[@aria-label='Previous']");
    By guestsLocator = By.xpath("//span[text()='Guests']");
    By adultsCountLocator = By.xpath("//select[contains(@name, 'adults')]");
    By kidsCountLocator = By.xpath("//select[contains(@name, 'children')]");
    By kidsAgeLocator = By.xpath("//select[contains(@name, 'child-0-age')]");
    By kidsAge2Locator = By.xpath("//select[@name='q-room-0-child-1-age']");
    By totalGuestCountLocator = By.xpath("//div[@class='_1sygyM']");
    By applyButtonLocator = By.xpath("//button[@aria-label='Apply']");
    By totalPeopleLocator = By.xpath("(//span[contains(text(), 'guests')])[1]");
    By signUpLocator = By.xpath("//a[text()='Sign up']");

    By searchButtonLocator = By.xpath("//input[@name='q-destination']");
    //By boraSuggestionsLocator = By.xpath("//div[contains(@class,'typeahead')]//span[not(@class)]");
    By selectingBoraFromAutoSuggestions = By.xpath("(//div[contains(@class,'typeahead')]//span[@class='highlighted'])[1]");
    //CheckinLocator
    By november2021Calendar = By.xpath("//h2[text()='November 2021']/following-sibling::table//button");
    By searchBoxLocator = By.xpath("//button[text()='Search']");
    By lol = By.xpath("//button[@aria-label='Change dates']");
    By termsAndConditionsLocator = By.xpath("//a[text()='Terms and Conditions']");
    String signUpPageUrl = "https://www.hotels.com/profile/signup.html";
    By privacyAndStatementLocator = By.xpath("//a[text()='Privacy Statement']");

    public void clickCheckIn (){
        clickUsingActionsClass(checkInLocator);
    }

    public void getWebElementsAndPrintText (){
        getWebElementsMethod(disabledDatesLocator);
    }
    public boolean getWebElementsAndPrintText1 (){
        return isWebElementEnabled(disabledDatesLocator);
    }



    public void getWebElements () {
        getWebElementsMethod(disabledDatesLocator);
    }

    public boolean gettingWebElement (){
        getWebElement(disabledBackButtonLocator);
        return false;
    }
    public void clickGuests(){
        clickUsingActionsClass(guestsLocator);
    }

    //    public void adultCount (String count){
//       WebElement adults= getWebElement(adultsCountLocator);
//        adults.click(); //Click the dropdown
//        Select adultAmount = new Select(adults);
//        adultAmount.selectByVisibleText(count);
//    }
    public void adultCount (String count){
        adultCount1(adultsCountLocator,count);
    }
    public void kidsCount (String count){
        adultCount1(kidsCountLocator,count);
    }
    public void kidsAge (String age){
        adultCount1(kidsAgeLocator,age);
    }
    public void kidsAgeNr2 (String age){
        adultCount1(kidsAge2Locator,age);
    }
    public void totalGuestCount(){
        isWebElementDisplayed(totalGuestCountLocator);
    }
    public void clickingApplyButton(){
        clickUsingActionsClass(applyButtonLocator);
    }
    public void totalPeople (){
        isWebElementEnabled(totalPeopleLocator);
    }
    public void searching (String name){
        getWebElement(searchButtonLocator).sendKeys(name);
    }
    public void selectingBoraBora(String text){
        clickUsingActionsClass(selectingBoraFromAutoSuggestions);

    }

    public void checkInNovember2021 (String count){
        calendar(november2021Calendar,count);
    }
    public void checkOutNovember2021(String count){
        calendar(november2021Calendar,count);
    }
    public void clickSearchButton (){

        clickUsingActionsClass(searchBoxLocator);
    }

    public void areWebElementsEnabledOrNot(){
        Assert.assertTrue(isWebElementEnabled(lol));
    }
    public void areWebElementsDisplayedOrNot(){
        Assert.assertTrue(isWebElementDisplayed(lol));
    }
    public void clickSignUp (){
        clickUsingActionsClass(signUpLocator);
    }
    public void clickTermsAndConditions(){
        clickUsingActionsClass(termsAndConditionsLocator);
    }
    public void countingWindowHandles (){
        try {

            getWindowHandles(3);
        }catch (NoSuchWindowException e){
            System.out.println("theres a window exception ");
        }
    }
    public void windowHandleSwitch (){
        switchingWindowHandle(signUpPageUrl);
    }

    public void clickPrivacyStatement (){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) web.getDriver();
        js.executeScript("scrollBy(0,300)");
        clickUsingActionsClass(privacyAndStatementLocator);
    }







}