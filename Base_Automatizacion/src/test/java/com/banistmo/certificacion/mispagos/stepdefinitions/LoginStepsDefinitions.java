package com.banistmo.certificacion.mispagos.stepdefinitions;

import com.banistmo.certificacion.mispagos.questions.LoginValidateText;
import com.banistmo.certificacion.mispagos.tasks.LoginCredentials;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.banistmo.certificacion.mispagos.userinterfaces.Login.TEXT_ERROR;
import static com.banistmo.certificacion.mispagos.userinterfaces.Login.TEXT_SUCCESSFULL_LOGIN;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepsDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Select URL")
    public void SelectUrl() {
        OnStage.theActorCalled("User").
                wasAbleTo(Open.browserOn().thePageNamed("pages.urlMisPagos"));
    }

    @When("^Select add two Courses (.*) and (.*)$")
    public void LoginCredentialsError(String User, String Password) {
        theActorInTheSpotlight().attemptsTo(LoginCredentials.write(User, Password));
    }

    @Then("^Validate error text (.*)$")
    public void ValidateTextError(String Text) {
        theActorInTheSpotlight().should(seeThat(LoginValidateText.correct(TEXT_SUCCESSFULL_LOGIN),
                equalTo(Text)));
    }

    @Then("^Validate successfully text (.*)$")
    public void ValidateSuccessfullyText(String Text) {
        theActorInTheSpotlight().should(seeThat(LoginValidateText.correct(TEXT_ERROR),
                equalTo(Text)));
    }
}


