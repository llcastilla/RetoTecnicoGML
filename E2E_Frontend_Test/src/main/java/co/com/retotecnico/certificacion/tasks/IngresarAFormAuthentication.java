package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.FormAuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAFormAuthentication implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormAuthenticationPage.LINK_FORM_AUTHENTICATION)
        );
    }

    public static IngresarAFormAuthentication ahora() {
        return instrumented(IngresarAFormAuthentication.class);
    }
}
