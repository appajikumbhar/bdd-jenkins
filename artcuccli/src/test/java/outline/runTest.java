package outline;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 

@CucumberOptions(
		monochrome = true,
		dryRun=false,
		features = "commandLine",
		glue={"commandLine"}
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