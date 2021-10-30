package StepDefinition;


import DriverWrapper.Web;

import Pages.Hotels.HomePageForHotels;
import Pages.Hotels.SignInPage;
import Pages.Hotels.AllWebCommands;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TestCases extends Web {
    AllWebCommands webCommands= new AllWebCommands();
    HomePageForHotels homepage = new HomePageForHotels();
    SignInPage signInPage = new SignInPage();

    //TC-17
    @Given("I am on Hotels Homepage")
    public void launchHotels(){
        openWebpage();
    }
    @When("I click Check In")
    public void clickCheckIn(){
        homepage.clickCheckIn();
    }
    @Then("I get disabled dates")
    public void getDisabledDates(){
        homepage.getWebElementsAndPrintText();
    }
    @Then("I get the elements in text format")
    public void checking(){
        Assert.assertFalse(homepage.getWebElementsAndPrintText1());
    }
    @Then("I see if back button is disabled")
    public void backButtonDisabled(){
        Assert.assertFalse(homepage.gettingWebElement());
    }
    @Then("I quit")
    public void z(){
        quitWebpage();
    }


    //TC-18
//    @Given("I am on website")
//    public void launchWebsite(){
//        openWebpage();
//    }
    @Then("click guests")
    public void clickGuests(){
        homepage.clickGuests();
    }
    @Then("update guest count to 4")
    public void updateGuestCount(){
        //homepage.adultCount("4");
        homepage.adultCount("4");
    }
    @Then("update kids count to 2")
    public void updateKidsCount(){
        homepage.kidsCount("2");
    }
    @Then("select child's age as 4")
    public void kidsAge(){
        homepage.kidsAge("4");
    }
    @Then("select second child's age as <1")
    public void kidsAge2(){
        homepage.kidsAgeNr2("<1");
    }
    @Then("I see if guest count is displayed")
    public void totalGuests(){
        homepage.totalGuestCount();
    }
    @Then("I click apply")
    public void clickApply(){
        homepage.clickingApplyButton();
    }
    @Then("I verify total count")
    public void TotalCountOfPeople(){
        homepage.totalPeople();
    }

    //TC-21
    @Then("I click on Sign in")
    public void clickSignIn (){
        signInPage.clickSignInLocator();
    }
    @Then("I enter invalid email")
    public void signInEmail (){
        signInPage.enterEmail("jamespeterson12@gmail.com");
    }
    @Then("I enter invalid password")
    public void signInPassword(){
        signInPage.enterPassword("James1997!");
    }
    @Then("I click signIn box")
    public void clickSignInInsideSignInPage (){
        signInPage.clickSignIn();
    }

    @Then("I verify error message is displayed")
    public void verifyErrorMessage(){
        Assert.assertTrue(signInPage.getErrorMessage());
    }

    //TC-19
    @Then("click Search Box and type '(.+)'")
    public void searchBox(String text){
        homepage.searching("Bora");
    }
    @Then("select '(.+)'")
    public void selectingBoraBoraFrench(String text){
        homepage.selectingBoraBora("Bora Bora");
    }
    @Then("I select Check-in date as '(.+)'")
    public void selectingNovCheckIn (String count){
        homepage.checkInNovember2021("1");
    }
    @Then("I select Check-out date from calendar as '(.+)'")
    public void selectingNovCheckOut (String count){
        homepage.checkOutNovember2021("15");

    }
    @Then("I click Search Button")
    public void clickingSearchButton(){
        homepage.clickSearchButton();
    }
    @Then("I scroll to bottom of page")
    public void scrollToBottomOfPage() {
        webCommands.scrollDownByPixels();
    }
    @Then("I see if Change Dates button is enabled")
    public void verifyingIfElementsAreEnabled(){
        homepage.areWebElementsEnabledOrNot();
    }
    @Then("I see if Change Dates button is displayed")
    public void verifyingIfElementsAreDisplayed(){
        homepage.areWebElementsDisplayedOrNot();
    }
    @Then("I click on sign up")
    public void clickSignUpLocator(){
        homepage.clickSignUp();
    }
    @Then("Click Terms and Conditions")
    public void clickingTermsAndConditions (){
        homepage.clickTermsAndConditions();
    }
    @Then("I click back to other page")
    public void goingBackToPreviousPage (){
        homepage.windowHandleSwitch();
    }
    @Then("I click privacy and statement")
    public void clickingPrivacyAndStatement (){
        homepage.clickPrivacyStatement();
    }
    @Then("I verify total tabs should be 3")
    public void verifyingTotalTabs (){
        homepage.countingWindowHandles();
    }





}