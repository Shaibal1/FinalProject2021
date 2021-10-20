package StepDefinition;

import DriverWrapper.Web;
import Hotels.com.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class LoginSD extends Web
{
    Homepage homepage = new Homepage();

    @Given("I am on Homepage")
    public void launchWebpage()
    {
        openWebpage();
    }

    @Then("I verify login button is enabled")
    public void isLoginEnabled()
    {
        Assert.assertTrue(homepage.isLoginEnabled(), "Login button is not enabled");
    }

    @When("I quit Webpage")
    public void quitPage()
    {

    }
}
