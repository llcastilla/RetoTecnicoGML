package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicControlsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarADynamicControls implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicControlsPage.LINK_DYNAMIC_CONTROLS)
        );
    }

    public static IngresarADynamicControls ahora() {
        return instrumented(IngresarADynamicControls.class);
    }
}
