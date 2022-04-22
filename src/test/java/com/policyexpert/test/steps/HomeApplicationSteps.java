package com.policyexpert.test.steps;

import com.policyexpert.test.about.AboutYou;
import com.policyexpert.test.navigation.OpenHomeApplication;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HomeApplicationSteps {
    @When("{actor} opens {string} browser to the policy expert home application page")
    public void opensBrowserToThePolicyExpertHomeApplicationPage(Actor actor, String ignoredPronoun) {
        actor.attemptsTo(OpenHomeApplication.page());
    }

    @Then("{actor} sees the About You form displayed")
    public void seesTheAboutYouFormDisplayed(Actor actor) {
        actor.attemptsTo(Ensure.that(AboutYou.HEADING).hasText("1. About me"));
    }
}
