package com.policyexpert.test.steps;

import com.policyexpert.test.about.AboutYou;
import com.policyexpert.test.navigation.OpenHomeApplication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.policyexpert.test.about.AboutYou.getTitleButton;

public class HomeApplicationSteps {
    @When("{actor} opens {string} browser to the policy expert home application page")
    public void opensBrowserToThePolicyExpertHomeApplicationPage(Actor actor, String ignoredPronoun) {
        actor.attemptsTo(OpenHomeApplication.page());
    }

    @Then("{actor} sees the About You form displayed")
    public void seesTheAboutYouFormDisplayed(Actor actor) {
        actor.attemptsTo(Ensure.that(AboutYou.HEADING).hasText("1. About you"));
    }

    @Given("{actor} is on the About You form")
    public void isOnTheAboutYouForm(Actor actor) {
        actor.attemptsTo(OpenHomeApplication.page(),Ensure.that(AboutYou.HEADING).hasText("1. About you"));
    }

    @And("{actor} has selected {string} title as {string}")
    public void hasSelectedTitleAs(Actor actor, String ignoredPronoun, String title) {
        //to do - create enumeration of titles? title abstraction?
        actor.attemptsTo(Click.on(getTitleButton(title)));
    }

    @And("{actor} has entered {string} as {string} first name")
    public void hasEnteredAsFirstName(Actor actor, String firstName, String ignoredPronoun) {
        actor.attemptsTo(Enter.theValue(firstName).into(AboutYou.FirstName));
    }

    @And("{actor} has entered {string} as {string} last name")
    public void hasEnteredAsLastName(Actor actor, String lastName, String ignoredPronoun) {
        actor.attemptsTo(Enter.theValue(lastName).into(AboutYou.LastName));
    }
}
