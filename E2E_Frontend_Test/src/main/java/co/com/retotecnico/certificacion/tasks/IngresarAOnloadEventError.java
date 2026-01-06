package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.OnloadEventErrorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAOnloadEventError implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OnloadEventErrorPage.LINK_ONLOAD_EVENT_ERROR)
        );
    }

    public static IngresarAOnloadEventError ahora() {
        return instrumented(IngresarAOnloadEventError.class);
    }
}
