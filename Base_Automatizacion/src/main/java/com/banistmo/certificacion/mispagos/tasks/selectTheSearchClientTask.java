package com.banistmo.certificacion.mispagos.tasks;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.banistmo.certificacion.mispagos.userinterfaces.Login.*;

public class selectTheSearchClientTask implements Task, IsSilent {

    public static LoginCredentials search() {
        return Tasks.instrumented(LoginCredentials.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GET_INTO).afterWaitingUntilEnabled());
    }
}
