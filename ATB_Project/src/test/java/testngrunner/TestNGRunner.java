package testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			
			features = {"Features"},
			glue = {"stefdefination"},
			tags = {"@login"}
			)
public class TestNGRunner extends AbstractTestNGCucumberTests {	}
