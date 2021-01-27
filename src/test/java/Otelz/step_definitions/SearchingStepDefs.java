package Otelz.step_definitions;

import Otelz.pages.LoginPage;
import Otelz.pages.SearchingOtelPage;
import Otelz.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchingStepDefs {

    String otelName = "Ilk Resort Test Oteli";
    @When("The user enters the otel's name and clicks Otel Ara button")
    public void the_user_enters_the_otel_s_name_and_clicks_Otel_Ara_button() {

        BrowserUtils.waitForClickability(new SearchingOtelPage().otelNameBox,10);
        new SearchingOtelPage().otelNameBox.click();
        new SearchingOtelPage().otelNameBox.sendKeys(otelName);

        BrowserUtils.waitFor(2);
        new SearchingOtelPage().firstResult.click();

        BrowserUtils.waitForClickability(new SearchingOtelPage().otelAraBtn,10);

        new SearchingOtelPage().otelAraBtn.click();




    }
    @Then("The user should be able to see the otel's reservation page")
    public void the_user_should_be_able_to_see_the_otel_s_reservation_page() {
        String expected = otelName;
        BrowserUtils.waitForVisibility(new SearchingOtelPage().otelAdi,10);
        String actual = new SearchingOtelPage().otelAdi.getText();

        Assert.assertEquals(expected,actual);
    }
}
