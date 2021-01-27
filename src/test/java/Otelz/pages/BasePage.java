package Otelz.pages;

import Otelz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYapBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/header[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]/strong[1]")
    public WebElement isim;

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[2]/input[1]")
    public WebElement otelNameBox;

    @FindBy(xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/button[1]/span[1]/span[1]/span[1]" )
    public WebElement otelAraBtn;


}