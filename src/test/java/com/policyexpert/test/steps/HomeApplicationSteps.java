package com.policyexpert.test.steps;

import com.policyexpert.test.about.AboutYouTasks.Submit;
import com.policyexpert.test.stringutils.DateFromString;
import com.policyexpert.test.about.AboutYou;
import com.policyexpert.test.navigation.OpenHomeApplication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kotlin.jvm.functions.Function1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import com.policyexpert.test.about.AboutYouData;
import net.serenitybdd.screenplay.ensure.PerformableExpectation;
import org.jetbrains.annotations.NotNull;

import static com.policyexpert.test.about.AboutYou.*;
import static com.policyexpert.test.about.OtherResidents.CheckTheyAreOnTheOtherResidentsPage;

public class HomeApplicationSteps {

    @When("{actor} opens {string} browser to the policy expert home application page")
    public void opensBrowserToThePolicyExpertHomeApplicationPage(Actor actor, String ignoredPronoun) {
        actor.attemptsTo(OpenHomeApplication.page());
    }

    @Then("{actor} sees the About You form displayed")
    public void seesTheAboutYouFormDisplayed(Actor actor) {
        actor.attemptsTo(ChecksTheyAreOnTheAboutYouPage());
    }

    @Given("{actor} is on the About You form")
    public void isOnTheAboutYouForm(Actor actor) {
        actor.attemptsTo(OpenHomeApplication.page(), ChecksTheyAreOnTheAboutYouPage());
    }



    @When("{actor} enters this data in the About You form:-")
    public void entersThisDataInTheAboutYouForm(Actor actor, AboutYouData data) {
        actor.attemptsTo(Submit.AboutYouData(data));
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

    @And("{actor} has entered {string} as {string} date of birth")
    public void hasEnteredAsDateOfBirth(Actor actor, String dob, String ignoredPronoun) {
        DateFromString dateOfBirth = new DateFromString(dob);
        actor.attemptsTo(Enter.theValue(dateOfBirth.getDay()).into(AboutYou.DobDay));
        actor.attemptsTo(Enter.theValue(dateOfBirth.getMonth()).into(AboutYou.DobMonth));
        actor.attemptsTo(Enter.theValue(dateOfBirth.getYear()).into(AboutYou.DobYear));
    }

    @And("{actor} has selected {string} as {string} marital status")
    public void hasSelectedAsMaritalStatus(Actor actor, String maritalStatus, String ignoredPronoun) {
        actor.attemptsTo(Click.on(getMaritalStatusButton(maritalStatus)));
    }

    @And("{actor} has selected {string} as {string} occupation")
    public void hasSelectedAsOccupation(Actor actor, String occupation, String ignoredPronoun) {
        actor.attemptsTo(Enter.theValue(occupation).into(AboutYou.OccupationSearch));
        actor.attemptsTo(Click.on(OCCUPATION_SEARCH_RESULT_OPTION));
    }

    @And("{actor} has selected {string} from the other occupations question")
    public void hasSelectedFromTheOtherOccupationsQuestion(Actor actor, String otherOccupations) {
        actor.attemptsTo(Click.on(AboutYou.OtherOccupations(otherOccupations)));
    }

    @And("{actor} has entered {string} as {string} primary phone number")
    public void hasEnteredAsPrimaryPhoneNumber(Actor actor, String phoneNumber, String ignoredPronoun) {
        actor.attemptsTo(Enter.theValue(phoneNumber).into(AboutYou.PrimaryPhoneNumber));
    }

    @And("{actor} has entered {string} as {string} email address")
    public void hasEnteredAsEmailAddress(Actor actor, String email, String ignoredPronoun) {
        actor.attemptsTo(Enter.theValue(email).into(AboutYou.CustomerEmail));

    }

    @And("{actor} clicks the Next button on the About You form")
    public void clicksTheNextButtonOnTheAboutYouForm(Actor actor) {
        actor.attemptsTo(Click.on(AboutYou.Next));
    }

    @Then("{actor} is redirected to the other residents page")
    public void isRedirectedToTheOtherResidentsPage(Actor actor) {
        actor.attemptsTo(CheckTheyAreOnTheOtherResidentsPage());
    }


}
