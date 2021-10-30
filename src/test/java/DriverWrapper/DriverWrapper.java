//package DriverWrapper;
//
//import Pages.Hotels.WebCommands;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//
//import java.util.concurrent.TimeUnit;
//
//public class DriverWrapper {
//
//    private static WebDriver driver;
//    String url = "https://www.hotels.com/";
//
//
//    /**
//     * Any method with @Before annotation will execute before code related to every Scenario
//     */
//    @Before
//    public void openWebpage() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Project\\Summer2021_SeleniumCucumber\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(url);
//
//    }
//
////    public void initDriver(){
////        driver.get(url);
////        try {
////            Thread.sleep(2000);     // 1 sec = 1000milliseconds
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////    }
//
//    /**
//     * Any method with @After annotation will execute after code related to every Scenario
//     */
//
//    @After
//    public void quitWebpage()
//    {
//        driver.quit();
//    }
////
//    public WebDriver getDriver()
//    {
//        return driver;
//    }
//
//
//}
