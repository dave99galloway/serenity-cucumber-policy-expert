package com.policyexpert.test.about;

import kotlin.jvm.functions.Function1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.PerformableExpectation;
import net.serenitybdd.screenplay.targets.Target;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class OtherResidents {
    public static final Target NoDeclarations =Target
            .the("No Declarations button")
            //todo: lots of buttons are selected exactly like this but with different string values - create a method to create them dynamically
            .located(By.cssSelector("button[aria-label='No']"));
    public static final Target Next = Target.the("Next button")
            //todo: this is an identical selector to the next button on the previous page.
            // either create a function to return Next buttons or compose the page with a common field describing a next button.
            // Since we are using statics, using a function is the simplest solution
            .located(By.cssSelector("div[class^='Sectionstyle__NavigationForward'] button[class^='styled__PrimaryButton']"));

    @NotNull
    public static PerformableExpectation<Function1<Actor, Comparable<String>>, String> CheckTheyAreOnTheOtherResidentsPage() {
        //todo: the selector for the headings is exactly the same on page 1 & 2 so some synchronisation may be needed to wait for the state change
        return Ensure.that(AboutYou.HEADING).hasText("2. About you and other residents");
    }
}
