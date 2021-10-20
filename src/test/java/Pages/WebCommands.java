package Pages;

import DriverWrapper.Web;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebCommands {

    Web web = new Web();

    /**
     * Generic method to find any webElement
     * Input: By
     * Return: WebElement
     */
    public WebElement getWebElement(By locator) {

        Wait fWait = new FluentWait(web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is no found within 30 seconds");

        // to find a webElement using fluent wait
        WebElement ele = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        // return web.getDriver().findElement(locator);
        return ele;
    }


    public List<WebElement> getWebElements(By locator) {

        Wait fWait = new FluentWait(web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is no found within 30 seconds");

        // to find a webElement using fluent wait
        List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });

        return elements;
    }

    /**
     * Custom method to find and Click a WebElement
     * Input: By
     * Return type: void
     */
    public void clickThis(By locator) {
        getWebElement(locator).click();
        // Sleep.sleepFor(5);  // temporary code until we Wait topic is not covered
    }

    /**
     * Custom method to find and Click a WebElement using Actions class
     * Input: By
     * Return type: void
     */
    public void clickThisUsingActions(By locator) {
        WebElement element = getWebElement(locator);
        Actions act = new Actions(web.getDriver());
        act.click(element).build().perform();
        // Sleep.sleepFor(5);  // temporary code until we Wait topic is not covered
    }


    /**
     * Custom method to find and type anything on a WebElement
     * Input: By , String
     * Return: void
     *
     */
    public void type(String data, By locator) {
        getWebElement(locator).sendKeys(data);
    }

    /**
     * Custom method to get if WebElement is Enabled
     * Input: By
     * Return:
     */
    public boolean isWebElementEnabled(By locator) {
        return getWebElement(locator).isEnabled();
    }

    /**
     * Custom method to get if WebElement is Displayed
     * Input: By
     * Return: boolean
     */
    public boolean isWebElementDisplayed(By locator) {
        return getWebElement(locator).isDisplayed();
    }


    public boolean isWebElementSelected(By locator) {
        return getWebElement(locator).isSelected();
    }


    /**
     * Custom method to scroll downwards by any pixel
     * Input: String/int
     * Return: void
     */
//    public void scrollDown(String pixels) {
//        JavascriptExecutor js = (JavascriptExecutor) web.getDriver();
//        js.executeScript("scrollBy(0,"+pixels+")");
//    }

    public void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) web.getDriver();
        js.executeScript("scrollBy(0,"+pixels+")");
    }

    public void selectFromDropdown(String data, By locator) {
        WebElement dropdownElement = getWebElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(data);
    }


    public void scrollDownAndClick(By locator) {
        for (int i=0 ; i < 30 ; i++) {
            try {
                WebElement element = web.getDriver().findElement(locator);
                element.click();
                break;
            } catch (NoSuchElementException | ElementNotInteractableException e1) {
                JavascriptExecutor js = (JavascriptExecutor)web.getDriver();
                js.executeScript("scrollBy(0,500)");
            }
        }
    }


    /**
     * Create method to switch driver on any window
     * Input: String
     *
     */
    public void switchToWindow(String newHandle) {
        web.getDriver().switchTo().window(newHandle);
    }

    /**
     * Create method to get all window handles
     * input: -
     * return: Set<String>
     */
    public Set<String> getAllWindowHandles() {
        return web.getDriver().getWindowHandles();
    }

    /**
     * Create method to get current window handle
     * input: -
     * return: String
     */
    public String getCurrentWindowHandle() {
        return web.getDriver().getWindowHandle();
    }


    /**
     * Method to switch to an alert
     */
    public Alert switchToAlert() {
        return web.getDriver().switchTo().alert();
    }

    /**
     * Method to click +ve action button on alert
     */
    public void clickPositiveOnAlert() {
        Alert alert = switchToAlert();
        alert.accept();
    }

    /**
     * Method to click -ve action button on alert
     */
    public void clickNegativeOnAlert() {
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    /**
     * Method to getText from alert
     */
    public String getTextFromAlert() {
        Alert alert = switchToAlert();
        return alert.getText();
    }

    /**
     * Method to type on alert
     */
    public void typeOnAlert(String data) {
        Alert alert = switchToAlert();
        alert.sendKeys(data);
    }

    /**
     * Method to switch to Frame
     */
    public void switchToFrame(String frameId) {
        web.getDriver().switchTo().frame(frameId);
    }

    public void switchToFrame(WebElement frameElement) {
        web.getDriver().switchTo().frame(frameElement);
    }



}