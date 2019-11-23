package myRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\homePage.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\aboutUsPage.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\howItsWorksPage.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\gallery.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\media.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\subscriptionPlan.feature",
				"C:\\Users\\cmehta\\eclipse-workspace\\safeGaurdProject\\src\\main\\java\\com\\qa\\features\\contact.feature",
				
				},
		glue= {"com/qa/stepDefinitions"},  //path of step definition file 
		//glue= {"helpers","/Cucumber-POM-Project/src/main/java/com/qa/stepDefinition/\\ForgotPasswordPageStep.java" , "/Cucumber-POM-Project/src/main/java/com/qa/stepDefinition/"},
		format = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},  //to generate different type of report
		dryRun = false, //to check the mapping is in proper between feature file and step definition file
		monochrome  = true, //Display the console output in a proper readable format
		strict = true , //it will check if any steps is not defined in step definition file
		tags = {"@SanityTest ", "~@RegressionTest", "~@End2EndTest"}, // execute all test tagged as @SanityTest OR @RegressionTest
		//tags = {"@SanityTest" , "@RegressionTest" , "@End2EndTest"}, // execute all test tagged as @SanityTest AND @RegressionTest
		//tags = {"~@SanityTest" , "~@RegressionTest" , "~@End2EndTest"} // Ignore all test cases from the feature file 
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)


public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

}




