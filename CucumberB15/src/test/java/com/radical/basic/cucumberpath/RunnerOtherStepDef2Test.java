package com.radical.basic.cucumberpath;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = {"src/test/resources/cucumberpath/OneFolder.feature"},//,"src/test/resources/cucumberpath/OneFolder2.feature"},
					glue = {"com/radical/basic/cucumberpath/"}
					
					)


public class RunnerOtherStepDef2Test {

}
