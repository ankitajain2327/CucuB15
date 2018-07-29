package com.radical.basic.cucumberpath.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					dryRun=true,   // it will give all the missing steps of step definition you can copy step def and paste it.
					
					features= {"src/test/resources/com/hooksFF/"},
					glue={"com/radical/basic/cucumberpath/hooksSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
