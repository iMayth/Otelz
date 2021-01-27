package Otelz.step_definitions;

import Otelz.pages.ManagePage;
import Otelz.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageStepDefs {
    @Given("The user is on reservation details page")
    public void the_user_is_on_reservation_details_page() {
        BrowserUtils.waitForClickability(new ManagePage().rezervasyonuYonetBtn,10);
        new ManagePage().rezervasyonuYonetBtn.click();
    }


    @When("The user clicks Rezervasyonu Iptal Et button")
    public void the_user_clicks_Rezervasyonu_Iptal_Et_button() {
        BrowserUtils.waitForClickability(new ManagePage().iptalBtn,10);
        new ManagePage().iptalBtn.click();

    }
    @Then("The user should be able to see cancellation and amount of penalty")
    public void the_user_should_be_able_to_see_cancellation_and_amount_of_penalty() {
        BrowserUtils.waitForVisibility(new ManagePage().iptalTutar,10);

        System.out.println(new ManagePage().iptalTutar.getText());
    }
    @When("The user clicks on Kesin Iptal Et button")
    public void the_user_clicks_on_Kesin_Iptal_Et_button() {
        BrowserUtils.waitForClickability(new ManagePage().kesinIptalEt,10);
        new ManagePage().kesinIptalEt.click();
    }
    @Then("The user should be able to see the rezervasyonu tamamen iptal et window")
    public void the_user_should_be_able_to_see_the_rezervasyonu_tamamen_iptal_et_window() {
        BrowserUtils.waitForVisibility(new ManagePage().tamamenIptalEt,10);
    }
    @When("The user picks a reason to cancellation and clicks on Evet, tum rezervasyonu iptal et button")
    public void the_user_picks_a_reason_to_cancellation_and_clicks_on_Evet_tum_rezervasyonu_iptal_et_button() {
        BrowserUtils.waitForClickability(new ManagePage().iptalNedeniBtn,10);

        new ManagePage().iptalNedeniBtn.click();
        BrowserUtils.waitForClickability(new ManagePage().iptalNedeni,10);
        new ManagePage().iptalNedeni.click();
        BrowserUtils.waitForClickability(new ManagePage().tumIptalBtn,10);
        new ManagePage().tumIptalBtn.click();
    }
    @Then("The user should be able to see reservation is cancelled message")
    public void the_user_should_be_able_to_see_reservation_is_cancelled_message() {

        BrowserUtils.waitForVisibility(new ManagePage().iptalYazisi,10);
        System.out.println(new ManagePage().iptalYazisi.getText());
    }
}
