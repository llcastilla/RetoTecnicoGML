package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.AddRemoveElementsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarYEliminarElemento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddRemoveElementsPage.BTN_ADD_ELEMENT),
                Click.on(AddRemoveElementsPage.BTN_DELETE)
        );
    }

    public static AgregarYEliminarElemento ahora() {
        return instrumented(AgregarYEliminarElemento.class);
    }
}