package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import base.baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\test\\java\\featurefile\\fb.feature")



public class runnerclass extends baseclass{
	
public static WebDriver test;
	
	@BeforeClass
	private void set_up() {
	test =  ((baseclass) driver).launchbrowser("chrome");
	}
	
}
	
	
	
	
	
	
	
	


