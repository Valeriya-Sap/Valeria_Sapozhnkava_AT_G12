package homework.taf.runners;

import homework.taf.base.postcondition.JUnitPostcondition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "homework.taf.steps.cucumber",
                "homework.taf.base"
        },
        monochrome = true
)


public class CucumberRunner {
}
