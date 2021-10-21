package Pages.Hotels;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

import static DriverWrapper.Web.driver;

@Test
public class Homepage extends WebCommands {




/*


    // #2, #3
    List<WebElement> dates = driver.findElements(By.xpath("//h2[text()='October 2021']/following-sibling::table//button[not(@disabled)]"));

    // #4
        for (WebElement date : dates) {
        if (date.getText().equalsIgnoreCase("10")) {
            date.click();
            break;
        }
    }

        driver.findElement(By.xpath("//span[text()='Check out']")).click();

        try {
        Thread.sleep(1000);     // 1 sec = 1000milliseconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    // #4
        for (WebElement date : dates) {
        if (date.getText().equalsIgnoreCase("17")) {
            date.click();
            break;
        }
    }



    /**
     * 1. Analyse if Date-values are present in dom as text or attribute's value
     * 2. Create a locator that will point to all the date webElements
     * 3. using findElements method to find all date-webElements
     * 4. using loop
     *      pick date-webElement
     *      get text value (or attribute value) [depends on step#1]
     *      if (above value == what user want to select)
     *          click webElement
     *          and break the loop
     *
     */

}
