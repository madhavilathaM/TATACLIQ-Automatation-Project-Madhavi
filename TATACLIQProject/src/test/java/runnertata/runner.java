package runnertata;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/tatafeature/tatacliq.feature"}, glue="defination",plugin ={"html:testoutput/cucumber.html"})
public class runner {

}
