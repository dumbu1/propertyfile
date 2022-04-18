package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/features/page1/page1.feature"},
		glue= {"stepDefinations"},
		
		monochrome = true,
		dryRun = false
		
		
		)

public class TestRunner_Page1 extends AbstractTestNGCucumberTests {
	

}
