package Otelz.pages;

import Otelz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage extends BasePage{

    public ManagePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]/span[1]")
    public WebElement onaylandi;

    @FindBy(xpath = "//span[contains(text(),'Rezervasyonu İptal Et')]")
    public WebElement iptalBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    public WebElement iptalTutar;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/button[2]")
    public WebElement kesinIptalEt;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[1]/h3[1]")
    public WebElement tamamenIptalEt;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]")
    public WebElement iptalNedeniBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/select[1]/option[2]")
    public WebElement iptalNedeni;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[3]/button[1]")
    public WebElement tumIptalBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]/span[1]")
    public WebElement iptalYazisi;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/i[1]")
    public WebElement rezervasyonuYonetBtn;

}
