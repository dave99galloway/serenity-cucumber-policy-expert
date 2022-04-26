package com.policyexpert.test.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenHomeApplication {
    public static Performable page() {
        return Task.where("{0} opens the Policy Expert home application page",
                Open.browserOn().the(PolicyExpertHomeApplicationPage.class));
    }
}
