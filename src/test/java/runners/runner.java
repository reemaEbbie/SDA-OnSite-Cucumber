package runners;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions" ,
        features = "src/test/resources" ,
        tags = "@mytag"
)
public class runner {
}
