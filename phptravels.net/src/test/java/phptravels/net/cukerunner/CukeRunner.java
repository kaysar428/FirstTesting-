package phptravels.net.cukerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/Feature_Files/Phptravel.Feature",
		glue="phptravels.net.Step_Definition",
		tags="@FunctionalTest",
		dryRun=false
		
		
		
		)

public class CukeRunner {

}
