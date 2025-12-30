package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.AddRemoveElementsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAAddRemove implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddRemoveElementsPage.LINK_ADD_REMOVE)
        );
    }

    public static IngresarAAddRemove ahora() {
        return instrumented(IngresarAAddRemove.class);
    }
}
