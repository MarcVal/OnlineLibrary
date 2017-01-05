package ro.OnlineLibrary.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin =  {"rerun", "html:target/cucumber","json:target/jsonReports/OnlineLibraryRunner.json"},
        glue = {"ro.OnlineLibrary"},
        features = {
                "src/test/resources/features/buyProducts.feature",
                "src/test/resources/features/registeringUser.feature"
        }
)

public class OnlineLibraryRunner {
}
