package com.policyexpert.test.steps;

import com.policyexpert.test.about.AboutYou;
import com.policyexpert.test.about.AboutYouTasks;
import com.policyexpert.test.about.OtherResidents;
import com.policyexpert.test.navigation.OpenHomeApplication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.policyexpert.test.about.AboutYou.ChecksTheyAreOnTheAboutYouPage;
import static com.policyexpert.test.about.AboutYouTasks.*;
import static com.policyexpert.test.about.OtherResidents.CheckTheyAreOnTheOtherResidentsPage;

public class YouAndOtherResidentsSteps {
    @Given("{actor} has completed the About You page")
    public void hasCompletedTheAboutYouPage(Actor actor) {
        //todo: this is a suspicious combination of steps - refactor into something better
        actor.attemptsTo(OpenHomeApplication.page(), ChecksTheyAreOnTheAboutYouPage());
        //todo: add overload accepting AboutYouData overriding default data
        actor.attemptsTo(Submit.AboutYouData());
        actor.attemptsTo(CheckTheyAreOnTheOtherResidentsPage());
    }

    @And("{actor} has confirmed there are no declarations to make")
    public void confirmsThereAreNoDeclarationsToMake(Actor actor) {
        actor.attemptsTo(Click.on(OtherResidents.NoDeclarations));
    }

    @When("{actor} the Next button on the About You and other residents form")
    public void theNextButtonOnTheAboutYouAndOtherResidentsForm(Actor actor) {
        actor.attemptsTo(Click.on(OtherResidents.Next));
    }

    @Then("{actor} is redirected to the About Your Property page")
    public void isRedirectedToTheAboutYourPropertyPage(Actor actor) {
        //todo: note this is the 3rd use of this target on 3 different pages, either extract to a common page or create a method
        actor.attemptsTo(Ensure.that(AboutYou.HEADING).hasText("3. About your property"));
    }
}
