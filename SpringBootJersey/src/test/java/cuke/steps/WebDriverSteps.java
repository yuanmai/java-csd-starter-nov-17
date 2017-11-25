package cuke.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Karthik on 10/17/2016.
 */
public class WebDriverSteps {

    WebDriver webDriver;

    @Before("@web")
    public void openBrowser() {
        System.out.println("Opening the browser : Firefox");

        /*System.setProperty("webdriver.firefox.marionette", "D:\\Libs\\geckodriver.exe");
        holder.Driver = new FirefoxDriver();*/


        //Chrome driver
       // System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }


    @After("@web")
    public void closeBrowser(Scenario scenario) {
        webDriver.close();
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
