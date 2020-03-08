package cucumber_hw_linkedin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src", glue = {"cucumber_hw_linkedin"})

public class Runner {
}

