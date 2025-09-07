package com.banistmo.certificacion.mispagos.stepdefinitions.Login;

import com.banistmo.certificacion.mispagos.questions.LoginValidateText;

import com.banistmo.certificacion.mispagos.tasks.selectTheSearchClientTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.banistmo.certificacion.mispagos.userinterfaces.Login.TEXT_SUCCESSFULL_LOGIN;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class searchForClieinteStepDefinition {

    @When("^select the search client option$")
    public void selectTheSearchClientOption() {
        theActorInTheSpotlight().attemptsTo(selectTheSearchClientTask.search());
    }

    @Then("^Validate error text (.*)$")
    public void ValidateTextError(String Text) {
        theActorInTheSpotlight().should(seeThat(LoginValidateText.correct(TEXT_SUCCESSFULL_LOGIN),
                equalTo(Text)));
    }

}
