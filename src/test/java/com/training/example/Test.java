package com.training.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class Test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="resources/RPN.feature", format= {"html:cucumber_report"})
//@CucumberOptions(features="resources")
public class Test {

}
