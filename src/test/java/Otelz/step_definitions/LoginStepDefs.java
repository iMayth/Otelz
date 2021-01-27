package Otelz.step_definitions;

import Otelz.pages.BasePage;
import Otelz.pages.LoginPage;
import Otelz.utilities.BrowserUtils;
import Otelz.utilities.ConfigurationReader;
import Otelz.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {
    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user clicks Giris Yap button")
    public void the_user_clicks_Giris_Yap_button() {
        BrowserUtils.waitForClickability(new LoginPage().girisYapBtn,10);
        new LoginPage().girisYapBtn.click();

    }
    @Then("The user should be able to see login pop up")
    public void the_user_should_be_able_to_see_login_pop_up() {
        BrowserUtils.waitForVisibility(new LoginPage().email,10);


    }
    @Then("The user enters email and password and clicks Giris")
    public void the_user_enters_email_and_password_and_clicks_Giris() {
        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");

        new LoginPage().email.sendKeys(email);
        BrowserUtils.waitForClickability(new LoginPage().password,10);
        new LoginPage().password.sendKeys(password);
        BrowserUtils.waitForClickability(new LoginPage().giris,10);
        new LoginPage().giris.click();

    }
    @Then("The user should be able to see the main page with their name")
    public void the_user_should_be_able_to_see_the_main_page_with_their_name() {
        BrowserUtils.waitForVisibility(new LoginPage().isim,10);
        String actual = new LoginPage().isim.getText();
        String expected = "test test";

        Assert.assertEquals(expected,actual);

    }
}
