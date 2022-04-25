package com.policyexpert.test.about;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYou {
    public static final Target HEADING =  Target.the("Section Title").locatedBy("div[data-testid='questionsetMfe'] h2[class^='Sectionstyle']");
    public static final Target FirstName = Target.the("First Name field").located(By.cssSelector("input#first_name"));
    public static final Target LastName = Target.the("Last Name field").located(By.cssSelector("input#last_name"));

    public static SearchableTarget getTitleButton(String title) {
        return Target.the(title).located(By.cssSelector(String.format("button[aria-label='%s']", title)));
    }
}
