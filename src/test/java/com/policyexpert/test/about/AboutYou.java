package com.policyexpert.test.about;

import kotlin.jvm.functions.Function1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.PerformableExpectation;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class AboutYou {
    public static final Target HEADING =  Target.the("Section Title").located(By.cssSelector( "div[data-testid='questionsetMfe'] h2[class^='Sectionstyle']"));
    public static final Target FirstName = Target.the("First Name field").located(By.cssSelector("input#first_name"));
    public static final Target LastName = Target.the("Last Name field").located(By.cssSelector("input#last_name"));
    //todo: add method to create dob targets from their parts
    public static final Target DobDay = Target.the("Date Of Birth Day").located(By.cssSelector("input[id='policyholder_date_of_birth.day']"));
    public static final Target DobMonth = Target.the("Date Of Birth Month").located(By.cssSelector("input[id='policyholder_date_of_birth.month']"));
    public static final Target DobYear = Target.the("Date Of Birth Year").located(By.cssSelector("input[id='policyholder_date_of_birth.year']"));
    public static final Target OccupationSearch = Target.the("occupation field").located(By.cssSelector("input[name='occupation']"));
    public static final Target PrimaryPhoneNumber = Target.the("Main phone number").located(By.cssSelector("input#primary_phone_number"));
    public static final Target CustomerEmail = Target.the("What is your e-mail address? field").located(By.cssSelector("input#customer_email"));
    public static final Target Next = Target.the("Next button").located(By.cssSelector("div[class^='Sectionstyle__NavigationForward'] button[class^='styled__PrimaryButton']"));

    public static final Target OCCUPATION_SEARCH_RESULT_OPTION =
            //todo: get list of matches and iterate over them until an exact text match is found. first match will do for now
            Target.the("occupation search result option").located(By.cssSelector("ul > li"));

    public static SearchableTarget getTitleButton(String title) {
        return Target.the(title).located(By.cssSelector(String.format("button[aria-label='%s']", title)));
    }
    public static SearchableTarget getMaritalStatusButton(String status) {
        return Target.the(String.format("'%s' status button", status)).located(By.cssSelector(String.format("button[aria-label='%s']", status)));
    }
    public static Target OtherOccupations(String otherOccupations) {
        return Target.the("Do you have another occupation as well?")
                .located(By.cssSelector(String.format("button[aria-label='%s']", otherOccupations)));
    }

    @NotNull
    public static PerformableExpectation<Function1<Actor, Comparable<String>>, String> ChecksTheyAreOnTheAboutYouPage() {
        return Ensure.that(AboutYou.HEADING).hasText("1. About you");
    }
}
