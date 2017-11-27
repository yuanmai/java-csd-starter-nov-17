package cuke.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TennisPage {


    @FindBy(how = How.NAME, using = "ok")
    public WebElement btnOk;

    @FindBy(how = How.NAME, using = "Info")
    public WebElement labInfo;

    public void Order()
    {
        ;
    }

    public void ClickLogin()
    {
        btnOk.submit();
    }
}
