package com.radical.basic.cucumberpath.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,  // it removes all the garbage character
					//dryRun=true,
					
					features= {"src/test/resources/com/backgroundFF/"},
					glue={"com/radical/basic/cucumberpath/backgroundSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
