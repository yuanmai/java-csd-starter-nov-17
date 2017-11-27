package cuke.steps;

import cucumber.api.PendingException;
import cuke.pages.LoginPage;
import cuke.pages.reversationPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Lenovo on 2017/11/26.
 */
public class reversationSteps {
    private WebDriver webDriver;
    reversationPage page;
    @cucumber.api.java.zh_cn.那么("^我预定失败$")
    public void 我预定失败() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.当("^我预定崇文门场馆(\\d+)点到(\\d+)点的一个场地$")
    public void 我预定崇文门场馆_点到_点的一个场地(int arg1, int arg2) throws Throwable {
        page.Reversation("10", "11");
        page.ClickRev();
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.假设("^在崇文门场馆，(\\d+)点到(\\d+)点有空余场地$")
    public void 在崇文门场馆_点到_点有空余场地(int arg1, int arg2) throws Throwable {

        webDriver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
        page = new reversationPage(webDriver);

        page.listReversation("10","16");

        //page.ClickRev();
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.那么("^我能成功预定$")
    public void 我能成功预定() throws Throwable {
        Assert.assertEquals("", webDriver.findElement(By.id("Initial")).isDisplayed(), true);

        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
