package Otelz.pages;

import Otelz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")
    public WebElement email;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")
    public WebElement password;

    @FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")
    public WebElement giris;


}
