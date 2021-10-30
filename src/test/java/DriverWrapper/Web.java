package DriverWrapper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    private static WebDriver driver;

    public void openWebpage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tasne\\Documents\\git\\Project\\Summer2021_SeleniumCucumber\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hotels.com/");
        driver.manage().window().maximize();

    }
    public WebDriver getDriver(){
        return driver;
    }

    public void quitWebpage(){
        driver.quit();
    }
}