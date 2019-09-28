package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C:\\Vineet\\Selenium_Projects\\FreeCRMBDDFramework\\src\\main\\java\\Features\\tagging.feature" // gives path of feature file
		,glue= {"stepDefinitions"}// gives path of step definition file
		,plugin= {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"} // generates report html,json,xml files
		,dryRun=false // will check and inform if any mapping is missing between feature and step definition files
		,strict=true // will fail the execution if any step definition is missing
		,monochrome=true // to show output in readable format
		,tags = {"@RegressionTest"}
		)

public class TestRunner {
		
	    
	    }

