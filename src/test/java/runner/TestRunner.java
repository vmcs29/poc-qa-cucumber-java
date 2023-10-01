package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//Uncomment @RunWith if you are working with JUnit
//@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features/ScenarioOutlineTest.feature"}
				,glue={"stepDefinition","utility"}
				,plugin={"pretty","html:target/cucumber"}
				//,tags={}   //If you want to use tags, you declare them in the feature file to force the runner to execute only that one
				)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
