package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\SeleniumTheoryOct\\Selenium\\src\\features\\OrangeLogin.feature",
                  glue="stepdefination",monochrome=true,
                  plugin= {"pretty","json:Target/Orange Login/Login.json"})
public class LoginRun
{

}
