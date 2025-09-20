package com.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.Stepdef",
        features = "src/test/resources/Features/AdactinHotel.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true,
        dryRun = false)
public class TestRunneradactin {

}