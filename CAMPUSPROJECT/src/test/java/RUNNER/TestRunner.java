package RUNNER;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags="@Regression",
        features={"src/main/resources/FEATUREFILES"},
        glue = {"STEPDEFINITIONS"},
        plugin = {"html:target/report/CampusFunctionRegressionReport.html"}

)


public class TestRunner extends AbstractTestNGCucumberTests {
}


