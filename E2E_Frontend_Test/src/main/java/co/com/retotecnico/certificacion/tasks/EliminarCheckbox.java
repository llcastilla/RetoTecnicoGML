package co.com.retotecnico.certificacion.tasks;

import co.com.retotecnico.certificacion.userinterfaces.DynamicControlsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarCheckbox implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DynamicControlsPage.CHECKBOX),
                Click.on(DynamicControlsPage.BOTON_REMOVE),
                WaitUntil.the(DynamicControlsPage.BOTON_ADD, isVisible())
        );
    }

    public static EliminarCheckbox ahora() {
        return instrumented(EliminarCheckbox.class);
    }
}
