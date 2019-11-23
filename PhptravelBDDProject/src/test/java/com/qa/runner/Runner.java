package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				"C:\\Users\\cmehta\\eclipse-workspace\\PhptravelBDDProject\\src\\main\\java\\com\\qa\\features\\PHPLoginPage.feature",
								
				},
		glue= {"com/qa/stepDefinition"},  //path of step definition file 
		//glue= {"helpers","/Cucumber-POM-Project/src/main/java/com/qa/stepDefinition/\\ForgotPasswordPageStep.java" , "/Cucumber-POM-Project/src/main/java/com/qa/stepDefinition/"},
		format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},  //to generate different type of report
		dryRun = false, //to check the mapping is in proper between feature file and step definition file
		monochrome  = true, //Display the console output in a proper readable format
		strict = true  //it will check if any steps is not defined in step definition file
		//tags = {"@SanityTest ", "~@RegressionTest", "~@End2EndTest"}, // execute all test tagged as @SanityTest OR @RegressionTest
		//tags = {"@SanityTest" , "@RegressionTest" , "@End2EndTest"}, // execute all test tagged as @SanityTest AND @RegressionTest
		//tags = {"~@SanityTest" , "~@RegressionTest" , "~@End2EndTest"} // Ignore all test cases from the feature file 
		//plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)

public class Runner {

}
