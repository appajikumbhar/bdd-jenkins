package outline;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 

@CucumberOptions(
		features = "src/test/java/outline",
		monochrome = true,
		dryRun=false
		)
/*
@CucumberOptions(
		features = "Feature2"
		,glue={"stepDefinition2"}
		,monochrome = true,
		dryRun=false		
		)
*/
public class runTest { }