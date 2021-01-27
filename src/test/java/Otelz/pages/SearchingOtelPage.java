package Otelz.pages;

import Otelz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingOtelPage extends BasePage {
    public SearchingOtelPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement firstResult;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/h1[1]")
    public WebElement otelAdi;

}
