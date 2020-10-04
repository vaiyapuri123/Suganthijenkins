package com.runner1;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepp",dryRun=false,tags= {"@san"},plugin= {"html:target\\suga","json:target\\jsonrport.json"})

public class Run_Classsss1 {

}
