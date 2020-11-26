package com.aso.qa.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

//@RunWith(ExtendedCucumber.class)
//@ExtendedCucumberOptions(
//       jsonReport = "target/cucumber-reports/cucumber-html-reports/common.json",
//        usageReport = true,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        overviewChartsReport = true,
//        retryCount = 0)

@CucumberOptions(
		features = "src/test/resources/features/", 
		glue = "com.aso.qa.test.web.stepdefs",
		tags = "@Sample",
		monochrome = true,
//		dryRun = true,
		plugin ={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/Cucumber.json"}
		) 
public class TestWebRunner {

}
