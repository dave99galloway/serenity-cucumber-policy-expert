package com.policyexpert.test.about;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.policyexpert.test.about.AboutYou.*;

public class AboutYouTasks {

    public static class Submit {
        public static Performable AboutYouData(AboutYouData data) {
            return Task.where("{0} enters data in the About You form",
                    //todo: define custom steps for each of these to enhance reporting
                    Click.on(getTitleButton(data.getTitle())),
                    Enter.theValue(data.getFirstname()).into(AboutYou.FirstName),
                    Enter.theValue(data.getLastname()).into(AboutYou.LastName),
                    Enter.theValue(data.getDob().getDay()).into(AboutYou.DobDay),
                    Enter.theValue(data.getDob().getMonth()).into(AboutYou.DobMonth),
                    Enter.theValue(data.getDob().getYear()).into(AboutYou.DobYear),
                    Click.on(getMaritalStatusButton(data.getMaritalStatus())),
                    Enter.theValue(data.getOccupation()).into(AboutYou.OccupationSearch),
                    Click.on(OCCUPATION_SEARCH_RESULT_OPTION),
                    Click.on(AboutYou.OtherOccupations(data.getOtherOccupations())),
                    Enter.theValue(data.getPhoneNumber()).into(AboutYou.PrimaryPhoneNumber),
                    Enter.theValue(data.getEmail()).into(AboutYou.CustomerEmail),
                    //todo: split this task into enter data and submit so that checks for validation errors can be done
                    Click.on(AboutYou.Next)
            );
        }
    }
}
