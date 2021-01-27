package Otelz.pages;

import Otelz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage extends BasePage{
    public ReservationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Rezervasyon Yap")
    public WebElement rezervasyonYap;

    @FindBy(xpath = "//a[contains(text(),'Hemen Rezervasyon Yap')]")
    public WebElement hemenRezervasyonYap;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]/input[1]")
    public WebElement emailAssertion;

    @FindBy(xpath = "//input[@id='CustomerInfoPhone']" )
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//button[contains(text(),'Kaydet ve Devam et')]")
    public WebElement kaydetVeDevamEt;

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement krediKartsizGarantileBtn;

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]" )
    public WebElement rezervasyonuTamamla;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/span[2]" )
    public WebElement rezervasyonNo;

    @FindBy(xpath = "//*[@id=\"pageBody\"]/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[3]/div[1]/div/button[2]/span[2]")
    public WebElement PINKodu;


}
