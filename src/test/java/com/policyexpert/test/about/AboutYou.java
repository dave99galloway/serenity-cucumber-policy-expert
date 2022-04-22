package com.policyexpert.test.about;

import net.serenitybdd.screenplay.targets.Target;

public class AboutYou {
    public static final Target HEADING =  Target.the("Section Title").locatedBy("div[data-testid='questionsetMfe'] h2[class^='Sectionstyle']");

}
