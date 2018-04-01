package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",
glue={"stepDefinition"},plugin = { "html:target/cucumber-html-report"})
public class TestRunner {

	
	
	
	
}
