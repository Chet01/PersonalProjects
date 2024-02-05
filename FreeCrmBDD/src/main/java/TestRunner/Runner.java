package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/BDD/FreeCrmBDD/src/main/java/Features/login.feature",
glue = "StepDefinitions")
public class Runner {

}

