package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@SuppressWarnings("NewClassNamingConvention")
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features", extraGlue = "com.policyexpert.test.steps"
)
public class CucumberTestSuite {}
