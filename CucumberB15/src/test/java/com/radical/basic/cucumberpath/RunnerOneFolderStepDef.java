package com.radical.basic.cucumberpath;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = {"src/test/resources/cucumberpath/"},
					glue = {"com/radical/basic/cucumberpath/"}
					
					)


public class RunnerOneFolderStepDef {

}
