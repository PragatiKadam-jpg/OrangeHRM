package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/FeatureFile",
				extraGlue= {"StepDefination"},
				dryRun=false,
				monochrome=true,
				tags="@RegressionTest"
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
