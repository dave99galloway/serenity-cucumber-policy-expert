package com.policyexpert.test.about;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYou {
    public static final Target HEADING =  Target.the("Section Title").locatedBy("div[data-testid='questionsetMfe'] h2[class^='Sectionstyle']");

    public static SearchableTarget getTitleButton(String title) {
        return Target.the(title).located(By.cssSelector(String.format("button[aria-label='%s']", title)));
    }
}
