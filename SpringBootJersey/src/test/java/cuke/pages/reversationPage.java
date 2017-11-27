package cuke.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Karthik on 10/25/2016.
 */
public class reversationPage {

    public reversationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "FromTime")
    public WebElement txtFromTime;

    @FindBy(how = How.NAME, using = "EndTime")
    public WebElement txtEndTime;

    @FindBy(how = How.NAME, using = "listFromTime")
    public WebElement txtListFromTime;

    @FindBy(how = How.NAME, using = "listEndTime")
    public WebElement txtListEndTime;

    @FindBy(how = How.NAME, using = "Rev")
    public WebElement btnRev;

    public void Reversation(String FromTime, String EndTime)
    {
        txtFromTime.sendKeys(FromTime);
        txtEndTime.sendKeys(EndTime);
    }

    public void listReversation(String FromTime, String EndTime)
    {
        txtListFromTime.sendKeys(FromTime);
        txtListEndTime.sendKeys(EndTime);
    }

    public void ClickRev()
    {
        btnRev.submit();
    }


}
