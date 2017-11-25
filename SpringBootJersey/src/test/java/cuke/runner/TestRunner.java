package cuke.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Karthik on 10/26/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/cuke/features"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "cuke/steps")
public class TestRunner {

}
