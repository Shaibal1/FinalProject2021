//package Tests;
//
//import DriverWrapper.DriverWrapper;
//import Pages.Hotels.HomePage;
//import Pages.Hotels.HomePage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Login extends DriverWrapper {
//
////    Homepage homepage = new Homepage();
////    ErrorPage errorPage = new ErrorPage();
//
//    DriverWrapper Open = new DriverWrapper();
//    HomePage hp = new HomePage();
//
//
//    /**
//     * 1. Create object of Web class
//     * 2. Extend Web Class
//     */
//
//
//    // Verify login button is enabled after launching the web-page
//    /*
//        1. Launch webpage
//        2. Verify Login button is enabled ()
//        3. Quit webpage
//     */
//
//
//
//    // Verify incorrect username/password
//    /*
//        1. Launch WebPage
//        2. Enter "abcd@gmail.com" in username
//        3. Enter "abcd@1234" as password
//        4. Click Login button
//        5. User should be "Sorry, something went wrong." message
//        6. Quit webpage
//     */
//    @Test
//    public void invalidCredentials() {
//
//        openWebpage();
//
//        hp.typeLoginEmail("abcd@gmail.com");
//        hp.typeLoginPwd("abcd@1234");
//        hp.clickSignInLink();
//
//
//    }
//
//
//
//}
