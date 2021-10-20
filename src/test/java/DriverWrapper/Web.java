package DriverWrapper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    private static WebDriver driver;
    String url = "https://www.hotels.com/";


    /**
     * Any method with @Before annotation will execute before code related to every Scenario
     */
    @Before
    public void openWebpage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tasne\\Documents\\git\\Summer2021_Selenium\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

//        try {
//            Thread.sleep(2000);     // 1 sec = 1000milliseconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    /**
     * Any method with @After annotation will execute after code related to every Scenario
     */
    @After
    public void quitWebpage() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }


}