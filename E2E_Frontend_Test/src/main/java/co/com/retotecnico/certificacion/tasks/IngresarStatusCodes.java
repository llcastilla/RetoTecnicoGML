package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.StatusCodesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarStatusCodes implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StatusCodesPage.LINK_STATUS_CODES)
        );
    }

    public static IngresarStatusCodes ahora() {
        return instrumented(IngresarStatusCodes.class);
    }
}
