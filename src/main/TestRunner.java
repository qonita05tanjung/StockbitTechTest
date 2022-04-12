package main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/features",
	    glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests  {

}
