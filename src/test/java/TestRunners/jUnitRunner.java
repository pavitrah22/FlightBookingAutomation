package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        plugin = {"pretty","html:test-output"},
        monochrome = true,
        strict = true,
        dryRun = false

)
public class jUnitRunner {
}
