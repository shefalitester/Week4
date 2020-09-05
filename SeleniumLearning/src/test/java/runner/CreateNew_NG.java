package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			features = "src/test/java/feature/ServiveNowLogin.feature",
			glue = {"stepDefinition","Hooks"},
			dryRun= !true,
			snippets = SnippetType.CAMELCASE,
			monochrome = true,
			plugin= {"pretty","html:reports"}
		)

public class CreateNew_NG extends AbstractTestNGCucumberTests {
}	