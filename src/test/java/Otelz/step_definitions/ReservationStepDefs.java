package Otelz.step_definitions;

import Otelz.pages.BasePage;
import Otelz.pages.ReservationPage;
import Otelz.utilities.BrowserUtils;
import Otelz.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ReservationStepDefs {
    @Given("The user is on the otel's reservation page")
    public void the_user_is_on_the_otel_s_reservation_page() {
        BrowserUtils.waitForClickability(new ReservationPage().rezervasyonYap,10);
    }


    @When("The user clicks Rezervasyon Yap button")
    public void the_user_clicks_Rezervasyon_Yap_button() {
        new ReservationPage().rezervasyonYap.click();


    }
    @Then("The user should be able to see and click Hemen Rezervasyon Yap button")
    public void the_user_should_be_able_to_see_and_click_Hemen_Rezervasyon_Yap_button() {
        BrowserUtils.waitForClickability(new ReservationPage().hemenRezervasyonYap,10);
        new ReservationPage().hemenRezervasyonYap.click();
    }

    @Then("The user should be able to see information page with their information")
    public void the_user_should_be_able_to_see_information_page_with_their_information() {
        BrowserUtils.waitForVisibility(new ReservationPage().emailAssertion,10);

        new ReservationPage().emailAssertion.click();
        new ReservationPage().emailAssertion.sendKeys(Keys.CONTROL,"a");
        new ReservationPage().emailAssertion.sendKeys(Keys.CONTROL,"c");

        String actual = new ReservationPage().emailAssertion.sendKeys(Keys.CONTROL,"v");
        String expected = ConfigurationReader.get("email");
        System.out.println(actual);
        System.out.println(expected);

        Assert.assertEquals(expected,actual);


    }
    @Then("The user enters phone number")
    public void the_user_enters_phone_number() {
        BrowserUtils.waitForClickability(new ReservationPage().phoneNumberBox,10);
        String phone = ConfigurationReader.get("phone");
        new ReservationPage().phoneNumberBox.click();
        new ReservationPage().phoneNumberBox.sendKeys(phone);

    }
    @When("The user clicks Kaydet ve Devam et button")
    public void the_user_clicks_Kaydet_ve_Devam_et_button() {
            BrowserUtils.waitForClickability(new ReservationPage().kaydetVeDevamEt,10);
        new ReservationPage().kaydetVeDevamEt.click();
    }
    @Then("The user should be able to choose payment type")
    public void the_user_should_be_able_to_choose_payment_type() {

        BrowserUtils.waitForClickability(new ReservationPage().krediKartsizGarantileBtn,10);
        new ReservationPage().krediKartsizGarantileBtn.click();
    }
    @When("The user clicks Rezervasyonu Tamamla button")
    public void the_user_clicks_Rezervasyonu_Tamamla_button() {
        BrowserUtils.waitForClickability(new ReservationPage().rezervasyonuTamamla,10);
        new ReservationPage().rezervasyonuTamamla.click();

    }
    @Then("The user should be able to see Thanks page and Rezervasyon Numarasi and PIN kodu")
    public void the_user_should_be_able_to_see_Thanks_page_and_Rezervasyon_Numarasi_and_PIN_kodu() {
        BrowserUtils.waitForVisibility(new ReservationPage().rezervasyonNo,10);

        String rezervasyonNumarasi = new ReservationPage().rezervasyonNo.getText();
        BrowserUtils.waitForVisibility(new ReservationPage().PINKodu,10);
        String pinKodu = new ReservationPage().PINKodu.getText();


        System.out.println("rezervasyon numarasi = " + rezervasyonNumarasi);
        System.out.println("pinKodu = " + pinKodu);

    }
}
