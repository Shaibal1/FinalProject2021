package Tests;

import DriverWrapper.Web;
import Pages.Hotels.ErrorPage;
import Pages.Hotels.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web {

    Homepage homepage = new Homepage();
    ErrorPage errorPage = new ErrorPage();

    /**
     * 1. Create object of Web class
     * 2. Extend Web Class
     */


    // Verify login button is enabled after launching the web-page
    /*
        1. Launch webpage
        2. Verify Login button is enabled ()
        3. Quit webpage
     */






    @Test
    public void isLoginButtonEnabled() {

        // 1. Launch webpage
        openWebpage();

        // 2. Verify Login button is enabled ()
        /*
            find login button
            verify it is enabled (isEnabled)
         */

//        Assert.assertTrue(homepage.isLoginEnabled(), "Login button is not enabled");
//
//        // 3. Quit webpage
//        quitWebpage();
//
//    }
//
//
//    @Test
//    public void invalidCredentials() {
//
//        openWebpage();
//
//        homepage.typeLoginEmail("abcd@gmail.com");
//        homepage.typeLoginPwd("abcd@1234");
//        homepage.clickLoginButton();

        Assert.assertTrue(errorPage.isSomethingWrongErrorDisplayed(), "Error msg is NOT displayed");
    }




}