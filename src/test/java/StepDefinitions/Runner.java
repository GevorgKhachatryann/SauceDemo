package StepDefinitions;


import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\user\\IdeaProjects\\untitled\\src\\test\\Features\\Login.feature"},
        glue = {"com.pb.cucumbertest"},
        plugin = {"pretty","json:reports/cucumber.json"},
        dryRun = true
)
public class Runner {
}
